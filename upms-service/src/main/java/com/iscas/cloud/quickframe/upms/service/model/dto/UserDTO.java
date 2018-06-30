

package com.iscas.cloud.quickframe.upms.service.model.dto;


import com.iscas.cloud.quickframe.upms.service.model.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class UserDTO extends SysUser {
    /**
     * 角色ID
     */
    private List<Integer> role;

    private Integer deptId;

    /**
     * 新密码
     */
    private String newpassword1;
}
