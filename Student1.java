package com.package_practise1;

public class Student1 {
	String Name;
	int id;
	 TENTH_MARKS t1;
	 Intermidate_Marks i1;
	 Degree_marks d;
	Address a1;
	
	


	public Student1(String Name, int id, TENTH_MARKS t1, Intermidate_Marks i1,Degree_marks d, Address a1) {
	
		this.Name = Name;
		this.id = id;
		this.t1 = t1;
		this.i1 = i1;
		this.d = d;
		this.a1=a1;
		
	}
	@Override
	public String toString() {
		return "NAME OF THE STUDENT :  "+Name+"STUDENT ID : "+id+"  Tenth marks  :    "+ t1+ "  Intermidate marks :    " + i1+ "degeree     "+d+"  Address    "+a1;
	}
}
