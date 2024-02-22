package com.zelong.zlrpc.client;

import com.zelong.zlrpc.Peer;
import com.zelong.zlrpc.common.utils.ReflectionUtils;
import com.zelong.zlrpc.transport.TransportClient;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Random transport selector.
 * Thread-safe.
 *
 * @author zelong
 */
@Slf4j
public class RandomTransportSelector implements TransportSelector {

    /**
     * Connected clients.
     */
    private List<TransportClient> clients;

    /**
     * Instantiates a new Random transport selector.
     */
    public RandomTransportSelector() {
        clients = new ArrayList<>();
    }

    @Override
    public synchronized void init(List<Peer> peers, int count, Class<? extends TransportClient> clazz) {
        count = Math.max(count, 1);

        for (Peer peer : peers) {
            for (int i = 0; i < count; i++) {
                TransportClient client = ReflectionUtils.newInstance(clazz);
                client.connect(peer);
                clients.add(client);
            }
            log.info("connect server: {}", peer);
        }
    }

    @Override
    public synchronized TransportClient select() {
        int i = new Random().nextInt(clients.size());
        return clients.remove(i);
    }

    @Override
    public synchronized void release(TransportClient client) {
        clients.add(client);
    }

    @Override
    public synchronized void close() {
        for (TransportClient client : clients) {
            client.close();
        }
        clients.clear();
    }
}
