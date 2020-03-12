/**
 * 应用程序起点
 */

function setPage(data, pageBox, pageNoInp) {
    pageNoInp.val(data.pageNum);
    pageNoInp.nextAll().remove();
    if (data.pageNum == 1) {
        pageBox.append('<span class="page firstP">首页</span><span class="page beforeP">上一页</span>');
    } else if (data.pageNum > 1) {
        pageBox.append('<span class="page firstP pageA" onclick="search(1)">首页</span><span class="page beforeP pageA" onclick="search(' + (data.pageNum - 1) + ')">上一页</span>');
    }
    if (data.totalPages < 5) {
        for (i = 1; i < data.totalPages + 1; i++) {
            if (i == data.pageNum) {
                pageBox.append('<span class="page numP" id="' + i + '">' + i + '</span>');
            } else {
                pageBox.append('<span class="page numP pageA" id="' + i + '" onclick="search(' + i + ')">' + i + '</span>');
            }
        }
    } else if (data.totalPages > 5 && data.pageNo <= 3) {
        for (i = 1; i < 6; i++) {
            if (i == data.pageNum) {
                pageBox.append('<span class="page numP" id="' + i + '">' + i + '</span>');
            } else {
                pageBox.append('<span class="page numP pageA" id="' + i + '" onclick="search(' + i + ')">' + i + '</span>');
            }
        }
    }
    pageBox.append('<span class="page countP">第' + data.pageNum + '/' + data.totalPages + '页（共' + data.totalSize + '条结果）</span>');
    if (data.totalPages > 5) {
        if (data.pageNum >= 4 && data.pageNum <= data.totalPages - 2) {
            for (i = data.pageNum - 2; i < data.pageNum + 3; i++) {
                if (i == data.pageNum) {
                    pageBox.append('<span class="page numP" id="' + i + '">' + i + '</span>');
                } else {
                    pageBox.append('<span class="page numP pageA" id="' + i + '" onclick="search(' + i + ')">' + i + '</span>');
                }
            }
        } else if (data.pageNum > data.totalPages - 2) {
            for (i = data.pageNum - 4; i < data.pageNum + 1; i++) {
                if (i == data.pageNum) {
                    pageBox.append('<span class="page numP" id="' + i + '">' + i + '</span>');
                } else {
                    pageBox.append('<span class="page numP pageA" id="' + i + '" onclick="search(' + i + ')">' + i + '</span>');
                }
            }
        }
    }
    if (data.pageNum == data.totalPages) {
        pageBox.append('<span class="page afterP">下一页</span><span class="page lastP">尾页</span>');
    } else {
        pageBox.append('<span class="page afterP pageA" onclick="search(' + (data.pageNum + 1) + ')">下一页</span><span class="page lastP pageA" onclick="search(' + data.totalPages + ')">尾页</span>');
    }
}

function dialogueOpen(id) {
    $("#" + id).slideDown(300);
    $(".mask").show();
}

function dialogueClose(id) {
    $("#" + id).slideUp(300);
    $(".mask").hide();
}

Date.prototype.format = function (fmt) {
    const o = {
        "M+": this.getMonth() + 1,                 //月份
        "d+": this.getDate(),                    //日
        "h+": this.getHours(),                   //小时
        "m+": this.getMinutes(),                 //分
        "s+": this.getSeconds(),                 //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (let k in o) {
        if (new RegExp("(" + k + ")").test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length === 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        }
    }
    return fmt;
}

function nullToZero(obj) {
    if (obj == null) {
        return 0;
    } else {
        return obj;
    }
}