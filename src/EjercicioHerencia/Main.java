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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil(4, 4);
        PalaMecanica pala = new PalaMecanica(30, 4);
        auto.arrancar();
        auto.detener();
        pala.moverPala("30 grados a la derecha.");
    }
    
}
