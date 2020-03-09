package com.tian.gmall.oms.service.impl;

import com.tian.gmall.oms.entity.CartItem;
import com.tian.gmall.oms.mapper.CartItemMapper;
import com.tian.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-08
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
