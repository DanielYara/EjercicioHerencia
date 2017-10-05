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
public class Automovil extends Vehiculo{
    private int CantidadDePuertas;

    public Automovil(int CantidadDePuertas, int x) {
        super(x);
        this.CantidadDePuertas = CantidadDePuertas;
        this.horsePower = 10;
        System.out.println("Constructor del hijo");
    }
    
    public void acelerar(int cuanto){
        System.out.println("Acelera " + cuanto + " km");
    }
    
    @Override
    public void arrancar(){
        System.out.println("Arrancar hijo");
    }

    
}
