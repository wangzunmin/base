package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import org.junit.Test;

public class CompareList {
//	@Test
	public void test(){
		List<String> al=new ArrayList<String>();
		al.add("001");
		al.add("002");
		al.add("001");
		al.add("004");
		Set<String> set=new HashSet<String>();
		for(int i=0;i<al.size();i++){
			set.add(al.get(i));
			/*for(int j=al.size()-1;j>i;j--){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
				}
			}*/
		}
		System.out.println(set);
	}
	
	
	 public static void check(List<String> alist) {
	        // 璁板綍閲嶅鏁版嵁
	        List<String> cflist = new ArrayList<String>();
	        // 澶嶅埗涓�涓猯ist
	        List<String> blist = alist;
	        for (int i = 0; i < alist.size(); i++) {
	            boolean b = false;
	            String mk = "绗�" + (i + 1) + "鏉℃暟鎹拰绗�";
	            for (int j = 0; j < blist.size(); j++) {
	                // 涓嶅拰鏈韩姣旇緝
	                if (j != i) {
	                    // 鎵惧埌鐩稿悓鐨勫��
	                    if (alist.get(i).equals(blist.get(j))) {
	                        // 涓嶅瓨鍦ㄩ噸澶嶆暟鎹�
	                        if (!cflist.isEmpty()) {
	                            boolean bo = true;
	                            // 閬嶅巻閲嶅鏁版嵁闆�
	                            for (int k = 0; k < cflist.size(); k++) {
	                                // 鍙栧嚭绗琸琛岀殑閲嶅鏁版嵁
	                                String[] cf = cflist.get(k).toString()
	                                        .split("-");
	                                // 鍙栧嚭绗琸琛岀殑绗簩涓储寮曪紙澶嶅埗鏁版嵁鐨勭储寮�+1锛�
	                                int s = Integer.parseInt(cf[1].toString());
	                                // 姣旇緝褰撳墠椤哄簭鍜岄噸澶嶄腑鐨勯『搴忥紝濡傛灉鐩哥瓑鍒欐爣璁颁负false
	                                if (s == (i + 1)) {
	                                    bo = false;
	                                }
	                            }
	                            // 鍒ゆ柇鏄惁娣诲姞鍒伴噸澶嶆暟鎹泦涓紙true琛ㄧず閲嶅鏁版嵁闆嗛噷闈笉瀛樺湪璇ユ暟鎹紝false鍙嶄箣锛�
	                            if (bo) {
	                                cflist.add((i + 1) + "-" + (j + 1));
	                                if (b) {
	                                    mk += ",";
	                                }
	                                mk += (j + 1);
	                                // 璁板綍閲嶅鏁版嵁鏃朵慨鏀筨鐨勫�硷紝琛ㄧず鍜岀i琛屽拰绗琷琛屽瓨鍦ㄩ噸澶嶆暟鎹�
	                                b = true;
	                            }
	                        } else {
	                            // 璁板綍閲嶅鐨勬暟鎹紝鏍煎紡涓�2-3锛堢涓�涓暟瀛椾负鍘熼噸澶嶆暟鎹殑绱㈠紩+1锛岀浜屼釜涓哄鍒舵暟鎹殑绱㈠紩+1锛�
	                            cflist.add((i + 1) + "-" + (j + 1));
	                            mk += (j + 1);
	                            b = true;
	                        }
	                    }
	                }
	            }
	            mk += "鏉℃暟鎹噸澶�,閲嶅鍊硷細" + alist.get(i);
	            if (b) {
	                System.out.println(mk);
	            }
	        }
	    }
	 
	 public static void main(String[] args) {
		 // 妯℃嫙鏁版嵁闆�
	        List<String> alist = new ArrayList<String>();
	        alist.add("B1%a");
	        alist.add("B5%aaa");
	        alist.add("B2%a");
	        alist.add("bb");
	        alist.add("B3%a");
	        alist.add("B6%aaa");
	        alist.add("B7%aaa");
	        alist.add("a");
	        alist.add("bb");
	        alist.add("bb");
	        alist.add("B8%aaa");
	        alist.add("bb");
	        alist.add("B4%a");
	        alist.add("B9%aaa");
	        check(alist);
	}
}
