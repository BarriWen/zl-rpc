package com.zelong.zlrpc.codec;

/**
 * The interface for deserialization.
 *
 * @author zelong
 */
public interface Decoder {
    /**
     * Decode t.
     *
     * @param <T>   the type parameter
     * @param bytes the bytes
     * @param clazz the clazz
     * @return the t
     */
    <T> T decode(byte[] bytes, Class<T> clazz);
}
