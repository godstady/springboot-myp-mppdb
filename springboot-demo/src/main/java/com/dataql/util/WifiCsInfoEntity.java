package com.dataql.util;

import java.util.Date;

public class WifiCsInfoEntity {

    /**场所编码*/
    private String serviceCode;
    /**场所名称*/
    private String serviceName;
    /**地址*/
    private String address;
    /**邮编*/
    private String zip;
    /**场所性质*/
    private String businessNature;
    /**负责人姓名*/
    private String principal;
    /**负责人电话*/
    private String principalTel;
    /**信息安全员*/
    private String inforMan;
    /**信息安全员电话*/
    private String inforManTel;
    /**信息安全员邮编*/
    private String inforManEmail;
    /**运营商代码*/
    private String producerCode;
    /**场所服务状态*/
    private String status;
    /**终端数*/
    private String endingNumber;
    /**服务器数*/
    private String serverNumber;
    /**出口IP地址*/
    private String exitIp;
    /**网络认证账号*/
    private String authAccount;
    /**接入方式*/
    private String netType;
    /**从业人数*/
    private String practitionerNumber;
    /**所属网监部门*/
    private String netMonitorDepartment;
    /**网监负责人*/
    private String netMonitorMan;
    /**网监负责人电话*/
    private String netMonitorManTel;
    /**备注*/
    private String remark;
    /**场所类型*/
    private String serviceType;
    /**所属省*/
    private String provinceCode;
    /**所属市*/
    private String cityCode;
    /**所属县*/
    private String areaCode;
    /**中心类型*/
    private String cityType;
    /**派出所编码*/
    private String policeCode;
    /**接收邮箱地址*/
    private String mailAccount;
    /**接收手机号*/
    private String mobileAccount;
    /**场所地图经度*/
    private String xpoint;
    /**场所地图纬度*/
    private String ypoint;
    /**场所在GIS系统中的X坐标*/
    private String gisXpoint;
    /**场所在GIS系统中的Y坐标*/
    private String gisYpoint;
    /**终端安全厂商统一社会信用代码*/
    private String terminalFactoryOrgcode;
    /**场所信用代码*/
    private String orgCode;
    /**IP分配方式*/
    private String ipType;
    /**带宽*/
    private String bandWidth;
    /**下级网络*/
    private String netLan;
    /**下级网络上网电脑*/
    private String netLanTerminal;
    /**是否安全措施*/
    private String isSafe;
    /**无线接入用户数*/
    private String wifiTerminal;
    /**法人证件类型*/
    private String principalCertType;
    /**法人证件号码*/
    private String principalCertCode;
    /**场所负责人*/
    private String personName;
    /**场所负责人手机号*/
    private String personTel;
    /**场所负责人QQ*/
    private String personQq;
    /**信息安全员QQ*/
    private String inforManQq;
    /**开始时间*/
    private Date startTime;
    /**结束时间*/
    private Date endTime;
    /**创建时间*/
    private Date createTime;
    /**采集类型*/
    private String capType;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalTel() {
        return principalTel;
    }

    public void setPrincipalTel(String principalTel) {
        this.principalTel = principalTel;
    }

    public String getInforMan() {
        return inforMan;
    }

    public void setInforMan(String inforMan) {
        this.inforMan = inforMan;
    }

    public String getInforManTel() {
        return inforManTel;
    }

    public void setInforManTel(String inforManTel) {
        this.inforManTel = inforManTel;
    }

    public String getInforManEmail() {
        return inforManEmail;
    }

    public void setInforManEmail(String inforManEmail) {
        this.inforManEmail = inforManEmail;
    }

