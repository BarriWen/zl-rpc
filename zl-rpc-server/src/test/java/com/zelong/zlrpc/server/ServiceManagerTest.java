package com.zelong.zlrpc.server;

import com.zelong.zlrpc.Request;
import com.zelong.zlrpc.ServiceDescriptor;
import com.zelong.zlrpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ServiceManagerTest {

    ServiceManager manager;

    @Before
    public void init() {
        manager = new ServiceManager();
        Testinterface bean = new TestClass();
        manager.register(Testinterface.class, bean);
    }

    @Test
    public void register() {
        Testinterface bean = new TestClass();
        manager.register(Testinterface.class, bean);
    }

    @Test
    public void lookup() {
        Method method = ReflectionUtils.getPublicMethods(Testinterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(Testinterface.class, method);

        Request request = new Request();
        request.setService(sdp);

        ServiceInstance sis = manager.lookup(request);
        assertNotNull(sis);
    }
}