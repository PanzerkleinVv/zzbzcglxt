package com.demstudio.zzbzcglxt.domain;

public class Terminal {
    private String terminalId;

    private String terminalName;

    private Integer ip0;

    private Integer ip1;

    private Integer ip2;

    private Integer ip3;

    private String terminalDesc;

    private String terminalSystem;

    private String terminalOwner;

    private String terminalSegment;

    private String terminalRoom;

    private String terminalSecrecy;

    private String terminalSwitch;

    private String terminalType;

    public Terminal(String terminalId, String terminalName, Integer ip0, Integer ip1, Integer ip2, Integer ip3, String terminalDesc, String terminalSystem, String terminalOwner, String terminalSegment, String terminalRoom, String terminalSecrecy, String terminalSwitch, String terminalType) {
        this.terminalId = terminalId;
        this.terminalName = terminalName;
        this.ip0 = ip0;
        this.ip1 = ip1;
        this.ip2 = ip2;
        this.ip3 = ip3;
        this.terminalDesc = terminalDesc;
        this.terminalSystem = terminalSystem;
        this.terminalOwner = terminalOwner;
        this.terminalSegment = terminalSegment;
        this.terminalRoom = terminalRoom;
        this.terminalSecrecy = terminalSecrecy;
        this.terminalSwitch = terminalSwitch;
        this.terminalType = terminalType;
    }

    public Terminal() {
        super();
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName == null ? null : terminalName.trim();
    }

    public Integer getIp0() {
        return ip0;
    }

    public void setIp0(Integer ip0) {
        this.ip0 = ip0;
    }

    public Integer getIp1() {
        return ip1;
    }

    public void setIp1(Integer ip1) {
        this.ip1 = ip1;
    }

    public Integer getIp2() {
        return ip2;
    }

    public void setIp2(Integer ip2) {
        this.ip2 = ip2;
    }

    public Integer getIp3() {
        return ip3;
    }

    public void setIp3(Integer ip3) {
        this.ip3 = ip3;
    }

    public String getTerminalDesc() {
        return terminalDesc;
    }

    public void setTerminalDesc(String terminalDesc) {
        this.terminalDesc = terminalDesc == null ? null : terminalDesc.trim();
    }

    public String getTerminalSystem() {
        return terminalSystem;
    }

    public void setTerminalSystem(String terminalSystem) {
        this.terminalSystem = terminalSystem == null ? null : terminalSystem.trim();
    }

    public String getTerminalOwner() {
        return terminalOwner;
    }

    public void setTerminalOwner(String terminalOwner) {
        this.terminalOwner = terminalOwner == null ? null : terminalOwner.trim();
    }

    public String getTerminalSegment() {
        return terminalSegment;
    }

    public void setTerminalSegment(String terminalSegment) {
        this.terminalSegment = terminalSegment == null ? null : terminalSegment.trim();
    }

    public String getTerminalRoom() {
        return terminalRoom;
    }

    public void setTerminalRoom(String terminalRoom) {
        this.terminalRoom = terminalRoom == null ? null : terminalRoom.trim();
    }

    public String getTerminalSecrecy() {
        return terminalSecrecy;
    }

    public void setTerminalSecrecy(String terminalSecrecy) {
        this.terminalSecrecy = terminalSecrecy == null ? null : terminalSecrecy.trim();
    }

    public String getTerminalSwitch() {
        return terminalSwitch;
    }

    public void setTerminalSwitch(String terminalSwitch) {
        this.terminalSwitch = terminalSwitch == null ? null : terminalSwitch.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public static TerminalExample toExample(String ip, String terminalType) {
        TerminalExample example = new TerminalExample();
        TerminalExample.Criteria criteria = example.createCriteria();
        if (ip != null && ip.length() > 6) {
            String[] ips = ip.split("\\.");
            if (!"".equals(ips[0]) && !"*".equals(ips[0])) {
                criteria.andIp3EqualTo(new Integer(ips[0]));
                if (!"".equals(ips[1]) && !"*".equals(ips[1])) {
                    criteria.andIp2EqualTo(new Integer(ips[1]));
                    if (!"".equals(ips[2]) && !"*".equals(ips[2])) {
                        criteria.andIp1EqualTo(new Integer(ips[2]));
                        if (!"".equals(ips[3]) && !"*".equals(ips[3])) {
                            criteria.andIp0EqualTo(new Integer(ips[3]));
                        }
                    }
                }
            }
        }
        criteria.andTerminalTypeEqualTo(terminalType);
        example.setOrderByClause("ip3 asc, ip2 asc, ip1 asc, ip0 asc");
        return example;
    }
}