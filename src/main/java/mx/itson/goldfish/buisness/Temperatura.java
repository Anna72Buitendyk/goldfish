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
     * 
     * @param centigrados float temperatura en centigrados
     * @return 
     */
    public float Convertir( float centigrados ){
        return centigrados * (9/5) + 32;
    }
}
