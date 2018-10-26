package genericity.genericity01;

import java.util.List;
/**
 * 通配符设定形参上限
 * @author wc
 *
 */
public class Canvas {
	public void drawAll(List<? extends Graph> shapes){//被限制的泛型通配符，表示所有Graph泛型List的父类
		for(Graph graph : shapes){
			graph.draw(this);
		}
	}
}
