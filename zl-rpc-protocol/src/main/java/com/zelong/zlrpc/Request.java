package com.zelong.zlrpc;

import lombok.Data;

/**
 * Rpc request
 *
 * @author zelong
 */

@Data

public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
