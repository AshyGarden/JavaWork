package oop.constructor;

public class Bread {
	
	String name;
	int price;
	String ingredient;
	
	Bread(){ //기본생성자는 하나 있으면좋음(default 값)
		
	}
	
	Bread(String bName, int bPrice, String bIng){
		System.out.println();
		System.out.printf("곧 %s이(가) 만들어집니다!",bName);
		name = bName;
		price = bPrice;
		ingredient = bIng;
		System.out.println();
		
	}

	void info() {
		System.out.println("***지금 만든 빵!***");
		System.out.println(name);
		System.out.println(price);
		System.out.println(ingredient);
	}
}
