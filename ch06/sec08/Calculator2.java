 package ch06.sec08;

public class Calculator2 {

	//메소드 오버로딩(순서가 다르기 때문) 
	
	//정사각형 넓이 
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형 넓이 
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
