

package com.iscas.cloud.quickframe.upms.service.common.listener;

import com.iscas.cloud.quickframe.common.constant.MqQueueConstant;
import com.iscas.cloud.quickframe.common.entity.SysLog;
import com.iscas.cloud.quickframe.common.vo.LogVO;
import com.iscas.cloud.quickframe.upms.service.service.SysLogService;
import org.slf4j.MDC;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 */
@Component
@RabbitListener(queues = MqQueueConstant.LOG_QUEUE)
public class LogReceiveListener {
    private static final String KEY_USER = "user";

    @Autowired
    private SysLogService sysLogService;

    @RabbitHandler
    public void receive(LogVO logVo) {
        SysLog sysLog = logVo.getSysLog();
        MDC.put(KEY_USER, logVo.getUsername());
        sysLog.setCreateBy(logVo.getUsername());
        sysLogService.insert(sysLog);
        MDC.remove(KEY_USER);
    }
}
