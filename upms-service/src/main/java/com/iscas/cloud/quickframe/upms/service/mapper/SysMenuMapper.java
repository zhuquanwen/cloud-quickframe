

package com.iscas.cloud.quickframe.upms.service.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.iscas.cloud.quickframe.common.vo.MenuVO;
import com.iscas.cloud.quickframe.upms.service.model.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单权限表 Mapper 接口
 * </p>

 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 通过角色名查询菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    List<MenuVO> findMenuByRoleName(@Param("role") String role);
}