package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		
		//2~19까니 난수생성 구구단
		int randNum = (int) (Math.random()*18+2);
		System.out.printf("%d단! \n",randNum);
		
		for(int i=1; i<=9;i++)
		{		
				System.out.printf("%d X %d = %d\n", randNum, i, randNum*i);		
		
	    }
		
		/*

		*/

		//2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요. (for)
		//19행까지 출력하세요.
//		int dan = (int) ((Math.random()*18) + 2);
//			
//		System.out.println("*** 구구단 " + dan + "단 ***");
//		System.out.println("--------------------------");
//		for(int hang=1; hang<=19; hang++) {
//			System.out.printf("%d x %d = %d\n"	, dan, hang, dan*hang);
//		}
//			
		
		
	}
	
}
