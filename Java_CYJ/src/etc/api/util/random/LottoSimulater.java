package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoSimulater {
	
	static Random r = new Random();
	static int prize1 = 0; //1등당첨횟수
	static int prize2 = 0; //2등당첨횟수
	static int prize3 = 0; //3등당첨횟수
	static int prize4 = 0; //4등당첨횟수
	static int prize5 = 0; //5등당첨횟수
	static int failCnt = 0; //꽝 당첨횟수
    static List<Integer> lotto = new ArrayList<>();
	
	public static void createLotto(){
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		 */
		Random r = new Random();
		int num;
		while(lotto.size() < 6) {
			num = r.nextInt(45) + 1;
			if(!lotto.contains(num)) {
				lotto.add(num);				
			}
		}
	}
	
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(List<Integer> lottoNums) {
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */
		int bonusNum; //보너스번호
		while(true) {
			bonusNum = r.nextInt(45)+1; //1~45사이의번호
			if(!lottoNums.contains(bonusNum)) {
				return bonusNum;	
			}
		}
	
		
	}
	
	public static void checkLottoNumber(List<Integer> lottoNums,List<Integer> buyNums, int bonus) {
		/*
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨번호를 비교하여
		 일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */
		int counter=0, bonusCounter=0; 
		Collections.sort(lottoNums);
		
		for(int i=0; i<lottoNums.size(); i++) {
			if(lottoNums.contains(buyNums.get(i)) ) {
				counter++;	
			}
		}
		
		if(bonus == createBonusNum(lotto))
			bonusCounter++;
		
		int prize = counter+bonusCounter;
		
		switch(prize) {
		case 7: //이걸 다맞추네;	
			prize1++;		
		case 6: //보너스빼고 6자리 모두정답
			if(bonusCounter ==0) 
				prize1++;
		    else //보너스포함 6자리 정답
				prize2++;
		case 5: //3등
			prize3++;
		case 4: //4등
			prize4++;
		case 3: //5등
			prize5++;
		case 2:	case 1: case 0:
			failCnt++;
		}
	}

	public static void main(String[] args) {
		
		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		//보너스번호도 하나 고정시키세요.
		
		createLotto();
		createBonusNum(lotto);
		List<Integer> inputLotto = new ArrayList<>();	
		int bonusInputNum;
		int buyCount = 0;
		while(prize1 == 0) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
			  반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */	
			System.out.printf("%d번째 복권!\n",buyCount+1);
			buyCount++;
			
			while(inputLotto.size() < 6) { //내가 n번째에 산 복권
				int num = r.nextInt(45) + 1;
				if(!inputLotto.contains(num)) {
					inputLotto.add(num);				
				}
			}
			
			while(true) {
				bonusInputNum = r.nextInt(45)+1;
				if(!inputLotto.contains(bonusInputNum)) 
					break;						
			}
			
			checkLottoNumber(lotto, inputLotto, bonusInputNum);
			inputLotto.clear();
		}
		
		long spendMoney = (long)buyCount*1000;
		System.out.println();
		System.out.print("이번회차 로또 당첨번호는 다음과 같습니다: ");
		System.out.print(lotto + " + ");
		System.out.print(createBonusNum(lotto));
		System.out.println("\nLotto에 쓴 돈: " + spendMoney + "원");
		System.out.printf("1등 당첨횟수: %d회\n", prize1);
		System.out.printf("2등 당첨횟수: %d회\n", prize2);
		System.out.printf("4등 당첨횟수: %d회\n", prize3);
		System.out.printf("4등 당첨횟수: %d회\n", prize4);
		System.out.printf("5등 당첨횟수: %d회\n", prize5);
		System.out.printf("꽝  당첨횟수: %d회\n", failCnt);
		System.out.printf("내가 커피 마실확률: %.12f%%", 1.0/buyCount);
	}

}
