package com.bl.employeeWage;

public class UC3 {
    public static final int IS_PRESENT=1;
    public static final int IS_PART_TIME_PRESENT=2;
    //public static final int WAGE_PER_HOURS=20;

    public static int computeEmpWage(){
        int empWorkingHours=0, wagePerHours=20, salary=0;
        int empCheck = (int) (Math.floor(Math.random() *10)%3);
        if (empCheck == IS_PRESENT){
            System.out.println("Is Present");
            empWorkingHours = 8;
        }
        else if (empCheck == IS_PART_TIME_PRESENT){
            System.out.println("Is part time Present");
            empWorkingHours = 4;
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

