

package com.iscas.cloud.quickframe.upms.service.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.iscas.cloud.quickframe.upms.service.model.entity.SysDept;

import java.util.List;

/**
 * <p>
 * 部门管理 Mapper 接口
 * </p>
 */
public interface SysDeptMapper extends BaseMapper<SysDept> {

    /**
     * 关联dept——relation
     *
     * @param delFlag 删除标记
     * @return 数据列表
     */
    List<SysDept> selectDeptDtoList(String delFlag);

    /**
     * 删除部门关系表数据
     * @param id 部门ID
     */
    void deleteDeptRealtion(Integer id);
}