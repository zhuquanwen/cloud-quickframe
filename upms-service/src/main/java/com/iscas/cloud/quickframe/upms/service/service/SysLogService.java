

package com.iscas.cloud.quickframe.upms.service.service;

import com.baomidou.mybatisplus.service.IService;
import com.iscas.cloud.quickframe.common.entity.SysLog;


/**
 * <p>
 * 日志表 服务类
 * </p>

 */
public interface SysLogService extends IService<SysLog> {

    /**
     * 通过ID删除日志（逻辑删除）
     *
     * @param id 日志ID
     * @return true/false
     */
    Boolean updateByLogId(Long id);
}
