package com.zelong.zlrpc.client;

import com.zelong.zlrpc.Peer;
import com.zelong.zlrpc.codec.Decoder;
import com.zelong.zlrpc.codec.Encoder;
import com.zelong.zlrpc.codec.JSONDecoder;
import com.zelong.zlrpc.codec.JSONEncoder;
import com.zelong.zlrpc.transport.HTTPTransportClient;
import com.zelong.zlrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {

    private Class<? extends TransportClient> transportClass =
            HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
