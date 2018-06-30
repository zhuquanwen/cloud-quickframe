

package com.iscas.cloud.quickframe.upms.service.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.iscas.cloud.quickframe.upms.service.model.dto.DeptTree;
import com.iscas.cloud.quickframe.upms.service.model.entity.SysDept;


import java.util.List;

/**
 * <p>
 * 部门管理 服务类
 * </p>
 */
public interface SysDeptService extends IService<SysDept> {

    /**
     * 查询部门树菜单
     * @param sysDeptEntityWrapper
     * @return 树
     */
    List<DeptTree> selectListTree(EntityWrapper<SysDept> sysDeptEntityWrapper);

    /**
     * 添加信息部门
     * @param sysDept
     * @return
     */
    Boolean insertDept(SysDept sysDept);

    /**
     * 删除部门
     * @param id 部门 ID
     * @return 成功、失败
     */
    Boolean deleteDeptById(Integer id);

    /**
     * 更新部门
     * @param sysDept 部门信息
     * @return 成功、失败
     */
    Boolean updateDeptById(SysDept sysDept);
}
