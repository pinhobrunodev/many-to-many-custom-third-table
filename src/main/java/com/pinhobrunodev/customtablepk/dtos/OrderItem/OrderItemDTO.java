package com.pinhobrunodev.customtablepk.dtos.OrderItem;

import java.io.Serializable;

import com.pinhobrunodev.customtablepk.model.OrderItem;

public class OrderItemDTO implements Serializable {

    private Integer quantity;
    private Double price;
    private Long product_id;
    private Long order_id;

    public OrderItemDTO() {

    }

    public OrderItemDTO(OrderItem entity) {
        quantity = entity.getQuantity();
        price = entity.getPrice();
        product_id = entity.getProduct().getId();
        order_id = entity.getOrder().getId();
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
     * @return Long return the product_id
     */
    public Long getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    /**
     * @return Long return the order_id
     */
    public Long getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

}
