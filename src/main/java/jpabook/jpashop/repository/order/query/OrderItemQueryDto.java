package jpabook.jpashop.repository.order.query;

import lombok.Data;

import java.util.List;

@Data
public class OrderItemQueryDto {
    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }

    private Long orderId;
    private String itemName;
    private int orderPrice;
    private int count;


}
