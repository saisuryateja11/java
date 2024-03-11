package com.package_practise1;

public class EXE {
	public static void main(String[] args) {
		Student1 s1=new Student1("surya",154,
				new TENTH_MARKS(41.61,62.2,83.3,94.4,
				new Address("Telangana","warangal",8)),
				new Intermidate_Marks(34.87,78.8,88,
				new  Address("Telangana","warangal",8)
				),new Degree_marks(23.3,45.6,45.8,99.9,
						new  Address("Telangana","warangal",8))
						, new Address("Telangana","warangal",8)
				);
		System.out.println(s1);
		
		
	}

}

