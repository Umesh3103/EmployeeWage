package com.calculation;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;	
	private final String company;
	private final int empRatePerHour; 
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
		
	}
	
	public void computeEmpWage() {
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
		totalEmpWage= totalEmpHrs * empRatePerHour;
		
		
	
	}
	@Override
	public String toString(){
		return "Total Emp Wage for company " +company+ " is: "+totalEmpWage; 
	}
	public static void main(String[] args) {
		
		EmpWageBuilder dMart =new EmpWageBuilder("DMart", 20, 2, 10);
		EmpWageBuilder reliance =new EmpWageBuilder("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
