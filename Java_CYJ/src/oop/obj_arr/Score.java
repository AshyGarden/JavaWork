package oop.obj_arr;

public class Score {
	
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double average;
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		korScore = kor;
		engScore = eng;
		mathScore = math;
	}
		
	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = this.korScore + this.engScore + this.mathScore;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = this.totalScore / 3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public void scoreInfo() {
		System.out.printf("이름: %s, 국어: %d, 영어: %d,수학: ",
				this.getName(),this.getKorScore(),this.getEngScore(),this.getMathScore());
	}
	
	
	
	
}
