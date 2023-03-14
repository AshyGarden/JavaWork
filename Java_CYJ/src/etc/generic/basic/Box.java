package etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언
	
	//박스 생성시 들어올 타입을 모르기에 타입을 T(아무 문자나 가능)로 지정
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	} 
	
	
	

}
