package com.pinhobrunodev.customtablepk.dtos.Order;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.pinhobrunodev.customtablepk.dtos.OrderItem.ShowInfoOrderItemDTO;
import com.pinhobrunodev.customtablepk.model.Order;
import com.pinhobrunodev.customtablepk.model.Payment;
import com.pinhobrunodev.customtablepk.model.User;
import com.pinhobrunodev.customtablepk.model.enums.OrderStatus;

public class ShowOrderInfoDTO {

    private Long id;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    private OrderStatus status;
    private User client;
    private List<ShowInfoOrderItemDTO> items = new ArrayList<ShowInfoOrderItemDTO>();
    private Payment payment;
    public ShowOrderInfoDTO() {

    }

    public ShowOrderInfoDTO(Order order) {
        id = order.getId();
        moment = order.getMoment();
        client = order.getUser();
        payment = order.getPayment();
        status = order.getStatus();
        items = order.getItems().stream().map(ShowInfoOrderItemDTO::new).collect(Collectors.toList());
    }

    /**
     * @return User return the client
     */
    public User getClient() {
        return client;
    }

    public Double getTotal() {
        double sum = 0;
        for (ShowInfoOrderItemDTO x : items) {
            sum += x.getSubTotal();
        }
        return sum;
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
     * @param client the client to set
     */
    public void setClient(User client) {
        this.client = client;
    }

    /**
     * @return List<OrderItemDTO> return the items
     */
    public List<ShowInfoOrderItemDTO> getItems() {
        return items;
    }

    public Payment getPayment() {
        return payment;
    }

}
