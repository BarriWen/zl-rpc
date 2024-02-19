package com.zelong.zlrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Responses handler
 *
 * @author zelong
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
