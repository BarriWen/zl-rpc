package com.zelong.zlrpc.transport;

/**
 * 1. initiate listener
 * 2. handel requests
 * 3. stop listener
 *
 * @author zelong
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);
    void start();
    void stop();
}
