package com.cyf.myProject.user.service.impl;

import com.cyf.myProject.user.entity.UserEntity;
import com.cyf.myProject.user.mapper.UserMapper;
import com.cyf.myProject.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyf
 * @since 2021-01-12
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

}
