package com.bl.employeeWage;

public class UC2 {
    public static final int IS_PRESENT=1;
   // public static final int TOTAL_WORKING_HOURS=8;
    //public static final int WAGE_PER_HOURS=20;

   public static int computeEmpWage(){
       int empWorkingHours=0, wagePerHours=20, salary=0;
       int empCheck = (int) (Math.floor(Math.random() *10)%2);
       if (empCheck == IS_PRESENT){
           System.out.println("Is Present");
           empWorkingHours = 8;
       }
       else {
           System.out.println("Is Absent");
           empWorkingHours = 0;
       }
       salary = empWorkingHours*wagePerHours;
       System.out.println("salary:: " +salary);
       return salary;
   }
    public static void main(String[] args) {
        computeEmpWage();
    }
}