    public String getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(String producerCode) {
        this.producerCode = producerCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEndingNumber() {
        return endingNumber;
    }

    public void setEndingNumber(String endingNumber) {
        this.endingNumber = endingNumber;
    }

    public String getServerNumber() {
        return serverNumber;
    }

    public void setServerNumber(String serverNumber) {
        this.serverNumber = serverNumber;
    }

    public String getExitIp() {
        return exitIp;
    }

    public void setExitIp(String exitIp) {
        this.exitIp = exitIp;
    }

    public String getAuthAccount() {
        return authAccount;
    }

    public void setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getPractitionerNumber() {
        return practitionerNumber;
    }

    public void setPractitionerNumber(String practitionerNumber) {
        this.practitionerNumber = practitionerNumber;
    }

    public String getNetMonitorDepartment() {
        return netMonitorDepartment;
    }

    public void setNetMonitorDepartment(String netMonitorDepartment) {
        this.netMonitorDepartment = netMonitorDepartment;
    }

    public String getNetMonitorMan() {
        return netMonitorMan;
    }

    public void setNetMonitorMan(String netMonitorMan) {
        this.netMonitorMan = netMonitorMan;
    }

    public String getNetMonitorManTel() {
        return netMonitorManTel;
    }

    public void setNetMonitorManTel(String netMonitorManTel) {
        this.netMonitorManTel = netMonitorManTel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public String getPoliceCode() {
        return policeCode;
    }

    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    public String getMailAccount() {
        return mailAccount;
    }

    public void setMailAccount(String mailAccount) {
        this.mailAccount = mailAccount;
    }

    public String getMobileAccount() {
        return mobileAccount;
    }

    public void setMobileAccount(String mobileAccount) {
        this.mobileAccount = mobileAccount;
    }

    public String getXpoint() {
        return xpoint;
    }

    public void setXpoint(String xpoint) {
        this.xpoint = xpoint;
    }

    public String getYpoint() {
        return ypoint;
    }

    public void setYpoint(String ypoint) {
        this.ypoint = ypoint;
    }

    public String getGisXpoint() {
        return gisXpoint;
    }

    public void setGisXpoint(String gisXpoint) {
        this.gisXpoint = gisXpoint;
    }

    public String getGisYpoint() {
        return gisYpoint;
    }

    public void setGisYpoint(String gisYpoint) {
        this.gisYpoint = gisYpoint;
    }

    public String getTerminalFactoryOrgcode() {
        return terminalFactoryOrgcode;
    }

    public void setTerminalFactoryOrgcode(String terminalFactoryOrgcode) {
        this.terminalFactoryOrgcode = terminalFactoryOrgcode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getNetLan() {
        return netLan;
    }

    public void setNetLan(String netLan) {
        this.netLan = netLan;
    }

    public String getNetLanTerminal() {
        return netLanTerminal;
    }

    public void setNetLanTerminal(String netLanTerminal) {
        this.netLanTerminal = netLanTerminal;
    }

    public String getIsSafe() {
        return isSafe;
    }

    public void setIsSafe(String isSafe) {
        this.isSafe = isSafe;
    }

    public String getWifiTerminal() {
        return wifiTerminal;
    }

    public void setWifiTerminal(String wifiTerminal) {
        this.wifiTerminal = wifiTerminal;
    }

    public String getPrincipalCertType() {
        return principalCertType;
    }

    public void setPrincipalCertType(String principalCertType) {
        this.principalCertType = principalCertType;
    }

    public String getPrincipalCertCode() {
        return principalCertCode;
    }

    public void setPrincipalCertCode(String principalCertCode) {
        this.principalCertCode = principalCertCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonTel() {
        return personTel;
    }

    public void setPersonTel(String personTel) {
        this.personTel = personTel;
    }

    public String getPersonQq() {
        return personQq;
    }

    public void setPersonQq(String personQq) {
        this.personQq = personQq;
    }

    public String getInforManQq() {
        return inforManQq;
    }

    public void setInforManQq(String inforManQq) {
        this.inforManQq = inforManQq;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCapType() {
        return capType;
    }

    public void setCapType(String capType) {
        this.capType = capType;
    }

    @Override
    public String toString() {
        return "WifiCsInfoEntity{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                ", businessNature='" + businessNature + '\'' +
                ", principal='" + principal + '\'' +
                ", principalTel='" + principalTel + '\'' +
                ", inforMan='" + inforMan + '\'' +
                ", inforManTel='" + inforManTel + '\'' +
                ", inforManEmail='" + inforManEmail + '\'' +
                ", producerCode='" + producerCode + '\'' +
                ", status='" + status + '\'' +
                ", endingNumber='" + endingNumber + '\'' +
                ", serverNumber='" + serverNumber + '\'' +
                ", exitIp='" + exitIp + '\'' +
                ", authAccount='" + authAccount + '\'' +
                ", netType='" + netType + '\'' +
                ", practitionerNumber='" + practitionerNumber + '\'' +
                ", netMonitorDepartment='" + netMonitorDepartment + '\'' +
                ", netMonitorMan='" + netMonitorMan + '\'' +
                ", netMonitorManTel='" + netMonitorManTel + '\'' +
                ", remark='" + remark + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", cityType='" + cityType + '\'' +
                ", policeCode='" + policeCode + '\'' +
                ", mailAccount='" + mailAccount + '\'' +
                ", mobileAccount='" + mobileAccount + '\'' +
                ", xpoint='" + xpoint + '\'' +
                ", ypoint='" + ypoint + '\'' +
                ", gisXpoint='" + gisXpoint + '\'' +
                ", gisYpoint='" + gisYpoint + '\'' +
                ", terminalFactoryOrgcode='" + terminalFactoryOrgcode + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", ipType='" + ipType + '\'' +
                ", bandWidth='" + bandWidth + '\'' +
                ", netLan='" + netLan + '\'' +
                ", netLanTerminal='" + netLanTerminal + '\'' +
                ", isSafe='" + isSafe + '\'' +
                ", wifiTerminal='" + wifiTerminal + '\'' +
                ", principalCertType='" + principalCertType + '\'' +
                ", principalCertCode='" + principalCertCode + '\'' +
                ", personName='" + personName + '\'' +
                ", personTel='" + personTel + '\'' +
                ", personQq='" + personQq + '\'' +
                ", inforManQq='" + inforManQq + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                ", capType='" + capType + '\'' +
                '}';
    }
}
