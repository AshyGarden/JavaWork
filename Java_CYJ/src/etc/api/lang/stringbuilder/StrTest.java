package etc.api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		//string test
//		String str = "a";
//		for(int i=1; i<=500000; i++) {
//			str += "a";
//		} //28초소요
		
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=50000000; i++) {
			sb.append("a");
		} //0.012초
	
		long end = System.currentTimeMillis();
		System.out.println("실행 소요시간: " +(end-start)*0.001+"초");
		
	}

}
