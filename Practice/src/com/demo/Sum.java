package com.demo;

public class Sum {

	public int countSum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	
	
	
	public static void main(String[] args) {
	 Sum sum= new Sum();
	 sum.countSum(10, 10);

	}

}
