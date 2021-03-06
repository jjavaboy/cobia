package lam.cobia.serialize;

import lam.cobia.serialize.support.CobiaSerializer;

/**
* <p>
* abstract serializer
* </p>
* @author linanmiao
* @date 2018年5月6日
* @versio 1.0
*/
public abstract class AbstractSerializer implements CobiaSerializer {
	
	protected final String name;

	public AbstractSerializer(String name) {
		this.name = name;
	}
	
}
