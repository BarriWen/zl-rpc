package com.zelong.zlrpc.transport;

import com.zelong.zlrpc.Peer;

import java.io.InputStream;

/**
 * 1. initiate connection
 * 2. transfer data and wait for response
 * 3. close connection
 *
 * @author zelong
 */
public interface TransportClient {
    void connect(Peer peer);
    InputStream write(InputStream data);
    void close();

}
