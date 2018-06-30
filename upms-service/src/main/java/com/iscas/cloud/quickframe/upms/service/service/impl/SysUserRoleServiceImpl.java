

package com.iscas.cloud.quickframe.upms.service.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.iscas.cloud.quickframe.upms.service.mapper.SysUserRoleMapper;
import com.iscas.cloud.quickframe.upms.service.model.entity.SysUserRole;
import com.iscas.cloud.quickframe.upms.service.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    /**
     * 根据用户Id删除该用户的角色关系
     */
    @Override
    public Boolean deleteByUserId(Integer userId) {
        return baseMapper.deleteByUserId(userId);
    }
}
