package com.tian.gmall.pms.service.impl;

import com.tian.gmall.pms.entity.Product;
import com.tian.gmall.pms.mapper.ProductMapper;
import com.tian.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@com.alibaba.dubbo.config.annotation.Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
