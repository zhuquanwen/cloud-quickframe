

package com.iscas.cloud.quickframe.upms.service.model.dto;


import com.iscas.cloud.quickframe.common.vo.SysRole;
import lombok.Data;

/**
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}
