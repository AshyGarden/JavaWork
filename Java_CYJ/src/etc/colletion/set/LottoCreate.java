package etc.colletion.set;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int inputCounter = 1;
		Random r = new Random();
		List<Integer> lotto = new ArrayList<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		
		
		List<Integer> inputNum = new ArrayList<>();		
		while(inputNum.size() < 6) {
			System.out.println("엔터키로 복권번호를 하나 생성합니다.");
			sc.nextLine();
			int randNum = r.nextInt(45) + 1;
			if(inputNum.contains(randNum)) {
				System.out.println("이미 있는번호입니다. 입력창으로돌아갑니다.");
			} else {
				System.out.println("%d번째 입력숫자: " + inputCounter);
				inputNum.add(randNum);
				inputCounter++;
			}
		}
		
		Collections.sort(lotto);
		Collections.sort(inputNum);
		
		System.out.println(lotto);
		System.out.println(inputNum);
		
	}

}
