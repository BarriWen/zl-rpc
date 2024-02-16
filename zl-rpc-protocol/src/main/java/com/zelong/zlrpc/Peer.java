package com.zelong.zlrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Rpc endpoints
 *
 * @author zelong
 */

@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
