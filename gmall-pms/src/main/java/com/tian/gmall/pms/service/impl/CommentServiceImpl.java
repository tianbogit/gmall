package com.tian.gmall.pms.service.impl;

import com.tian.gmall.pms.entity.Comment;
import com.tian.gmall.pms.mapper.CommentMapper;
import com.tian.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author tian
 * @since 2020-03-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
