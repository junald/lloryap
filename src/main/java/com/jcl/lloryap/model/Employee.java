package com.jcl.lloryap.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = 2290738809463841602L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// personal info
	@Size(min = 4)
	@Column(length = 50, unique = true, nullable = false)
	private String idNumber;

	@Column(length = 50, nullable = false)
	private String firstName;

	@Column(length = 50, nullable = false)
	private String lastName;

	@Column(length = 50)
	private String middleName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(length = 50)
	private String contactNumber;

	@Column(length = 1024, unique = true, nullable = false)
	private String address;

	@Column(length = 50)
	private String department;
	@Column(length = 50)
	private String position;
	@Column(length = 50)
	private String status; // Contractual,Regular,Resigned,Probationary,Terminated

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateHired;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateEnd;

	// payroll info
	@Column(length = 10)
	private String paymentFrequency; // hourly, monthly, weekly
	@Column(length = 50)
	private String bankAccountNumber;

	@Column
	private Double allowance;
	@Column
	private Double salary;
	@Column
	private Double dailyRate;
	@Column
	private Double hourRate;
	@Column
	private Double minuteRate;

	// Goverment numbers
	@Column(length = 5)
	private String taxID; // s, mi
	@Column(length = 25)
	private String sssNo;
	@Column(length = 25)
	private String tinNo;
	@Column(length = 25)
	private String pagibigNo;
	@Column(length = 25)
	private String philhealthNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public Double getHourRate() {
		return hourRate;
	}

	public void setHourRate(Double hourRate) {
		this.hourRate = hourRate;
	}

	public Double getMinuteRate() {
		return minuteRate;
	}

	public void setMinuteRate(Double minuteRate) {
		this.minuteRate = minuteRate;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public String getSssNo() {
		return sssNo;
	}

	public void setSssNo(String sssNo) {
		this.sssNo = sssNo;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getPagibigNo() {
		return pagibigNo;
	}

	public void setPagibigNo(String pagibigNo) {
		this.pagibigNo = pagibigNo;
	}

	public String getPhilhealthNo() {
		return philhealthNo;
	}

	public void setPhilhealthNo(String philhealthNo) {
		this.philhealthNo = philhealthNo;
	}

}
