package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorTest {
	
	@Test
	public void test01(){
		List<String> al=new ArrayList<String>();
		al.add("001");
		al.add("002");
		al.add("003");
		al.add("004");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String it1 = it.next();
			if("001".equals(it1)){
				it.remove();
//				al.remove(it1);//ConcurrentModificationException    
			}
		}
		System.out.println(al);
	}
	
	@Test
	public void test02(){
		List<String> al=new ArrayList<String>();
		al.add("001");
		al.add("002");
		al.add("003");
		al.add("004");
		for(int i=0;i<al.size();i++){
			if("001".equals(al.get(i))){
				String string = al.get(i);
				al.remove(string);
				i--;//以防没有全部遍历集合中的元素
			}
		}
		System.out.println(al);
	}
	
	@Test
	public void test03(){
		List<String> al=new ArrayList<String>();
		al.add("001");
		al.add("002");
		al.add("003");
		al.add("004");
		for (String string : al) {
			if(string.equals("001")){
				al.remove(string); //ConcurrentModificationException    
			}
		}
		System.out.println(al);
	}
	
	@Test
	public void test04(){
		List<String> al=new ArrayList<String>();
		al.add("001");
		al.add("002");
		al.add("003");
		al.add("004");
		for(int i=al.size();i>0;i--){
			if("001".equals(al.get(i))){
				String string = al.get(i);
				al.remove(string);
				++i;//以防没有全部遍历集合中的元素
			}
		}
		System.out.println(al);
	}
	
}
