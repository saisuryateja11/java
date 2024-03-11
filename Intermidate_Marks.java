package com.package_practise1;

public class Intermidate_Marks {
	double sub1;
	double sub2;
	double percentage;
	Address a1;
	public Intermidate_Marks(double sub1, double sub2, double percentage,Address a1) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.percentage = percentage;
		this.a1=a1;
	}
	@Override
	public String toString() {
		return  "Subject 1 : "+sub1+"Subject 2 : "+sub2+"Intermidate Percentage : "+percentage+"Address : " + a1;
		
	}

}
