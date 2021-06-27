package com.pinhobrunodev.customtablepk.dtos.Payment;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.customtablepk.model.Payment;

public class PaymentDTO implements Serializable{
    private Long id;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    private Long order_id;

    public PaymentDTO() {
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
        order_id = entity.getOrder().getId();
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
