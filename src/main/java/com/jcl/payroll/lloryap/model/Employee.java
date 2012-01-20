package com.jcl.payroll.lloryap.model;

import java.util.Date;

public class Employee {

    private Account account;
    //personal info
    private String idNumber;

    private String firstName;
    private String lastName;
    private String middleName;
    private String contactNumber;
    private String address;

    private String department;
    private String position;
    private String status; //Contractual,Regular,Resigned,Probationary,Terminated

    private Date dateHired;
    private Date dateEnd;


    //payroll info
    private String paymentFrequency; //hourly, monthly, weekly
    private String bankAccountNumber;
    private Double allowance;
    private Double salary;
    private Double dailyRate;
    private Double hourRate;
    private Double minuteRate;

    //Goverment numbers
    private String taxID; //s, mi
    private String sssNo;
    private String tinNo;
    private String pagibigNo;
    private String philhealthNo;



}
