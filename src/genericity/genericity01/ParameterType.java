package genericity.genericity01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ParameterType {
		
	@Test
	public void test(){
		List<Circle> circles = new ArrayList<Circle>();
		Circle circle = new Circle();
		circles.add(circle);
		Canvas canvas = new Canvas();
		canvas.drawAll(circles);
	}
}
