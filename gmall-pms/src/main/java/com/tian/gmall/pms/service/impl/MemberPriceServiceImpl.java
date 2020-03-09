package com.tian.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tian.gmall.pms.entity.MemberPrice;
import com.tian.gmall.pms.mapper.MemberPriceMapper;
import com.tian.gmall.pms.service.MemberPriceService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品会员价格表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-08
 */
@com.alibaba.dubbo.config.annotation.Service
@Component
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPrice> implements MemberPriceService {

}
