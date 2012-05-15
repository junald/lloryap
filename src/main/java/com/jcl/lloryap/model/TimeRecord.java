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

    private static final long serialVersionUID = -3843572003689453081L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Column(length = 20)
    private String type;// present,leave,absent, overtime, undertime
    @Column
    private Integer hours;
    @Column
    private Integer minutes;
    @Column(length = 1000)
    private String notes;
    @Column
    @Temporal(TemporalType.DATE)
    private Date create;
    @Column
    @Temporal(TemporalType.DATE)
    private Date modify;
    @Column
    private Long modifiedBy;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the transactionDate
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the hours
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    /**
     * @return the minutes
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the create
     */
    public Date getCreate() {
        return create;
    }

    /**
     * @param create the create to set
     */
    public void setCreate(Date create) {
        this.create = create;
    }

    /**
     * @return the modify
     */
    public Date getModify() {
        return modify;
    }

    /**
     * @param modify the modify to set
     */
    public void setModify(Date modify) {
        this.modify = modify;
    }

    /**
     * @return the modifiedBy
     */
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy the modifiedBy to set
     */
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
