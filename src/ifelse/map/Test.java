package ifelse.map;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		IfFunction<String> ifFunction = new IfFunction<>(new HashMap<>(5));
		
		
		//核心思想 多态的形式替换 if else
		ifFunction.add("hello", new Function() {
			@Override
			public void invoke() {
				System.out.println("你好");			
			}
		});
		
		ifFunction.add("helloworld", new Function() {
			@Override
			public void invoke() {
				System.out.println("你好世界");			
			}
		});
		
		ifFunction.doIf("helloworld");
		
		
	}

}
