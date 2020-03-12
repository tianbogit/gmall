package com.tian.gmall.ums.service.impl;

import com.tian.gmall.ums.entity.Member;
import com.tian.gmall.ums.mapper.MemberMapper;
import com.tian.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
