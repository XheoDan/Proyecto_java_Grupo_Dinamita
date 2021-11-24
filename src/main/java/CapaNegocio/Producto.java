/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author lushi
 */
public class Producto extends MaquinaCafe{
    //declaracion de atributos
    private String nombre;
    private String costo;
    //declaracion de propiedades

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
     //declaracion de metodos 
    public String SeleccionarProducto()
    {
        return "Este metodo no esta implementado";
    }
    
}
