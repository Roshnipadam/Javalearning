package com.except;

public class ThrowSS {
	void  number(int age) {
		
		if(age<18)
		throw new	ArithmeticException("notvalid");
		else
			System.out.println("vote");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowSS roshni=new ThrowSS();
	roshni.number(5);
		
		

	}

}
