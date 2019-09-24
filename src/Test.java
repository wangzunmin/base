import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	// 计算两个日期相隔的天数
	public static int nDaysBetweenTwoDate(String firstString, String secondString) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date firstDate = null;
		Date secondDate = null;
		try {
			firstDate = df.parse(firstString);
			secondDate = df.parse(secondString);
		} catch (Exception e) {
			// 日期型字符串格式错误
			System.out.println("日期型字符串格式错误");
		}
		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}
	
	
	public static void main(String[] args) {
		int nDaysBetweenTwoDate = nDaysBetweenTwoDate("20180201", "20180301");
		System.out.println(nDaysBetweenTwoDate);
	}
}
