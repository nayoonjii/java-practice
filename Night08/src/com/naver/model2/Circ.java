package com.naver.model2;

import com.naver.model.ShapeClass;

//추상클래스를 상속받은 자손클래스
public class Circ extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}

}
