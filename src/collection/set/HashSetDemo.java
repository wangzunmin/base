package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collection.M;

public class HashSetDemo {

	public static void main(String[] args) {
//		Set<M> set = new HashSet<M>();
//		set.add(new M(1));
//		set.add(new M(2));
//		set.add(new M(2));
//		
//		System.out.println(set.size());
		ccc();
	}
	
	
	public static void aaa(){
		List<M> list = new ArrayList<M>();
		M m = new M(4);
		M m1 = new M(3);
		M m2 = new M(5);
		M m3 = new M(7);
		list.add(m);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		aList.add(6);
		aList.add(7);
		Set<M> set = new HashSet<M>();
		for(Integer a : aList){
			for(M entity : list){
				if(entity.getAge() == a){
					set.add(entity);
				}else {
					set.add(new M(a));
				}
			}
		}
		System.out.println(set);
	}
	
	public static void bbb(){
		List<IndexNumberInfoDto> list = new ArrayList<IndexNumberInfoDto>();
		list.add(new IndexNumberInfoDto("w","1"));
		list.add(new IndexNumberInfoDto("z","2"));
		list.add(new IndexNumberInfoDto("a","3"));
		list.add(new IndexNumberInfoDto("c","4"));
		List<String> aList = new ArrayList<String>();
		aList.add("w");
		aList.add("a");
		aList.add("z");
		aList.add("c");
		aList.add("q");
		aList.add("g");
		Set<IndexNumberInfoDto> set = new HashSet<IndexNumberInfoDto>();
		for(String a : aList){
			for(IndexNumberInfoDto entity : list){
				if(entity.getIndexName().equals(a)){
					set.add(entity);
				}else if(!entity.getIndexName().equals(a)){
					set.add(new IndexNumberInfoDto(a,"0"));
				}
			}
		}
		System.out.println(set);
	}
	
	public static void ccc(){
		List<IndexNumberInfoDto> list = new ArrayList<IndexNumberInfoDto>();
		list.add(new IndexNumberInfoDto("w","1"));
		list.add(new IndexNumberInfoDto("z","2"));
		list.add(new IndexNumberInfoDto("a","3"));
		list.add(new IndexNumberInfoDto("c","4"));
		String[] al = new String[]{"w","a","z","c","q","g"};
		List<String> aList = new ArrayList<String>();
		for(String s : al){
			aList.add(s);
		}
		
		List<String> mList = new ArrayList<String>();
		for(IndexNumberInfoDto entity : list){
			mList.add(entity.getIndexName());
		}
		aList.removeAll(mList);
		for (String string : aList) {
			list.add(new IndexNumberInfoDto(string, "0"));
		}
		
		
		List<IndexNumberInfoDto> list2 = new ArrayList<IndexNumberInfoDto>();
		list2.add(new IndexNumberInfoDto("w","66"));
		list2.add(new IndexNumberInfoDto("z","77"));
		list2.add(new IndexNumberInfoDto("a","77"));
		
		for(IndexNumberInfoDto a1: list){ 
			for (IndexNumberInfoDto indexNu : list2) {
				if(("w".equals(indexNu.getIndexName()) && "w".equals(a1.getIndexName())) 
					|| ("z".equals(indexNu.getIndexName()) && "z".equals(a1.getIndexName()))){
					a1.setCount(indexNu.getCount());
				}
			}
		}
		
		System.out.println(list);
	}
}
