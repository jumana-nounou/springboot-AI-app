package com.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "test")
public class Device {

    @Id
    private Integer _id;

    @Field("battery_power")
    @JsonProperty("battery_power")

    private Integer batteryPower;

    @Field("blue")
    @JsonProperty("blue")
    private Boolean blue;

    @Field("clock_speed")
    @JsonProperty("clock_speed")

    private Double clockSpeed;

    @Field("dual_sim")
    @JsonProperty("dual_sim")

    private Boolean dualSim;

    @Field("fc")
    @JsonProperty("fc")

    private Integer fc;

    @Field("four_g")
    @JsonProperty("four_g")
    private Boolean fourG;

    @Field("int_memory")
        @JsonProperty("int_memory")

    private Integer intMemory;

    @Field("m_dep")
    @JsonProperty("m_dep")

    private Double mDep;

    @Field("mobile_wt")
    @JsonProperty("mobile_wt")

    private Integer mobileWt;

    @Field("n_cores")
    @JsonProperty("n_cores")

    private Integer nCores;

    @Field("pc")
    @JsonProperty("pc")

    private Integer pc;

    @Field("px_height")
    @JsonProperty("px_height")

    private Integer pxHeight;

    @Field("px_width")
    @JsonProperty("px_width")

    private Integer pxWidth;

    @Field("ram")
    @JsonProperty("ram")

    private Integer ram;

    @Field("sc_h")
    @JsonProperty("sc_h")

    private Integer scH;

    @Field("sc_w")
    @JsonProperty("sc_w")

    private Integer scW;

    @Field("talk_time")
    @JsonProperty("talk_time")

    private Integer talkTime;

    @Field("three_g")
    @JsonProperty("three_g")

    private Boolean threeG;

    @Field("touch_screen")
    @JsonProperty("touch_screen")

    private Boolean touchScreen;

    @Field("wifi")
    @JsonProperty("wifi")

    private Boolean wifi;

    @Field("price_range")
    @JsonProperty("price_range")

    private Integer priceRange;

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    public Boolean getBlue() {
        return blue;
    }

    public void setBlue(Boolean blue) {
        this.blue = blue;
    }

    public Double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(Double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public Boolean getDualSim() {
        return dualSim;
    }

    public void setDualSim(Boolean dualSim) {
        this.dualSim = dualSim;
    }

    public Integer getFc() {
        return fc;
    }

    public void setFc(Integer fc) {
        this.fc = fc;
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

    public void setPredictedPrice(double predictedPrice) {
        this.priceRange = (int) predictedPrice;
    }
}