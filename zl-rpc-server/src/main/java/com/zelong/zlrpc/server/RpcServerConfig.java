package com.zelong.zlrpc.server;

import com.zelong.zlrpc.codec.Decoder;
import com.zelong.zlrpc.codec.Encoder;
import com.zelong.zlrpc.codec.JSONDecoder;
import com.zelong.zlrpc.codec.JSONEncoder;
import com.zelong.zlrpc.transport.HTTPTransportServer;
import com.zelong.zlrpc.transport.TransportServer;
import lombok.Data;

/**
 * Configuration for Rpc server.
 */
@Data
public class RpcServerConfig {

    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3030;

}
