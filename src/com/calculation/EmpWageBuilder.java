package com.calculation;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;	
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	
	public static int computeEmpWage() {
		System.out.println("Welcome to employee wage problem");
		
		int empHrs=0;
		int empWage=0;
		int totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() *10) %3;
			switch(empCheck){
				case IS_FULL_TIME:
					empHrs=8;
					System.out.println("Employee is Present");
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
					System.out.println("Employee is Absent");
			
			}	
			empWage=empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;
			System.out.println("Day#: " +totalWorkingDays + " Emp Hr: " +empHrs);
			System.out.println("Emp Wage: " +empWage);
		}
		int totalEmpWage= totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " +totalEmpWage);
		return totalEmpWage;
	
	}
	public static void main(String[] args) {
		computeEmpWage();
	}
}
