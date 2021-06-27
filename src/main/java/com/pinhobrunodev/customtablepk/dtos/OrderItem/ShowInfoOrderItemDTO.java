package com.pinhobrunodev.customtablepk.dtos.OrderItem;

import java.io.Serializable;

import com.pinhobrunodev.customtablepk.model.OrderItem;

public class ShowInfoOrderItemDTO implements Serializable {

    private Integer quantity;
    private Double price;
    private String name;
    private String description;
    private String imgUrl;

    public ShowInfoOrderItemDTO() {

    }

    public ShowInfoOrderItemDTO(OrderItem entity) {
        quantity = entity.getQuantity();
        price = entity.getPrice();
        name = entity.getProduct().getName();
        description = entity.getProduct().getDescription();
        imgUrl = entity.getProduct().getImgUrl();
    }

    public Double getSubTotal() {
        return price * quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }


    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
