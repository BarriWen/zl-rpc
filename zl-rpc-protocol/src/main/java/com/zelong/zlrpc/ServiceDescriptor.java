package com.zelong.zlrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Service descriptor
 *
 * @author zelong
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDescriptor {
    private String clazz;
    private String mehthod;
    private String returnType;
    private String[] parameterTypes;
}
