package com.zelong.zlrpc;

import lombok.Data;

/**
 * Rpc response
 *
 * @author zelong
 */

@Data
public class Response {
    /**
     * 0 - success, others - fail
     */
    private  int code;
    /**
     * Error message
     */
    private String message = "ok";
    /**
     * Returned data
     */
    private  Object data;
}
