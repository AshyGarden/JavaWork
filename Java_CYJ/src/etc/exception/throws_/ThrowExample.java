package etc.exception.throws_;

public class ThrowExample {

	static int calcTotal(int num) {
		int total =0;
		for(int i=1; i<num; i++) {
			total+=i;
		}
		return total;
	}
	public static void main(String[] args) {
		
		System.out.println(calcTotal(100));
		System.out.println(calcTotal(-120));

	}

}
