package com.zelong.zlrpc.codec;


/**
 * The interface for serialization.
 *
 * @author zelong
 */
public interface Encoder {
    /**
     * Encode byte [ ].
     *
     * @param obj the Object
     * @return the byte [ ]
     */
    byte[] encode(Object obj);
}
