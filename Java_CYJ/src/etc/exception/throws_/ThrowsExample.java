package etc.exception.throws_;

public class ThrowsExample {

	static String[] greetings = {"안녕","헬로","니하오"};
	/*
	 # throws
	 - throws는 예외 원인이 메서드 선언부가 아닌 호출부에 있을경우 예외처리를 메서드의 호출부로 떠넘기는 방식
     - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출시 예외처리 강료하고싶을떄 사용
     -또한 원하는 영역으로 예외를 모아서 한번에 처리하는것도 가능
	 */

	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}
	public static void main(String[] args) {
		
		try {
			greet(3);
		} catch (Exception e) {
			//printStackTrace() 메서드는 예외 발생 원인을 역추적하여
			//예외가 어디에서 발생했는지, 그 이유는 무엇인지를
			//메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드입니다.
			e.printStackTrace();
		}
		

	}

}
