package com.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Device {

    @Id
    private Long id;
    private Integer batteryPower;
    private Boolean blue;
    private Double clockSpeed;
    private Boolean dualSim;
    private Integer fc;
    private Boolean fourG;
    private Integer intMemory;
    private Double mDep;
    private Integer mobileWt;
    private Integer nCores;
    private Integer pc;
    private Integer pxHeight;
    private Integer pxWidth;
    private Integer ram;
    private Integer scH;
    private Integer scW;
    private Integer talkTime;
    private Boolean threeG;
    private Boolean touchScreen;
    private Boolean wifi;
    private Integer priceRange;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }
    public Boolean getFourG() {
        return fourG;
    }

    public void setFourG(Boolean fourG) {
        this.fourG = fourG;
    }

    public Integer getIntMemory() {
        return intMemory;
    }

    public void setIntMemory(Integer intMemory) {
        this.intMemory = intMemory;
    }

    public Double getMDep() {
        return mDep;
    }

    public void setMDep(Double mDep) {
        this.mDep = mDep;
    }

    public Integer getMobileWt() {
        return mobileWt;
    }

    public void setMobileWt(Integer mobileWt) {
        this.mobileWt = mobileWt;
    }

    public Integer getNCores() {
        return nCores;
    }

    public void setNCores(Integer nCores) {
        this.nCores = nCores;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public Integer getPxHeight() {
        return pxHeight;
    }

    public void setPxHeight(Integer pxHeight) {
        this.pxHeight = pxHeight;
    }

    public Integer getPxWidth() {
        return pxWidth;
    }

    public void setPxWidth(Integer pxWidth) {
        this.pxWidth = pxWidth;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getScH() {
        return scH;
    }

    public void setScH(Integer scH) {
        this.scH = scH;
    }

    public Integer getScW() {
        return scW;
    }

    public void setScW(Integer scW) {
        this.scW = scW;
    }

    public Integer getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(Integer talkTime) {
        this.talkTime = talkTime;
    }

    public Boolean getThreeG() {
        return threeG;
    }

    public void setThreeG(Boolean threeG) {
        this.threeG = threeG;
    }

    public Boolean getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Integer getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }
}