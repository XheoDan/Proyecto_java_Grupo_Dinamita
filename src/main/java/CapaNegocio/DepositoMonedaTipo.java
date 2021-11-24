/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author lushi
 */
public class DepositoMonedaTipo  extends DepositoMoneda{
    //declaracion de atributos
        private String denominacion;
   
        //declaracion de propiedades

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
     // declaracion de metodo
    public String VerificarMoneda(){
        return "Este metodo aun no esta implementado";
    }
     public String DevolverMoneda(){
        return "Este metodo aun no esta implementado";
    }
}
