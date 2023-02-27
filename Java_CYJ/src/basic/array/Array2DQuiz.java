package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {
		int[][] score = {
				{79, 80 ,99}, //a학생
				{95, 85, 89}, //b학생
				{90, 65, 56}, //c학생
				{69, 78, 77}  //d학생
				//3과목
		};
		
		String[] stuName = {"A","B","C","D"};
		String[] subName = {"국어","영어","수학"};
		
		/*
		 1. 각 학생의 평균을 소수점 첫째자리까지 출력
		 2. 각과목의 평균
		 3. 반평균
		 */
		String n="";
		int total=0;
		//학생평균
		for(int i=0; i<score.length; i++) {
			
			int[] inArr = score[i];
	        for (int j = 0; j < inArr.length; j++) {
	        	 total += score[i][j];
	             //System.out.print(inArr[j] + " "); 
	        	 //System.out.println(total);
	         }
	       
	        System.out.printf("%s의 평균 = %.1f",stuName[i],(double)total/subName.length);
	        System.out.println();
//	        System.out.printf("%s의 평균 = %.1f",subName[i],(double)total/subName.length);	        
	        total =0;	
			//System.out.printf("%s의 평균: %.1f\n",n,(double)total/subName.length);			
		}
		
		//과목평균
        for(int i=0; i<subName.length; i++) {
			
			int[] inArr = score[i];
	        for (int j = 0; j < stuName.length; j++) {
	        	 total += score[j][i];
	             //System.out.print(inArr[j] + " ");
	         }
	        System.out.printf("%s의 평균 = %.1f",subName[i],(double)total/stuName.length);
	        System.out.println();
         // System.out.printf("%s의 평균 = %.1f",subName[i],(double)total/subName.length);	        
	        total =0;	
			//System.out.printf("%s의 평균: %.1f\n",n,(double)total/subName.length);			
		}
//        
		//반평균
        for(int i=0; i<score.length; i++) {
			
			int[] inArr = score[i];
	        for (int j = 0; j < inArr.length; j++) {
	        	 total += score[i][j];
	             //System.out.print(inArr[j] + " ");
	         }
	       
//	        System.out.printf("%s의 평균 = %.1f",subName[i],(double)total/subName.length);	        
	        	
			//System.out.printf("%s의 평균: %.1f\n",n,(double)total/subName.length);			
		}
        System.out.printf("반 평균 = %.1f",(double)total/(stuName.length*subName.length));
        System.out.println();
        
        
        /*
          
        //1. 학생의 평균
         double totalAvg = 0.0; //학생들의 평균점수총합
         int idx = 0;//stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수
         for(int[] stu: score){ //학생 1명의 점수
             
             int total=0;      //1명씩 평균을 구하기위해 여기에 선언(반복문 돌때 total다시 0이 되야해서)
             for(int s : stu){
                 total += s;
             }
             
             double avg = (double) total /subName.length; 
             System.out.printf(%s의 평균: %.1f점\n",stuName[idx], avg);
             idx++;
         }
         
         //3. 반평균
            for(int[] stu : score) {
			int total = 0;
			for(int s : stu) {
				total += s;
			}
			double avg = (double) total / subName.length;
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++;
		}
		
		double classAvg = totalAvg/stumae.blength.
		System.out.printf("반 평균: %.1f점\n", classAvg);
		
		
         */   

	}

}
