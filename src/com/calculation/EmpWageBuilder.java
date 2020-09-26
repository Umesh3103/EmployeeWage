package com.calculation;

public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
		int IS_FULL_TIME =1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck =Math.floor(Math.random() *10) %2;
		if(empCheck == IS_FULL_TIME){
				empHrs=8;
				System.out.println("Employee is Present");
		}
		else{
			empHrs=0;
			System.out.println("Employee is Absent");
		}	
		empWage=empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
	
	}
}
