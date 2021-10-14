package com.javaGG.ex;

public class BMICalculator {
	
	private double normal;		//정상
	private double lowWeight;	//저체중
	private double overWeight;	//과체중
	private double obesity;		//비만
	
	public void bmicalculation(double weight, double height) {
		//BMI 지수 : 몸무게 / (키 * 0.01)**2
		
		double h = height * 0.01;
		double bmi_rs = weight / (h*h);
		System.out.println("당신의 BMI 지수 : " +  (int)bmi_rs);
		
		if(bmi_rs > obesity) {
			System.out.println("비만입니다.");
		} else if(bmi_rs > overWeight) {
			System.out.println("과체중 입니다.");
		} else if(bmi_rs > normal) {
			System.out.println("정상 입니다.");
		} else {
			System.out.println("저체중 입니다.");
		}
	}

}
