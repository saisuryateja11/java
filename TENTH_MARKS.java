package com.package_practise1;

public class TENTH_MARKS {
	double sub1;
	double sub2;
	double sub3;
	double percentage;
	Address a1;
	public TENTH_MARKS(double sub1, double sub2, double sub3, double percentage,Address a1) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.percentage = percentage;
		this.a1=a1;
	}
	@Override
	public String toString() {
		return "Subject 1 : "+sub1+"Subject 2 : "+sub2+"TENTH Percentage : "+percentage+"Subject 3:"+sub3+"Address : "+a1;
	}
 

}
