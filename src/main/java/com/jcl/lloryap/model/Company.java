/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.lloryap.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author JLavador
 */
@Entity
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50, unique = true, nullable = false)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
