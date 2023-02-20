package basic;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감연산자(++,--)
		//변수의 값을 단순히 하나 올리거나 내릴때 사용
		
		
		int i = 1;
//		i = i + 1;
//		i++;
//		i++;
//		++i;
//		i--;
//		--i;
//		System.out.println(i);
		
		int j = i++; //후위연산(선연산 후증감)
		int k = i--; //후위연산(선연산 후증감)
		System.out.println("i의 값:" + i); //i=1;
		System.out.println("j의 값:" + j); //j=1; 이후 i가 증가 =2;
		System.out.println("k의 값:" + k); //k=2; 이후 i가 감소 =1;

		System.out.println("----------------------------------");
		
		int x = 1;
		int y = ++x; //전위연산(선증감 후연산)
		int z = --x; //전위연산(선증감 후연산)
		System.out.println("x의 값:" + x); //x=1;
		System.out.println("y의 값:" + y); //연산완료 y=2;
		System.out.println("z의 값:" + z); //연산완료 z=1;
		
		
		int a = 3;
		int b = a++ +5*3;
		int c = ++a +5*3;
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
				
		
	}

}
