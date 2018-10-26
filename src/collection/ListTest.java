/**
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用 Iterator 方式，如果并发操作，需要对 Iterator 对象加锁。
 * @author WZM
 *
 * 2018年4月26日
 */
public class ListTest {
	public static void main(String[] args) {
		 ArrayList<String> strs = new ArrayList<>();
        strs.add("1");
        strs.add("32");
        strs.add("3");
        strs.add("4");
        strs.add("5");
        strs.add("36");
        strs.add(null);
        System.out.println(strs.size());
//        remove1(strs);
	}
	
	//使用iterator，这个是java和Android源码中经常使用到的一种方法，所以最为推荐
    public static void remove1(List<String> list) {
        Iterator<String> sListIterator = list.iterator();
        while (sListIterator.hasNext()) {
            String str = sListIterator.next();
            if (str.contains("3")) {
                sListIterator.remove();
//            	list.remove(str);//ConcurrentModificationException
                continue;
            }
            System.out.println("xxxxxx");
        }
        System.out.println(list.size());
    }
    
    //倒序删除，以防因为删除中间项导致数据下标变更，使得数据出错
    public static void remove2(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("3")) {
                list.remove(i);
                continue;
            }
            System.out.println("xxxxxx");
        }
        System.out.println(list.size());
    }
    
    
    // 顺序删除，但是对下标和索引进行了处理
    public static void remove3(List<String> list) {
        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i).contains("3")) {
                list.remove(i);
                len--;
                i--;
                continue;
            }
            System.out.println("xxxxxx");
        }
        System.out.println(list.size());
    }
    
    // 在遍历过程中不直接操作原list
    public static void remove4(List<String> list) {
        List<String> temp = new ArrayList<>();
        for (String str : list) {
            if (str.contains("3")) {
                temp.add(str);
                continue;
            }
            System.out.println("xxxxxx");
        }
        list.removeAll(temp);
        System.out.println(list.size());
    }
}
