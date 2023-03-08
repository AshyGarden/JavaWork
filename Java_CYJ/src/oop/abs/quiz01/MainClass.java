package oop.abs.quiz01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape r1 = new Rect("정사각형",5);
        Shape c1 = new Circle("원",4);
		
		System.out.printf("Rect의 이름: %s / 한변의 길이가 5인 정사각형의 넓이: %.1f\n",r1.getName(),r1.getArea());
		System.out.printf("Circle의 이름: %s / 반지름이 4인 원의 넓이: %.2f",c1.getName(),c1.getArea());
		//c1.getArea();
		//c1.getName();
	}

}
