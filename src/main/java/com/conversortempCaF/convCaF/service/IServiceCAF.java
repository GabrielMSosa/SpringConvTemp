/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conversortempCaF.convCaF.service;

import com.conversortempCaF.convCaF.model.ConvTempCaF;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IServiceCAF {

    //vamos a hacer solamente el metodo para guardar
    public void saveTemp(ConvTempCaF dato);
    
    public List<ConvTempCaF> mostrar();
    
}

    