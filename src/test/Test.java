package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;


public class Test {
	public static void main(String[] args) throws ParseException {
//		String formateDate = getFormateDate("2017/02/05","yyyy-MM-dd");
//		System.out.println(formateDate);
//		String datetimeFormat = getDatetimeFormat("2017/02/05");
//		System.out.println(datetimeFormat);
//		String row = "abcde";
//		row = row.substring(row.length()-5, row.length());
//		System.out.println(row);
//		deal();
		long time = new Date().getTime();
		System.out.println(time);
		SimpleDateFormat format  = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = format.parse("2017-07-01");
		System.out.println(parse);
	}
	
	
	public static String getFormateDate(String date,String format) throws ParseException{
		SimpleDateFormat sim1=new SimpleDateFormat(format);
		SimpleDateFormat sim2=new SimpleDateFormat(getDatetimeFormat(date));//这个时间日期模式不确定，是根据date的模式确定的
		Date date2 = sim2.parse(date);
		String format2 = sim1.format(date2);
		return format2;
	}
	
	 //确定字符串的时间格式 
    public static String getDatetimeFormat(String dateStr){  
        dateStr=dateStr.trim();  
        Map<String, String> regexMap=new HashMap<String, String>();
        String a1 = "[0-9]{4}[0-9]{2}[0-9]{2}[0-9]{2}[0-9]{2}[0-9]{2}";//yyyyMMddHHmmss  
        String b1="yyyyMMddHHmmss";
        regexMap.put(a1, b1);
        String a2 = "[0-9]{4}[0-9]{2}[0-9]{2}";//yyyyMMdd  
        String b2="yyyyMMdd";
        regexMap.put(a2, b2);
        String a3 = "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";//yyyy-MM-dd HH:mm:ss  
        String b3="yyyy-MM-dd HH:mm:ss";
        regexMap.put(a3, b3);
        String a4 = "[0-9]{4}-[0-9]{2}-[0-9]{2}";//yyyy-MM-dd  
        String b4="yyyy-MM-dd";
        regexMap.put(a4, b4);
        String a5= "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}";//yyyy-MM-dd  HH:mm 
        String b5="yyyy-MM-dd  HH:mm"; 
        regexMap.put(a5, b5);
        String a6 = "[0-9]{4}/[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";//yyyy-MM-dd HH:mm:ss  
        String b6="yyyy/MM/dd HH:mm:ss";
        regexMap.put(a6, b6);
        String a7 = "[0-9]{4}/[0-9]{2}/[0-9]{2}";//yyyy-MM-dd  
        String b7="yyyy/MM/dd";
        regexMap.put(a7, b7);
        String a8= "[0-9]{4}/[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}";//yyyy-MM-dd  HH:mm 
        String b8="yyyy/MM/dd  HH:mm"; 
        regexMap.put(a8, b8);
        for (Entry<String, String> entry : regexMap.entrySet()) {
			if(Pattern.compile(entry.getKey()).matcher(dateStr).matches()){
				return entry.getValue();
			}
		}
        return null;
    }  
    
    
    public static void testtt() throws ParseException{
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
    	Date parse = dateFormat.parse("2017-05");
    	Calendar calendar = Calendar.getInstance();
		Date date = new Date();
        calendar.setTime(parse);
        calendar.add(Calendar.YEAR, -2);
        date = calendar.getTime();
        System.out.println(date);
    }
    
    private static String[] parsePatterns = {
    	 "yyyyMM",
		 "yyyy-MM", 
		 "yyyy/MM",
		 "yyyy.MM"};
    
    public static void deal(){
//    	String three = "201707";
//    	String two = "2017-06";
//    	String one = "2017-05";
//    	String four = "201607";
//    	String five = "2015-07";
//    	List<String> al = new ArrayList<String>();
//    	al.add(three);
//    	al.add(two);
//    	al.add(one);
//    	al.add(four);
//    	al.add(five);
//		String ne = al.get(0).replaceAll("[^0-9]", ""); 
//		for(int j=1;j<al.size();j++){
//			String we = al.get(j).replaceAll("[^0-9]", ""); 
//			if(Integer.valueOf(ne)-Integer.valueOf(we)==100){
//				System.out.println(we);
//			}
//			if(Integer.valueOf(ne)-Integer.valueOf(we)==200){
//				System.out.println(we);
//			}
//		}
    	String str = "{'99':'00'}";  
        str = str.replaceAll("\\{|\\}", "");
        String[] split = str.split(",");
        System.out.println(split.length);
    }
    
    public static void getArgs(Object... args){
    	
    }
}
