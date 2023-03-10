package etc.api.lang.math;

public class MathQuiz {

	//모범답안(게시판의 페이지로직)
	public static int page2(int num) {
		return (int)Math.ceil(num / 10.0);
	}
	
	
	static int page(int num){
		if(num%10==0)
			return (int)num/10;
		
		return (int) num/10 +1;
	}

	public static void main(String[] args) {
		
		for(int i=1; i<31; i++) {
			if(i!=1&&i%10==1)
				System.out.println();
			System.out.print(page(i));
		}
		
		System.out.print(page2(48));

	}

}
