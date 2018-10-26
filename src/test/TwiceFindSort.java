package test;
/**
 * 二分查找
 * @author WZM
 *
 * 2018年10月24日
 */
public class TwiceFindSort {
	private int a[];
	private int nElems;

	public TwiceFindSort(int a[]) {
		this.a = a;
		nElems = a.length;
	}


	public int find(int key) {
		int lowBound = 0;
		int upperBound = nElems - 1;
		int cur; // 指针
		while (true) {
			cur = (lowBound + upperBound) / 2;
			if (a[cur] == key) {
				return cur;
			} else if (lowBound > upperBound) {
				return nElems;
			} else {
				if (a[cur] < key) {
					lowBound = cur + 1;
				} else {
					upperBound = cur - 1;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		TwiceFindSort findSort = new TwiceFindSort(new int[]{1,2,3,4,5,6,7,8});
		int find = findSort.find(5);
		System.out.println(find);
	}
}
