package com.jcl.payroll.lloryap.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PayslipDetail implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = -3107751414805000724L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "payslip_id")
	private Payslip payslip;

	@Column(length = 25)
	private String detailType; // Absent,
	                           // Adjustment,Holiday,IncomeTax,Lates,Leave,OverTime,PagIbig,PhilHealth,SSS,UnderTime,WorkedHours,Others

	@Column(length = 1000)
	private String description;

	@Column
	private Boolean isTaxable;
	@Column
	private Double amount;
	@Column
	private Integer rowNumber;

	private transient Boolean leftSide;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Payslip getPaySlip() {
		return payslip;
	}

	public void setPaySlip(Payslip payslip) {
		this.payslip = payslip;
	}

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsTaxable() {
		return isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}

	public Boolean getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(Boolean leftSide) {
		this.leftSide = leftSide;
	}

}
