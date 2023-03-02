package basic.method;

/*
 # 매개 변수 (parameter, argument)
  
  1. 매개변수는 메서드를 호출시, 매서드 실행에 필요한 값들을 메서드 내부로 전달하는 매개체역할
  2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라 메서드의 실행결과는 달라질수있다.
  3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할때 선언부에서 ()안에 미리 개수와 타입을 지정합니다.
  4. 매개변수 작명시 호출자가 선언부로 돌아와서 매개값을 확인하지않게 어떤값을 담는 변수인지 그 뜻을 알기쉽게 지어주면 서로에게좋음
  5. 매개변수를 하나도 선언하지 않을수 있음 이때 메서드 선언부 내부를 비워둠, 호출시에도 비워둠
  
 */



public class MethodExample2 {
	
	//x부터 y까지 누적합계를 구하는 메서드, 매개변수 갯수는 최대 255개
	static int calcRangeTotal(int start, int end) { //매개변수 이름을 자세하게 적어주는게 좋음
		int total = 0;
//		if(x>y) {
//			int temp = x;
//			x = y;
//			y = temp;
//		}
		for(int i=start; i<=end; i++){
			total += i;
		}
		return total;
	}
	
	//매개변수가 필요없는 경우
	static String selectRandomFood() { //메소드는 매개변수가 없어도 괄호는 붙여줘여함(함수형식)
		double rn = Math.random();//0.0이상 1.0미만
		if(rn > 0.66) {
			return "치킨";
		} else if(rn > 0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	//정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) { //개수미정(배열로 보내주기)
		int total = 0;
//		for(int i=0; i<nums.length; i++) { //일반 for문
//			total += nums[i];
//		}
		for(int n : nums) { //foreach문
			total += n;
		}
		
		return total;
	}
	
	//가변인수(가변파라미터)를 사용한 매개변수 작성(n개를 전달하면 n개를 받아주는 느낌)
	//콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로전달
	static int calcNumberTotal2(int... nums) { //타입... nums 
		                                       //전달하는 int의 값들을 
		int total = 0;
		for(int i : nums) { 
			total += i;
		}
		return total;
	}
	

	public static void main(String[] args) {
		int result =calcRangeTotal(3, 7);
		System.out.println(result);
		System.out.println("오늘 점심 뭐먹지???: " + selectRandomFood());
		
		int[] arr = {10, 30, 50, 70, 90, 110 };
		System.out.println("배열 요소들의 총합은???: " + calcNumberTotal(arr));
		
		int sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7}); //바로 선언도 가능
		System.out.println("누적합 :" + sum);
		
		//가변인수(가변 파라미터)를 사용한 매개변수 작성.
		//콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달합니다.
		int sum2 = calcNumberTotal2(1,2,3,4,5,6,7);
		System.out.println("누적합: "+sum2);

	}

}
