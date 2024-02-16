package com.zelong.zlrpc.common.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Reflection utils Class
 *
 * @author zelong
 */
public class ReflectionUtils {
    /**
     * Creates instance based on Class
     *
     * @param clazz Class of Object
     * @param <T> instance type
     * @return Object instance
     */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Gets all Public methods of a Class
     *
     * @param clazz Class of Object
     * @return all Public methods of a Class
     */
    public static Method[] getPublicMethods(Class clazz) {
        // Get all methods including private and protected, except parent methods
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> publicMethods = new ArrayList<>();
        // Filter public methods
        for (Method m : methods) {
            if (Modifier.isPublic(m.getModifiers())) {
                publicMethods.add(m);
            }
        }
        return publicMethods.toArray(new Method[0]);
    }

    /**
     * Invoke specific method from a specific Object
     *
     * @param obj target Object
     * @param method target method
     * @param args target method's args
     * @return result
     */
    public static Object invoke(Object obj, Method method, Object... args) {
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
