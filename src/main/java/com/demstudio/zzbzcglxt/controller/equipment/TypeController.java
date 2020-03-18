package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Type;
import com.demstudio.zzbzcglxt.domain.TypeExample;
import com.demstudio.zzbzcglxt.service.equipment.TypeService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.TypeExtend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/equipment/type")
@Controller
public class TypeController {

    @Resource
    private TypeService typeService;

    @GetMapping("/index")
    public String index() {
        return "equipment/type";
    }

    @GetMapping("/search")
    @ResponseBody
    public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String typeName) {
        TypeExample example = new TypeExample();
        if (typeName != null && !"".equals(typeName)) {
            example.createCriteria().andTypeNameLike("%" + typeName + "%");
        }
        example.setOrderByClause("TYPE_NAME ASC");
        return typeService.searchPage(pageRequest, example);
    }

    @GetMapping("/info")
    @ResponseBody
    public Type info(String typeId) {
        return typeService.info(typeId);
    }

    @PostMapping("/edit")
    @ResponseBody
    public Message edit(Type type) {
        if (typeService.edit(type)) {
            return new Message(true, "保存成功");
        } else {
            return new Message(false, "保存失败");
        }
    }

    @GetMapping("/list")
    @ResponseBody
    public List<TypeExtend> list(Type type) {
        return typeService.list(type);
    }
}
