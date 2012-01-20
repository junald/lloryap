package com.jcl.payroll.lloryap.model;

import java.util.Date;

public class DailyTimeRecord {

	private Long id;
	private Date date; //present,leave,absent, overtime, undertime
	private String type;
	private Integer hours;
	private Integer minutes;
	private String notes;
	private Date create;
	private Date modify;
	private Long modifiedBy;

}
