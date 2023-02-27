package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//사원의 정보": 사번 이름 나이 부서명
		
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages =  new int[100];
		String[] departments = new String[100];
		//String whileBreaker = "돌아가기";
		boolean flag;
		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는변수.
		int count= 0;
		
		while(true) {
			System.out.println("\n=======사원관리프로그램===========");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 모두보기");
			System.out.println("# 3. 사원정보 검색");
			System.out.println("# 4. 사원정보 수정");
			System.out.println("# 5. 사운정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("\n=======사원관리프로그램===========");
			
			
			System.out.print("> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
                //사번은 중복되면 안됩니다.(사번만 중복시 다시입력)
                //(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
				System.out.println("1.사원번호 신규등록을 선택하셨습니다.");
				input1 : while(true) {
				    System.out.println("돌아가기를 적으시면 메뉴로 돌아갑니다.");
				    //////////////////////////
					System.out.println("사원번호를 입력하세요");
					String depNum = sc.next();
					for(int j=0; j<userNums.length; j++) {					
						if(depNum.equals(userNums[j])||depNum.equals("돌아가기")) {
							System.out.println("이미 있는 번호입니다. 메뉴로 돌아갑니다.");
							break input1;
						}	
					}
					userNums[count] = depNum;
					/////////////////////////
					
					System.out.println("사원의 이름을 입력하세요");
					String newName = sc.next();
					names[count] = newName;
					
					
					System.out.println("사원의 나이를 입력하세요");
					int newAge = sc.nextInt();
					ages[count] = newAge;
					
					///////////////
					System.out.println("사원의 부서를 입력하세요");
					String newDep = sc.next();
					departments[count] = newDep;
				    //////////////
					System.out.println("입력된 정보는 다음과 같습니다.");
					System.out.println("사원번호: " + userNums[count]);
					System.out.println("사원이름: " + names[count]);
					System.out.println("사원나이: " + ages[count]);
					System.out.println("사원부서: " + departments[count]);
					count++;			
				}
				
			} else input2: if(menu == 2){
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
                //만약 사용자가 사원 등록을 한 명도 하지 않았다면(등록이 0명일때)
                //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				System.out.println("현재 저장된 모든사원 정보는 다음과 같습니다: ");
				System.out.println("사원번호/사원이름/사원나이/사원부서 " );
				for(int i=0; i<count; i++ ) {
					if(count==0) {
						System.out.println("등록된 사원 정보가 없습니다.");
						System.out.println("메뉴로 돌아갑니다.");
						break input2;
					}
					System.out.println(userNums[i] + "/"+ names[i]+ "/"+ ages[i]+ "/"+ departments[i]);							
				}
				
				
			}   else input3: if(menu==3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
                //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.println("3.사원번호 검색을 선택하셨습니다.");
				System.out.println("사원번호를 입력하세요");
				String depNum = sc.next();
				for(int j=0; j<userNums.length; j++) {					
					if(depNum.equals(userNums[j])) {
						System.out.println(userNums[j] + "/"+ names[j] +"/" + ages[j]+ "/"+ departments[j]);	
						break input3;
					}	
				}
				System.out.println("입력하신 사번의 사원정보는 다음과 같습니다: ");
				System.out.println("사원번호/사원이름/사원나이/사원부서 " );
				
				System.out.println("존재하지 않는 사원번호입니다.");
				break input3;
				
			}   else input4 :if(menu==4) {		
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.println("4. 사원번호 수정을 선택하셨습니다");
				System.out.println("사원번호를 입력하세요");
				String depNum = sc.next();
				System.out.println("입력하신 사번의 사원정보는 다음과 같습니다: ");
				System.out.println("사원번호/사원이름/사원나이/사원부서 " );
				for(int j=0; j<userNums.length; j++) {					
					if(depNum.equals(userNums[j])) {		
						System.out.println(userNums[j] + "/"+ names[j] +"/" + ages[j]+ "/"+ departments[j]);	
						
						System.out.println("어떤 정보를 바꾸시겠습니까?(사원나이 1번/ 부서변경 2번/ 취소 3번");
						int inputNum = sc.nextInt();
						
						input4_1: while (true) {
							switch(inputNum) {
							case 1:
								System.out.println("사원나이변경을 선택하셨습니다. 변경될 나이를 입력해주십시오: ");
								int num = sc.nextInt();
								ages[j] = num;
								System.out.println("사원나이 수정후 정보는 다음과 같습니다.");
								System.out.println("사원번호/사원이름/사원나이/사원부서 " );
								System.out.println(userNums[j] + "/"+ names[j] +"/" + ages[j]+ "/"+ departments[j]);
								break input4_1;
							case 2:
								System.out.println("사원부서변경을 선택하셨습니다. 변경될 부서를 입력해주십시오: ");
								String dep = sc.next();
								departments[j] = dep;
								System.out.println("사원부서 수정후 정보는 다음과 같습니다.");
								System.out.println("사원번호/사원이름/사원나이/사원부서 " );
								System.out.println(userNums[j] + "/"+ names[j] +"/" + ages[j]+ "/"+ departments[j]);
								break input4_1;
							case 3:
								System.out.println("취소하셨습니다. 메뉴로 돌아갑니다.");
								break input4;						
							default:
								System.out.println("잘못 입력하셨습니다.");
							}						
						}							
					}			
				}
				
			}   else input5: if(menu==5) {
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.println("5.사원번호 삭제를 선택하셨습니다.");
				System.out.println("삭제할 사원번호를 입력하세요");
				String depNum = sc.next();
				for(int j=0; j<userNums.length-1; j++) {					
					if(depNum.equals(userNums[j])) {
						System.out.println("입력하신 사번의 사원정보는 다음과 같습니다: ");
						System.out.println("사원번호/사원이름/사원나이/사원부서 " );
						System.out.println(userNums[j] + "/"+ names[j] +"/" + ages[j]+ "/"+ departments[j]);
						System.out.printf("정말로 %s의 사원번호를 삭제하시겠습니까? (Y/N)", depNum);
						String yes = sc.next();
						if( yes.equals("y")||yes.equals("Y")) {
							for(int i=0; i<userNums.length-1; i++) 
								userNums[i] = userNums[i+1];
				
							for(int i=0; i<names.length-1; i++) 
								names[i] = names[i+1];
							
							for(int i=0; i<ages.length-1; i++) 
								ages[i] = ages[i+1];
							
							for(int i=0; i<departments.length-1; i++) 
								departments[i] = departments[i+1];
							
							count--;
							
							System.out.println();
							System.out.println("삭제후 저장된 모든사원 정보는 다음과 같습니다: ");
							System.out.println("사원번호/사원이름/사원나이/사원부서 " );
							for(int i=0; i<count; i++ ) {
								if(count==0) {
									System.out.println("현재 등록된 사원 정보가 없습니다.");
									System.out.println("메뉴로 돌아갑니다.");
									break input5;
								}
								System.out.println(userNums[i] + "/"+ names[i]+ "/"+ ages[i]+ "/"+ departments[i]);							
							}	
							
							
						} else {
							System.out.println("존재하지 않는 사원번호입니다.");
							break input5;	
						}						
					}	
				}
				
				
			}   else if(menu==6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("메뉴를 잘못입력하셨습니다.");	
			}
	
		}
		
		
		
	}

}
