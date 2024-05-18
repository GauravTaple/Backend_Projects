package com.example.spring_mapstruct.builder;

public class CutomerBuilder {
	public static void main(String[] args) {
//		Customer cust = new Customer(10, "darsh", "pune", 15);
//		System.out.println(cust);
//		System.out.println(cust.getAge()+cust.getName()+cust.getId()+cust.getCity());
		
		
//----------1st way using class-----------------------------		
//		Customer build = Customer.builder().age(15).name("sam").id(15).city("ahmednagar").build();
//		System.out.println(build.getAge()+build.getName());
		
		
//----------2nd way using constructor---------------------
//		Customer b2=Customer.builder().id(1).name("manas").build();
//		System.out.println(b2);
		

//-----------3rd way using method-------------------------
		Customer build1 = Customer.builder().name("Gaurav").id(10).build();
		System.out.println(build1);

	}

}
