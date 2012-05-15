package com.jcl.lloryap.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Payslip implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = 1756439867374618442L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "period_id")
	private Period period;

	@Column(length = 1000)
	private String notes;

	@OneToMany(mappedBy = "payslip")
	private List<PayslipDetail> payslipDetails;

	@Column(length = 25)
	private String status;

	@Column
        @Temporal(TemporalType.DATE)
	private Date created;

	@Column
        @Temporal(TemporalType.DATE)
	private Date modified;

	private transient List<TimeRecord> dailyTimeRecord; //

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<PayslipDetail> getPayslipDetails() {
		return payslipDetails;
	}

	public void setPayslipDetails(List<PayslipDetail> payslipDetails) {
		this.payslipDetails = payslipDetails;
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

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<TimeRecord> getDailyTimeRecord() {
		return dailyTimeRecord;
	}

	public void setDailyTimeRecord(List<TimeRecord> dailyTimeRecord) {
		this.dailyTimeRecord = dailyTimeRecord;
	}

}
