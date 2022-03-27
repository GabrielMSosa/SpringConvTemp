/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversortempCaF.convCaF.service;

import com.conversortempCaF.convCaF.model.ConvTempCaF;
import com.conversortempCaF.convCaF.repository.ConvCaFRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
//agregamos la notacion service en los servicio !!!
@Service
public class ConvCaFService implements IServiceCAF {
 
    @Autowired
    private ConvCaFRepository  miconv; //nyectamos dependencias
    
    @Override
    public void saveTemp(ConvTempCaF dato){
    //vamos a guardar en la base de datos las conversiones
    miconv.save(dato);
    }
    @Override
    public List<ConvTempCaF> mostrar(){
    
    List<ConvTempCaF> milista=miconv.findAll();
    return milista;
    
    }
    }
