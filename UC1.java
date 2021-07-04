package com.bl.employeeWage;

public class UC1 {
    public static final int IS_PRESENT=1;
    public static void main(String[] args) {
        int empCheck = (int) (Math.floor(Math.random() *10)%2);
        if (empCheck == IS_PRESENT){
            System.out.println("Is Present");
        }
        else {
            System.out.println("Is Absent");
        }
    }
}
