package com.tian.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tian.gmall.ums.entity.Admin;
import com.tian.gmall.ums.mapper.AdminMapper;
import com.tian.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        String s = DigestUtils.md5DigestAsHex(password.getBytes());

        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", s);

        Admin admin = adminMapper.selectOne(wrapper);

        return admin;
    }

    @Override
    public Admin getUserInfo(String userName) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username", userName));
    }
}
