package com.tian.gmall.oms.service.impl;

import com.tian.gmall.oms.entity.Order;
import com.tian.gmall.oms.mapper.OrderMapper;
import com.tian.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-08
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
