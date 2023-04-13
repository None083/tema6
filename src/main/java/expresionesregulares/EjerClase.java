/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author noelia
 * 
 * 1.Detectar N,S,E,O
 * localización: N
 * localización: S
 * localización: E
 * localización: O
 * 
 * 2.Encontrar si alguna línea cumple "ini, 2 numeros, fin" = ini77fin(ejemplo)
 * 
 * 3.Cumplir letraNumero tantas veces como se quiera = a7b5c8 o a7(ejemplo, puede darse una vez o muchas)
 * 
 * 
 */
public class EjerClase {
    
    public static void main(String[] args) {
        
        String regexNSEO="^[NSEO]$";
        String ejemploNSEO="S";
        System.out.println(ejemploNSEO.matches(regexNSEO));
        
        String regexNSEOLibre="[NSEO]";
        String ejemploNSEOLibre="uwu S";     
        // da falso porque el .matches es como si tuviera puesto ^ $
        System.out.println(ejemploNSEOLibre.matches(regexNSEOLibre));
        
        final Pattern pattern = Pattern.compile(regexNSEOLibre, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(regexNSEOLibre);
        
        while (matcher.find()){
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
        
        String regexNSEOLibre2="(Localizacion:)([NSEO])";
        String ejemploNSEOLibre2="Localizacion: S";
        // 
        System.out.println(ejemploNSEOLibre.matches(regexNSEOLibre));
        
        //ejer 2
        String regexIniFin = "ini[0-9]{2}fin";
        String ejemploIniFin = "ini23fin";
        System.out.println(ejemploIniFin.matches(regexIniFin));
        final Pattern patternIniFin = Pattern.compile(regexIniFin, Pattern.MULTILINE);
        final Matcher matcherIniFin = patternIniFin.matcher(regexIniFin);
        while (matcherIniFin.find()){
            System.out.println("Full match: " + matcherIniFin.group(0));
        }
        
        //ejer 3
        String regexLN = "";
        
    }
    
}
