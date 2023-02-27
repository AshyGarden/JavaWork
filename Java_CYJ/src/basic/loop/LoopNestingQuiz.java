package basic.loop;

public class LoopNestingQuiz {

	public static void main(String[] args) {
		
		/*
        1. 구구단을 다음과 같이 가로로 출력해 보세요.

        2단: 2x1=2 2x2=4 2x3=6 .....
        3단: 3x1=3 3x2=6 3x3=9 .....
        4단: 4x1=4 4x2=8 4x3=12 .....

        2. 구구단을 다음과 같이 세로로 출력해 보세요.
        각 단의 간격은 탭 하나로 고정하겠습니다.
        2단         3단
        2x1=2      3x1=3
        2x2=4      3x2=6
        2x3=6      3x3=9
        .
        .
        .
        */
		
		
		//1.
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단: ",i);
			for(int j=1; j<=9; j++) {
				if(i*j<10) {
					System.out.printf("%dX%d=0%d\t",i,j,i*j);
				} else {
					System.out.printf("%dX%d=%d\t",i,j,i*j);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		//2.
		for(int i=2; i<=9; i++) {
		    System.out.printf("%d단\t",i);
		}
		System.out.println();
		for(int i=1; i<=9; i++) {		
			for(int j=2; j<=9; j++) {
				if(i*j<10) {
					System.out.printf("%dX%d=0%d\t",j,i,j*i);
				} else {
					System.out.printf("%dX%d=%d\t",j,i,j*i);
				}
			}
			System.out.println();
		}
		
		//모범답안
		/*
		 //Q1.
		for(int dan=2; dan<=9; dan++) {
			System.out.print(dan + "단: ");
			
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%dx%d=%d "
						, dan, hang, dan*hang);
			}
			System.out.println();
		}
		
		System.out.println("\n------------------------------\n");
		
		//Q2.
		for(int hang=0; hang<=9; hang++) {
			
			for(int dan=2; dan<=9; dan++) {
				if(hang == 0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t"
							, dan, hang, dan*hang);
				}
			}
			System.out.println();
		}
		  
		  
		 */
		

	}

}