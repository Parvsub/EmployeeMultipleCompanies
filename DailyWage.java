package com.employeewage2;

public class DailyWage {

void DailyWage(int Full_Time, int wagePerHour,int employeeHours,int employeeWage){
    double employeeCheck = Math.floor(Math.random() * 10)%2 ;
    if (employeeCheck == Full_Time) {
        employeeHours = 8;
    }
    else {
        employeeHours = 0;
    }
    employeeWage = employeeHours * wagePerHour ;
    System.out.println("dailyEmployeeWage: "+employeeWage);
}

    public static void main(String[] args){
        DailyWage employeeDailywage = new DailyWage();
        employeeDailywage.DailyWage(1,20,0,0);
    }

}

