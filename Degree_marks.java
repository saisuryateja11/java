package com.package_practise1;

public class Degree_marks {
	double Firstyear;
	double Secondyear;
	double ThirdYear;
	double percentage;
	Address a1;
	public Degree_marks(double firstyear, double secondyear, double thirdYear, double percentage, Address a1) {
		
		this.Firstyear = firstyear;
		this.Secondyear = secondyear;
		this.ThirdYear = thirdYear;
		this.percentage = percentage;
		this.a1=a1;
	
	}
	@Override
	public String toString() {
		return "Firstyear marks"+Firstyear+"SecondYear marks"+Secondyear+"ThirdYear marks : "+ThirdYear+"Address"+a1;
	}
	

}
