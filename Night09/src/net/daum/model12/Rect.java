package net.daum.model12;

import net.daum.model.ShapeClass;

public class Rect implements ShapeClass {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}

}
