package basic;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 # 대입 연산자(=)
		 # 복합 대입 연산자(+=, -=, *=, /=(몫), %=(나머지))
		 - 변수에 값을 대입할때 사용하는 연산자.
		 - 복합대입 연산자는 대입연산자에 산술 연산자가 결합되어있는 형태.
		 */
		
		int a = 5;
		int b = 5;
		
		a += 3; // a = a + 3;
		b = +3; // b = +3;(이러면 b가 3이됨)
		System.out.println(a);
		System.out.println("---------------------------");
		
		//a=8;
		
		a-=4; //4
		System.out.println(a);
		a*=6; //24
		System.out.println(a);
		a/=5; //4
		System.out.println(a);
		a%=3; //1
		System.out.println(a);

	}

}
