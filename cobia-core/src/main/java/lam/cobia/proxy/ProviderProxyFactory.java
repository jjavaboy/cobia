package lam.cobia.proxy;

import lam.cobia.rpc.Provider;
import lam.cobia.spi.Spiable;

@Spiable("jdk")
public interface ProviderProxyFactory {

    public <T> Provider<T> getProvider(T ref, Class<T> clazz);

}
