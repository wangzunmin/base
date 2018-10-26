package inter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CheckUtils {
	
	/**
	 * 检查参数是否为空
	 * @param params
	 * @return
	 */
	public static boolean checkParams(Map<String,String> params){
		Iterator<Entry<String, String>> iterator = params.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			if("".equals(entry.getValue()) || entry.getValue() == null){
				sb.append(entry.getKey() + "为空!\n");
			}
		}
		return sb.toString().length() > 0 ? false : true;
	} 
	
	
	public static void main(String[] args) {
		Map<String,String> params = new HashMap<String, String>();
		params.put("id", "");
		boolean checkParams = checkParams(params);
		System.out.println(checkParams);
	}
}
