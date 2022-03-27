/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversortempCaF.convCaF.controller1;

import com.conversortempCaF.convCaF.model.ConvTempCaF;
import com.conversortempCaF.convCaF.service.IServiceCAF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */

@RestController
public class MiController {
    
   @Autowired
   private IServiceCAF inter;
   
    
    @GetMapping("conver/mostrar")
 public List<ConvTempCaF> mostrar(){
 return inter.mostrar();
 
 }
   
 @PostMapping("/conver/cargar")
 public String subir(@RequestBody ConvTempCaF dato
 ){ 
     
     
     System.out.println(dato.getTc());
     System.out.println(dato.getTf());
     Float TC=Float.parseFloat(dato.getTc());
     Double TF=(TC)*(9.0/5.0)+32.0;
     
     System.out.println(TC);
     System.out.println(TF);
     //  System.out.println(xF);
     dato.setTf(TF.toString());
     
 //dato.setTF(xF);
inter.saveTemp(dato);
 String x="La conversion de " +TC+"  grados celsius a Faranheit es :"+TF;
 return x;
 
 }
 
         
    
}
