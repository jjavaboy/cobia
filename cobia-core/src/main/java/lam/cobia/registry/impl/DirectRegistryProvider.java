package lam.cobia.registry.impl;

import lam.cobia.core.model.HostAndPort;
import lam.cobia.registry.RegistryProvider;
import lam.cobia.rpc.Provider;

/**
 * @description: DirectRegistryProvider
 * @author: linanmiao
 * @date: 2018/7/26 0:20
 * @version: 1.0
 */
public class DirectRegistryProvider implements RegistryProvider {
    @Override
    public <T> boolean registry(Provider<T> provider, HostAndPort hap) {
        return false;
    }
}
