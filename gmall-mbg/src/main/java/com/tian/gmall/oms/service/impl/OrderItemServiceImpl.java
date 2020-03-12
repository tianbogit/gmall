package com.tian.gmall.oms.service.impl;

import com.tian.gmall.oms.entity.OrderItem;
import com.tian.gmall.oms.mapper.OrderItemMapper;
import com.tian.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
