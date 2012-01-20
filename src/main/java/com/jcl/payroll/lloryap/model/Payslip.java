package com.jcl.payroll.lloryap.model;

import java.util.List;


public class Payslip {

	private Long id;
	private Employee employee;
	private PayrollPeriod payrollPeriod;
	private String notes;
	private List<PayslipDetail> payslipDetail;

}
