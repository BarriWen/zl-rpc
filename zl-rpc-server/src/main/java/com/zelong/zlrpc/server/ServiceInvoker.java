package com.zelong.zlrpc.server;

import com.zelong.zlrpc.Request;
import com.zelong.zlrpc.common.utils.ReflectionUtils;

/**
 * Service invoker.
 */
public class ServiceInvoker {

    /**
     * Invoke object.
     *
     * @param service the service
     * @param request the request
     * @return the object
     */
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters()
        );
    }
}
