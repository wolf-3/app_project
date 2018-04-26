package springboots.pojo;

import java.util.Date;

/**
 * @Description:App分类
 * @Date Created in 11:35   2018/4/25
 */
public class App_category {


    private Integer id;//      bigint(30) NOT NULL主键ID
    private String  categoryCode;// varchar(50) NULL分类编码
    private String  categoryName;// varchar(50) NULL分类名称
    private Integer parentId;// bigint(30) NULL父级节点id
    private Integer createdBy;// bigint(30) NULL创建者（来源于backend_user用户表的用户id）
    private Date  creationTime;//  datetime NULL创建时间
    private Integer modifyBy;//  bigint(30) NULL更新者（来源于backend_user用户表的用户id）
    private Date  modifyDate;//   datetime NULL最新更新时间
    //够构造方法
    public App_category(){}
    public App_category(Integer id, String categoryCode, String categoryName, Integer parentId, Integer createdBy, Date creationTime, Integer modifyBy, Date modifyDate) {
        this.id = id;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.parentId = parentId;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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
        return "App_category{" +
                "id=" + id +
                ", categoryCode='" + categoryCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", parentId=" + parentId +
                ", createdBy=" + createdBy +
                ", creationTime=" + creationTime +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
