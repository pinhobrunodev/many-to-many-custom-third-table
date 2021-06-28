package com.pinhobrunodev.customtablepk.dtos.OrderItem;

import java.io.Serializable;

import com.pinhobrunodev.customtablepk.model.OrderItem;
import com.pinhobrunodev.customtablepk.model.Product;

public class ShowInfoOrderItemDTO implements Serializable {

    private Integer quantity;
    private Double price;
    private Product product;

    public ShowInfoOrderItemDTO() {

    }

    public ShowInfoOrderItemDTO(OrderItem entity) {
        quantity = entity.getQuantity();
        price = entity.getPrice();
        product = entity.getProduct();
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

    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

}
