/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0613;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Ejemplo {

    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<>();
        
        lista.add(new Estudiante("1", "Monty", "UwU", "1", 
                "Calle Casimiro"));
        lista.add(new Titular(LocalDate.now(), "Repostera", 
                "Pepi", "Martín", "2", "Calle Torrejón"));
        //lista.add(new Interino(LocalDate.now(), LocalDate.now(), "Mates", "Oso", "Pardo", "3", "Calle Micasa"));
        
        for (Persona persona : lista) {
            persona.indentificate();
        }
        
        for (Persona persona : lista) {
            if (persona instanceof Titular){
                
            }
        }
        
    }
    
}
