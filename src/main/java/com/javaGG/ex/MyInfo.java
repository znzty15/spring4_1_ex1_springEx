package com.javaGG.ex;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbies;
	private BMICalculator bmical;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public BMICalculator getBmical() {
		return bmical;
	}
	public void setBmical(BMICalculator bmical) {
		this.bmical = bmical;
	}
	
	public void bmiCalculation() {
		bmical.bmicalculation(weight, height);
	}
	
	public void getInfoPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		System.out.println("��� : " + hobbies);
		bmiCalculation();
	}

}
