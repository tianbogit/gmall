package com.tian.gmall.to;

import com.tian.gmall.oms.entity.Order;
import com.tian.gmall.oms.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderMQTo implements Serializable {

    private Order order;
    private List<OrderItem> items;
}
