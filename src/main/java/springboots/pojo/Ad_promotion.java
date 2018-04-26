package springboots.pojo;

import java.util.Date;

/**
 * @Description:广告信息实体类
 * @Date Created in 11:42   2018/4/25
 */
public class Ad_promotion {





    private Integer  id;// bigint(30) NOT NULL主键id
    private Integer  appId;// bigint(30) NULLappId（来源于：app_info表的主键id）
    private String  adPicPath;// varchar(100) NULL广告图片存储路径
    private Integer  adPV;// bigint(50) NULL广告点击量
    private Integer  carouselPosition;// int(30) NULL轮播位（1-n）
    private Date  startTime;//  datetime NULL起效时间
    private Date  endTime;//   datetime NULL失效时间
    private Integer  createdBy;//  bigint(30) NULL创建者（来源于backend_user用户表的用户id）
    private Date  creationDate;//  datetime NULL创建时间
    private Integer  modifyBy;//  bigint(30) NULL更新者（来源于backend_user用户表的用户id）
    private Date  modifyDate;//  datetime NULL最新更新时间

    public Ad_promotion(){}
    public Ad_promotion(Integer id, Integer appId, String adPicPath, Integer adPV, Integer carouselPosition, Date startTime, Date endTime, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate) {
        this.id = id;
        this.appId = appId;
        this.adPicPath = adPicPath;
        this.adPV = adPV;
        this.carouselPosition = carouselPosition;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAdPicPath() {
        return adPicPath;
    }

    public void setAdPicPath(String adPicPath) {
        this.adPicPath = adPicPath;
    }

    public Integer getAdPV() {
        return adPV;
    }

    public void setAdPV(Integer adPV) {
        this.adPV = adPV;
    }

    public Integer getCarouselPosition() {
        return carouselPosition;
    }

    public void setCarouselPosition(Integer carouselPosition) {
        this.carouselPosition = carouselPosition;
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

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "Ad_promotion{" +
                "id=" + id +
                ", appId=" + appId +
                ", adPicPath='" + adPicPath + '\'' +
                ", adPV=" + adPV +
                ", carouselPosition=" + carouselPosition +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
