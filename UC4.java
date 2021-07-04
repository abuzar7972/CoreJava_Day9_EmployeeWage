package com.bl.employeeWage;

public class UC4 {
    public static final int IS_PRESENT=1;
    public static final int IS_PART_TIME_PRESENT=2;
    public static final int IS_ABSENT=0;

    public static int computeEmpWage(){
        int empWorkingHours=0, wagePerHours=20, salary=0;
        int empCheck = (int) (Math.floor(Math.random() *10)%3);
        switch (empCheck) {
            case IS_PRESENT:
            System.out.println("Is Present");
            empWorkingHours = 8;
            break;
            case IS_PART_TIME_PRESENT:
            System.out.println("Is part time Present");
            empWorkingHours = 4;
            break;
            case IS_ABSENT:
            System.out.println("Is Absent");
            empWorkingHours = 0;
            break;
        }
        salary = empWorkingHours*wagePerHours;
        System.out.println("salary:: " +salary);
        return salary;
    }
    public static void main(String[] args) {
        computeEmpWage();
    }
}
