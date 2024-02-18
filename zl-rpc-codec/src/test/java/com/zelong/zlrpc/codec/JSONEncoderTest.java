package com.zelong.zlrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("zelong");
        bean.setAge(999);

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}