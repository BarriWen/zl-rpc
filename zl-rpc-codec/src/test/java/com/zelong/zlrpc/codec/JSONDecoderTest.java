package com.zelong.zlrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONDecoderTest {

    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean1 = new TestBean();
        bean1.setName("zelong");
        bean1.setAge(999);

        byte[] bytes = encoder.encode(bean1);

        Decoder decoder = new JSONDecoder();
        TestBean bean2 = decoder.decode(bytes, TestBean.class);

        assertEquals(bean1.getName(), bean2.getName());
        assertEquals(bean1.getAge(), bean2.getAge());
    }
}