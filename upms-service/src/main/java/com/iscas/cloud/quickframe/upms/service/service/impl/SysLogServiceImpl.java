

package com.iscas.cloud.quickframe.upms.service.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.iscas.cloud.quickframe.common.constant.CommonConstant;
import com.iscas.cloud.quickframe.common.entity.SysLog;
import com.iscas.cloud.quickframe.common.util.Assert;
import com.iscas.cloud.quickframe.upms.service.mapper.SysLogMapper;
import com.iscas.cloud.quickframe.upms.service.service.SysLogService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Boolean updateByLogId(Long id) {
        Assert.isNull(id, "日志ID为空");

        SysLog sysLog = new SysLog();
        sysLog.setId(id);
        sysLog.setDelFlag(CommonConstant.STATUS_DEL);
        sysLog.setUpdateTime(new Date());
        return updateById(sysLog);
    }
}
