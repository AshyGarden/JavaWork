package etc.api.lang.obj;

public class Person implements Cloneable{
	
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//alt + shift + s ->Generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age+"]";
	}


	@Override
	public boolean equals(Object obj) { //받는 값이 object = 어떤 값이든 받을수있음
		//전달되는 obj가 person으로 받을수 있는지 검사 로직이 필요!(instanceOf!)
		if(obj instanceof Person) {
			Person p = (Person) obj; //obj타입을 자식타입으로 내려야함(그래야 비교가능)
			if(this.name.equals(p.name)) {
				return true;
			}
		}
		return false; //if문이 거짓 = person값을 못가지는 경우

	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동호출(GC실행시)
		System.out.println(this.name + "이 소멸되었습니다.");
		super.finalize();
	}

	//cloneable 인터페이스 구현해서 사용
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void personInfo() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age + "세");
	}
}
