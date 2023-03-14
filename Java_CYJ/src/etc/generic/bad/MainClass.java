package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 Object타입으로 선언하면 무엇이든 저장할수 있지만 
		 반대로 저장했던 값을 꺼내올때는 타입별로 일일이 형변환 해야하는 문제가발생
		 형변환 오류시 예외발생가능 
		 */
		
		
		Box box = new Box();
		box.setObj("홍길동");

		Box box2 = new Box();
		box2.setObj(new String("홍길동"));
		
		 if(box.getObj().equals(box2.getObj())) {
			 System.out.println("같은 이름");
			 System.out.println(((String)box.getObj()).charAt(0));
		 } else {
			 System.out.println("다른 이름");			 
		 }
		
		Box p = new Box();
		p.setObj(new Person());
		
		Person p2 = (Person)p.getObj();
	}

}
