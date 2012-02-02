package com.jcl.payroll.lloryap.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Period implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = -2324412631900500900L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 25)
	private String payrollPeriodCode;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateFrom;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateTo;

	@Column(length = 1000)
	private String notes;

	@Column(length = 25)
	private String status; // open, closed, cancel

	@Column
	private Date created;

	@Column
	private Date modify;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayrollPeriodCode() {
		return payrollPeriodCode;
	}

	public void setPayrollPeriodCode(String payrollPeriodCode) {
		this.payrollPeriodCode = payrollPeriodCode;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModify() {
		return modify;
	}

	public void setModify(Date modify) {
		this.modify = modify;
	}

}
