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
public class PalaMecanica extends Vehiculo{
    private int PesoMaximodeLevante;

    public PalaMecanica(int PesoMaximodeLevante, int x) {
        super(x);
        this.PesoMaximodeLevante = PesoMaximodeLevante;
    }
    
    public void moverPala(String direccion){
        System.out.println("Mover pala " + direccion);
    }
}
