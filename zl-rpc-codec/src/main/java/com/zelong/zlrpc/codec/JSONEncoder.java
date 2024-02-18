package com.zelong.zlrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * Implementation of Json serialization.
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
