package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		Person park = new Person("박영희",25);
		Person hong = new Person("홍길동",24);
		
		System.out.println(park); //객체타입의 변수를 출력하거나 얻을때는 뒤에 자동으로 toString()이 붙어서진행!
		System.out.println(park.toString());

		System.out.println(park.equals(hong));
		System.out.println(park==hong); //위와 아래는 같은 내용
		
		//park.personInfo();
		//hong.personInfo();
		if(hong.equals(park)) {
			System.out.println("이름이 같습니다.");
		} else {
			System.out.println("이름이 다릅니다.");
		}
		
		//finalize는 gc가 호출되는 순서가 보장되지 않기때문에 사용이권장되지는 않음
		//hong = null;
		//park = null;
		//System.gc(); //가비지컬렉터를 호출(부른다고 바로 안올수도 있음)
		
		Person kim = new Person("김씨",100);
		try {
		Person cloneKim = (Person) kim.clone();
		System.out.println("복사된 객체 정보: "+cloneKim);
		System.out.println("kim의 주소: "+kim.hashCode());
		System.out.println("복사된 객체 주소: "+cloneKim.hashCode());	
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
