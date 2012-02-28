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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TimeRecord implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = -3843572003689453081L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(length = 20)
	private String type;// present,leave,absent, overtime, undertime

	@Column
	private Integer hours;

	@Column
	private Integer minutes;

	@Column(length = 1000)
	private String notes;

	@Column
	private Date create;

	@Column
	private Date modify;

	@Column
	private Long modifiedBy;

}
