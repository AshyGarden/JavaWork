package oop.encap.good;

public class MyBirth {
	
	/*
	 # 캡슐화(은닉): 데이터 보호의 목적으로 사용하는
	 OOP 기술 중 하나.
	 
	 - 외부에서 직접 변수에 접근할 수 없도록 멤버변수에 private 제한을 붙임.
	 */
	
	private int year;
	private int month;
	private int day;
//	private int pw;
	/*
	  -캡슐화는 데이터에 접근 제한을 걸어서 정보를 보호하는것이 목적이지만
	    private을 설정하면 데이터 접근 자체가 불가능해짐.
	 
	  -따라서 데이터의 유효성을 검증할수 있는 제어문이 포함된 메서드를 사용하여 데이터 접근허용
	    getter/setter매서드이용
	
	//# setter method
	 1. setter는 숨겨진 변수에 값을 저장하기위한 매서드
	 2. 유효성검증로직을 작성하여 적절한 데이터만 멤버변수에 저장시키고 
	    접근제한자는 public으로설정하여 외부에서도 사뇽가능하게함
	 3. 매서드이름은 일반적으로 set+멤버변수이름으로설정
	 */
	
	public void setYear(int year) {
		if(year <1900||year>2023) {
			System.out.println("잘못된 연도 입력입니다.");
		} else{
			this.year = year;
		}
	}
	/*
	//# setter method
		 1. getter는 숨겨진 변수에 값을 참조하기위한 매서드
		 2. setter와 마찬가지로 public제한을 통해 외부에 매서드 공개 
		    매서드이름은 일반적으로 get+멤버변수이름으로설정
		 
		 */
	public int getYear(String pw) {
		if(pw.equals("abc1234")) {
			return this.year;		
		} else {
			System.out.println("잘못된 입력입니다.");
			return 0;
		}
	}
	
	/*
    - month와 day의 setter / getter 메서드를 선언하세요.
    - month: 1 ~ 12
    - day: 1 ~ 31
    - getter 메서드는 따로 비밀번호 등 권한 검사 없이
     바로 return 속성값 해 주세요.
    */
	
	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("잘못된 월 입력입니다.");
		} else{
			this.month = month;
		}
	}
	public int getMonth() {		
		return this.month;		
	}
	
	public void setDay(int day) {
		int month = this.month;
		switch(month) {
		case 2:	
			if(month%4==0) {
				if(day<1||day>29) {
					System.out.println("잘못된 일 입력입니다.");
				} else{
					this.day = day;
					break;
				}
			} else {
				if(day<1||day>28) {
					System.out.println("잘못된 일 입력입니다.");
				} else{
					this.day = day;
					break;
				}
				
			}
		case 4:	case 6:	case 9:	case 11:	
			if(day<1||day>30) {
				System.out.println("잘못된 일 입력입니다.");
			} else{
				this.day = day;
				break;
			}
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1||day>31) {
				System.out.println("잘못된 일 입력입니다.");
			} else{
				this.day = day;
				break;
			}	
				
		}	
	}
	public int getDay() {		
			return this.day;		
	}

}
