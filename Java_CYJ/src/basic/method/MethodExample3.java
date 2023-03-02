package basic.method;
/*
 # 반환값 반환유형(return value, return type)
  1. 반환값이란 매서드의 실행결과값
  2. 매개변수는 여러개 존재할수 있지만 반환값을 오직 한개만 존재해야함!
  3. 전달되는 값의 타입을 반환유형이라고함. 매서드 선언시 메서드 이름앞에 반드시 반환유형을 선언해야함
  4. return이라는 키워드를 사용하며 return뒤에 전달할 값을 지정(변수, 상수)
  5. 변환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될수있기때문에 
     반환값을 다른변수에 대입가능, 다른 매서드의 매개값으로도 처리가능
  6. 모든 매서드가 반환값이 있는것은 아님 매서드 실행후에 반환할 값이 딱히 없다면 return을 생략해도됨
  7. return을 생략하고싶다면 매서드 선언시 void라는 키워드를 작성해주어야함
  8. 모든 매서드는 return을 만나면 강제로 매서드가 종료됨. 따라서 조건없이 return문 아래에 코드를 작성할수없음
  9. void는 return 키워드를 탈출기능으로 사용할수있음
 */
public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2){
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
	}
	
	static double[] calcArrayTotal(int... nums){
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		
		double avg = (double) total/nums.length;
		return new double[] {total, avg};
	}
	
	static void multi(int n1,int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	}
	
	static void divide(int n1, int n2) {
		if(n2 ==0) {
			System.out.println("0으로 나눌수 없습니다!");
//			break; continue;둘다 void에선 불가능
			return; //void라 가능
		}
		
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
	
	public static void main(String[] args) {
		
		int r1 = add(3, 8);   //int r1 = 11;
		int r2 = add(10, 15); //int r2 = 25;
		int r3 = add(add(4,6),add(7,8));
		System.out.println(r3);
		
		int[] totalResult = operateTotal(30, 6);	
		System.out.println("30+6 = " + totalResult[0]);
		System.out.println("30-6 = " + totalResult[1]);
		System.out.println("30*6 = " + totalResult[2]);
		System.out.println("30/6 = " + totalResult[3]);
		
		/*
		 1. 메서드 이름은 calcArrayTotal로 정의
		 2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
		 모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
		 리턴하는 메서드입니다.
		 3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
		 합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
		 {57, 89, 78, 91, 93, 47}
		 */
		
		double[] value = calcArrayTotal(57,89,78,91,93,47);
		System.out.printf("%.0f %.2f",value[0],value[1]);
		System.out.printf("\n%d %.2f",(int) value[0],value[1]);
		
		/*
		 -반환값이 없는 void타입의 메서드는 값이 돌아오지않기때문에 실행결과를 변수에 저장할수 없고, 다른매서드의 매개값으로도 사용불가 
		 -반드시 단독 호출 사용
		 -void 메서드는 단순히 동작을 지시하는 역할을 수행
		 */
		
		
		
//		int r4 = multi(10, 7); //(x) //int 선언 X
//		System.out.println(multi(10,7));//X) 결과값이 나옴어오지않기 때문에
		multi(10, 7);
		multi(add(3,4),add(4,7));
//		add(multi(4,4),multi(5,6));//불가능
		
		divide(20,4);

	}

}
