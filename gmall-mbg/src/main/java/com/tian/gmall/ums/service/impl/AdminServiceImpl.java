package com.tian.gmall.ums.service.impl;

import com.tian.gmall.ums.entity.Admin;
import com.tian.gmall.ums.mapper.AdminMapper;
import com.tian.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
