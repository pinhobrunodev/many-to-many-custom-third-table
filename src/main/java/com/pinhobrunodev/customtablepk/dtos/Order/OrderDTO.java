package com.pinhobrunodev.customtablepk.dtos.Order;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.customtablepk.model.Order;
import com.pinhobrunodev.customtablepk.model.enums.OrderStatus;

public class OrderDTO implements Serializable {

    private Long id;
    private OrderStatus status;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    private Long user_id;

    public OrderDTO() {
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        status = entity.getStatus();
        moment = entity.getMoment();
        user_id = entity.getUser().getId();
    }


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return OrderStatus return the status
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * @return Long return the user_id
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }


    /**
     * @return Instant return the moment
     */
    public Instant getMoment() {
        return moment;
    }

    /**
     * @param moment the moment to set
     */
    public void setMoment(Instant moment) {
        this.moment = moment;
    }

}
