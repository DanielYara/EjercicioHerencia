/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHerencia;

/**
 *
 * @author Estudiante
 */
public class Vehiculo {
    protected int horsePower;
    
    public Vehiculo(int x){
        System.out.println("Constructor del padre");
        this.horsePower = x;
    }
    
    public void arrancar(){
        System.out.println("Arrancar padre");
    }
    
    public void detener(){
        System.out.println("Detener padre");
    }
}
