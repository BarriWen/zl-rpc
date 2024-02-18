package com.zelong.zlrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * Implementation of Json deserialization.
 */
public class JSONDecoder implements Decoder {

    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
