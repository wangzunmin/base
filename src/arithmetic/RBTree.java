package arithmetic;
/**
 * 红黑树
 * @author WZM
 *
 * 2018年9月10日
 */
public class RBTree<T extends Comparable<T>> {

	boolean color; //颜色
	T key; //关键字(键值)
	RBTree<T> left; //左子节点
	RBTree<T> right; //右子节点
	RBTree<T> parent; //父节点
	
	public RBTree(T key, boolean color, RBTree<T> parent, RBTree<T> left, RBTree<T> right) {
		this.key = key;
		this.color = color;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}
	
	public T getKey() {
		return key;
	}
	
	
}
