package etc.exception.basic;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		String[] pets = {"강아지","고양이","짹짹이"};
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(pets[i]+" 키우고 싶다.");				
			} catch (Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally {
				//예외발생 여부와 관계없이 항상실행하고 싶은 문장을 작성
				//객체 반납시, 메모리 해제할떄 자주쓰임
				System.out.println("아무튼 실행되는 문장");
				System.out.println("------------------------");
			}
		}
	}

}
