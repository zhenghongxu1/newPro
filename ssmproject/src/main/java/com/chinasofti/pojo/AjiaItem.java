package com.chinasofti.pojo;

import java.io.Serializable;
import java.util.Date;

public class AjiaItem implements Serializable {
	
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.id
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.brand
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.model
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.title
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.sell_point
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String sellPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.price
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.num
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.barcode
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.image
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.cid
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Long cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.status
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.created
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_item.updated
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ajia_item
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.id
     *
     * @return the value of ajia_item.id
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.id
     *
     * @param id the value for ajia_item.id
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.brand
     *
     * @return the value of ajia_item.brand
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.brand
     *
     * @param brand the value for ajia_item.brand
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.model
     *
     * @return the value of ajia_item.model
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.model
     *
     * @param model the value for ajia_item.model
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.title
     *
     * @return the value of ajia_item.title
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.title
     *
     * @param title the value for ajia_item.title
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.sell_point
     *
     * @return the value of ajia_item.sell_point
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.sell_point
     *
     * @param sellPoint the value for ajia_item.sell_point
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.price
     *
     * @return the value of ajia_item.price
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.price
     *
     * @param price the value for ajia_item.price
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.num
     *
     * @return the value of ajia_item.num
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.num
     *
     * @param num the value for ajia_item.num
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.barcode
     *
     * @return the value of ajia_item.barcode
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.barcode
     *
     * @param barcode the value for ajia_item.barcode
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.image
     *
     * @return the value of ajia_item.image
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.image
     *
     * @param image the value for ajia_item.image
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.cid
     *
     * @return the value of ajia_item.cid
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Long getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.cid
     *
     * @param cid the value for ajia_item.cid
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.status
     *
     * @return the value of ajia_item.status
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.status
     *
     * @param status the value for ajia_item.status
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.created
     *
     * @return the value of ajia_item.created
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.created
     *
     * @param created the value for ajia_item.created
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_item.updated
     *
     * @return the value of ajia_item.updated
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_item.updated
     *
     * @param updated the value for ajia_item.updated
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item
     *
     * @mbg.generated Wed Sep 11 17:20:26 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", title=").append(title);
        sb.append(", sellPoint=").append(sellPoint);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", barcode=").append(barcode);
        sb.append(", image=").append(image);
        sb.append(", cid=").append(cid);
        sb.append(", status=").append(status);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}