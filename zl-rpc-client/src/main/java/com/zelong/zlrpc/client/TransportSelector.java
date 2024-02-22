package com.zelong.zlrpc.client;

import com.zelong.zlrpc.Peer;
import com.zelong.zlrpc.transport.TransportClient;

import java.util.List;

/**
 * Select the server for connection.
 *
 * @author zelong
 */
public interface TransportSelector {

    /**
     * Initialize selector.
     *
     * @param peers connectable server endpoints
     * @param count number of client-server connections
     * @param clazz class of client implementation
     */
    void init(List<Peer> peers,
              int count,
              Class<? extends TransportClient> clazz);

    /**
     * Select a transport client to interact with server.
     *
     * @return the transport client
     */
    TransportClient select();

    /**
     * Release client.
     *
     * @param client
     */
    void release(TransportClient client);

    void close();
}
