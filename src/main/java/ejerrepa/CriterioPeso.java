/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerrepa;

import java.util.Comparator;



/**
 *
 * @author noelia
 */
public class CriterioPeso implements Comparator <Silla> {

    @Override
    public int compare(Silla o1, Silla o2) {
        return Integer.compare(o1.peso, o2.peso);
    }
    
    
    
}
