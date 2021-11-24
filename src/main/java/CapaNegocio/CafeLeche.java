/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author lushi
 */
public class CafeLeche extends Producto{
      //declaracion de atributos
        private String lecheCaliente;
        private String lecheOrigen;
       
        //declaracion de propiedades

    public String getLecheOrigen() {
        return lecheOrigen;
    }

    public void setLecheOrigen(String lecheOrigen) {
        this.lecheOrigen = lecheOrigen;
    }
   
       

    public String getLecheCaliente() {
        return lecheCaliente;
    }

    public void setLecheCaliente(String lecheCaliente) {
        this.lecheCaliente = lecheCaliente;
    }

   
    //declaracion de metodos
    public String CalentarLeche()
    {
        return "Metodo aun no esta implementado";
    }
    
}
