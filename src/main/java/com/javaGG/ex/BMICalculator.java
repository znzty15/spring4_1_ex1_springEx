package com.javaGG.ex;

public class BMICalculator {
	
	private double normal;		//����
	private double lowWeight;	//��ü��
	private double overWeight;	//��ü��
	private double obesity;		//��
	
	public void bmicalculation(double weight, double height) {
		//BMI ���� : ������ / (Ű * 0.01)**2
		
		double h = height * 0.01;
		double bmi_rs = weight / (h*h);
		System.out.println("����� BMI ���� : " +  (int)bmi_rs);
		
		if(bmi_rs > obesity) {
			System.out.println("���Դϴ�.");
		} else if(bmi_rs > overWeight) {
			System.out.println("��ü�� �Դϴ�.");
		} else if(bmi_rs > normal) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("��ü�� �Դϴ�.");
		}
	}

}
