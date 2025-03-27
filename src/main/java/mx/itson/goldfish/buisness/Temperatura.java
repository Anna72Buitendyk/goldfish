/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.goldfish.buisness;

/**
 *
 * @author alumnog
 */
public class Temperatura {
    
    /**
     * Convierte grados centigrados hasta grados fahernheit.
     * @param centigrados Temperatura en centigrados representado como float
     * @return Temperatura en fahernheit representados como float
     */
    public static float convertir( float centigrados ){
        return centigrados * (1.8f) + 32;
    }
}
