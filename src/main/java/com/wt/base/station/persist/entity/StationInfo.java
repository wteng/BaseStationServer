package com.wt.base.station.persist.entity;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 18:51   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
public class StationInfo {

    int id;
    String stationName;
    String addressQu;
    String address;
    String latitude;
    String longtitude;
    int platformNumber;
    String tianxianPlatform;
    String fangweijiao;
    String jixieXiaqingjiao;
    String dianziXiaqingjiao;
    String stationHeight;
    boolean beautifulTianxian;
    String tianxianType;
    String floor;
    String wirelessCompany;
    String tianxianModel;
    String RRULocation;
    boolean haveCnetDevice;
    String cNetDeviceModel;
    boolean hasFarther;
    boolean roomShare;
    boolean hasAirConditioning;
    boolean hasBattery;
    String question;
    String picPath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAddressQu() {
        return addressQu;
    }

    public void setAddressQu(String addressQu) {
        this.addressQu = addressQu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public String getTianxianPlatform() {
        return tianxianPlatform;
    }

    public void setTianxianPlatform(String tianxianPlatform) {
        this.tianxianPlatform = tianxianPlatform;
    }

    public String getFangweijiao() {
        return fangweijiao;
    }

    public void setFangweijiao(String fangweijiao) {
        this.fangweijiao = fangweijiao;
    }

    public String getJixieXiaqingjiao() {
        return jixieXiaqingjiao;
    }

    public void setJixieXiaqingjiao(String jixieXiaqingjiao) {
        this.jixieXiaqingjiao = jixieXiaqingjiao;
    }

    public String getDianziXiaqingjiao() {
        return dianziXiaqingjiao;
    }

    public void setDianziXiaqingjiao(String dianziXiaqingjiao) {
        this.dianziXiaqingjiao = dianziXiaqingjiao;
    }

    public String getStationHeight() {
        return stationHeight;
    }

    public void setStationHeight(String stationHeight) {
        this.stationHeight = stationHeight;
    }

    public boolean isBeautifulTianxian() {
        return beautifulTianxian;
    }

    public void setBeautifulTianxian(boolean beautifulTianxian) {
        this.beautifulTianxian = beautifulTianxian;
    }

    public boolean isHaveCnetDevice() {
        return haveCnetDevice;
    }

    public void setHaveCnetDevice(boolean haveCnetDevice) {
        this.haveCnetDevice = haveCnetDevice;
    }

    public boolean isHasFarther() {
        return hasFarther;
    }

    public void setHasFarther(boolean hasFarther) {
        this.hasFarther = hasFarther;
    }

    public boolean isRoomShare() {
        return roomShare;
    }

    public void setRoomShare(boolean roomShare) {
        this.roomShare = roomShare;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public String getTianxianType() {
        return tianxianType;
    }

    public void setTianxianType(String tianxianType) {
        this.tianxianType = tianxianType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getTianxianModel() {
        return tianxianModel;
    }

    public void setTianxianModel(String tianxianModel) {
        this.tianxianModel = tianxianModel;
    }

    public String getRRULocation() {
        return RRULocation;
    }

    public void setRRULocation(String RRULocation) {
        this.RRULocation = RRULocation;
    }

    public String getWirelessCompany() {
        return wirelessCompany;
    }

    public void setWirelessCompany(String wirelessCompany) {
        this.wirelessCompany = wirelessCompany;
    }

    public String getcNetDeviceModel() {
        return cNetDeviceModel;
    }

    public void setcNetDeviceModel(String cNetDeviceModel) {
        this.cNetDeviceModel = cNetDeviceModel;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
