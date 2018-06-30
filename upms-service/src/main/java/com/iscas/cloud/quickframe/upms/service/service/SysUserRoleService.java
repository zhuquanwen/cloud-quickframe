

package com.iscas.cloud.quickframe.upms.service.service;


import com.baomidou.mybatisplus.service.IService;
import com.iscas.cloud.quickframe.upms.service.model.entity.SysUserRole;


/**
 * <p>
 * 用户角色表 服务类
 * </p>

 */
public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 根据用户Id删除该用户的角色关系
     */
    Boolean deleteByUserId(Integer userId);
}
