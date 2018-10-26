package gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		List<Phone> phones = new ArrayList<Phone>();
		Phone phone = new Phone("iphone","4.7");
		phones.add(phone);
		Person person = new Person("tom", 11);
		person.setChild(true);
		person.setBirth(new Date());
		person.setPhones(phones);
		Person person1 = new Person("jack", 15);
		list.add(person);
		list.add(person1);
//		String json = GsonUtils.gson.toJson(new WarpperJson(list));
//		System.out.println(json.toString());
//		String json = GsonUtils.gson.toJson(list);// 带泛型的list转化为json  
//		System.out.println(json.toString());
		
//		List<Person> persons = GsonUtils.gson.fromJson(json, new TypeToken<List<Person>>(){}.getType());// json转为带泛型的list
		String json = "[ { \"name\": \"tom\", \"age\": 11, \"isChild\": true, \"hobby\": null, \"phones\": [ { \"type\": \"iphone\", \"size\": \"4.7\" } ] }, { \"name\": \"jack\", \"age\": 15, \"isChild\": false, \"hobby\": null, \"phones\": null } ]";
/*		String json = "{ \"persons\": [ { \"name\": \"tom\", \"age\": 11, \"isChild\": true, \"hobby\": null, \"phones\": [ { \"type\": \"iphone\", \"size\": \"4.7\" } ] }, { \"name\": \"jack\", \"age\": 15, \"isChild\": false, \"hobby\": null, \"phones\": null } ] }";
*/		
//		WarpperJson WarpperJson = GsonUtils.gson.fromJson(json, WarpperJson.class);// json转为带泛型的list 
//		System.out.println(WarpperJson.getPersons());
////		
//		for(Person p : WarpperJson.getPersons()){ 
//			System.out.println(p);
//		}
//		
//		
//		Map<String, Object> content = new HashMap<String, Object>();
//        content.put("name", "xuanyouwu");
//        content.put("age", "26");
//        String json2 = GsonUtils.gson.toJson(content);
//        System.out.println(json2);
//        Map<String, Object> fromJson = GsonUtils.gson.fromJson(json2, Map.class);
//        System.out.println(fromJson);

          @SuppressWarnings("unchecked")
		List<Person> list1 =  GsonUtils.gson.fromJson(json, List.class);
          System.out.println(list1);
	}
}
