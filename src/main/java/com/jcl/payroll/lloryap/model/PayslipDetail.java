package com.jcl.payroll.lloryap.model;

public class PayslipDetail {

	private Long id;
	  private Payslip paySlip;
	   private String detailType;  //Absent, Adjustment,Holiday,IncomeTax,Lates,Leave,OverTime,PagIbig,PhilHealth,SSS,UnderTime,WorkedHours,Others
	    private String description;
	    private boolean isTaxable;
	    private double amount;
	    private int rowNumber;
	    private boolean leftSide;
}
