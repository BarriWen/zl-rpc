package com.zelong.zlrpc.server;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * Service instance.
 */
@Data
@AllArgsConstructor
public class ServiceInstance {
    private Object target;
    private Method method;
}
