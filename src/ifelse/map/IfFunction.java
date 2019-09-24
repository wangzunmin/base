package ifelse.map;

import java.util.Map;
/**
 * 
 * 策略模式的扩展
 * key代表需要判断的条件 value则是满足条件时需要去干的事儿
 * @author wangzunmin
 *
 * @param <K>
 */
public class IfFunction<K> {

	private Map<K, Function> map;

	public IfFunction(Map<K, Function> map) {
		this.map = map;
	}

	public IfFunction<K> add(K key, Function function) {
		this.map.put(key, function);
		return this;
	}

	public void doIf(K key) {
		if (this.map.containsKey(key)) {
			map.get(key).invoke();
		}
	}

	public void doIfWithDefault(K key, Function defaultFunction) {
		if (this.map.containsKey(key)) {
			map.get(key).invoke();
		} else {
			defaultFunction.invoke();
		}
	}
}
