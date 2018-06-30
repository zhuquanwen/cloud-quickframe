

package com.iscas.cloud.quickframe.upms.service.service;

import com.baomidou.mybatisplus.service.IService;
import com.iscas.cloud.quickframe.common.entity.SysZuulRoute;


/**
 * <p>
 * 动态路由配置表 服务类
 * </p>
 */
public interface SysZuulRouteService extends IService<SysZuulRoute> {

    /**
     * 立即生效配置
     * @return
     */
    Boolean applyZuulRoute();
}
