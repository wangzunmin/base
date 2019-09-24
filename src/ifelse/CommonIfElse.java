package ifelse;
/**
 * 使用if...else...的弊端在于：不利于对程序的扩展，如果新添加了一个颜色类型，
 * 		那么就得去修改程序再添加一个if...else...分支，根据“开-闭原则”的宗旨：对扩展开，对修改闭
 * @author wangzunmin
 *
 */
public class CommonIfElse {
	public static void main(String[] args) {
		 MyPaper myPaper = new MyPaper(PaperColor.RED);
		 if(myPaper.getPaperColor() == PaperColor.BLACK){
			 System.out.println("You need a black pen!");
		 }else if(myPaper.getPaperColor() == PaperColor.BLUE) {
			 System.out.println("You need a blue pen!");
		 }else if(myPaper.getPaperColor() == PaperColor.RED) {
			 System.out.println("You need a red pen!");
		 }else if(myPaper.getPaperColor() == PaperColor.WHITE) {
			 System.out.println("You need a white pen!");
		 }
	}

}
