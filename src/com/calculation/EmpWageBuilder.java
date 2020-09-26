package com.calculation;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;	
	
	
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		System.out.println("Welcome to employee wage problem");
		
		int empHrs=0;
		int empWage=0;
		int totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
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
			empWage=empHrs * empRatePerHour;
			totalEmpHrs += empHrs;
			System.out.println("Day#: " +totalWorkingDays + " Emp Hr: " +empHrs);
			System.out.println("Emp Wage: " +empWage);
		}
		int totalEmpWage= totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " +totalEmpWage);
		return totalEmpWage;
	
	}
	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
	}
}
