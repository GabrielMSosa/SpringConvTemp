/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversortempCaF.convCaF.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag@
 */
@Entity
@Getter @Setter
public class ConvTempCaF {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String tc;
    private String tf;
    private Boolean tipo; //

    public ConvTempCaF() {
    }

    public ConvTempCaF(Long id, String tc, String tf, Boolean tipo) {
        this.id = id;
        this.tc = tc;
        this.tf = tf;
        this.tipo = tipo;
    }


    
    
}
