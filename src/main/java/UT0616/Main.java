/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0616;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {

//        List<Robot> listaRobots = new ArrayList();
//        for (int i = 0; i < 20; i++) {
//            listaRobots.add(new Robot(i));
//        }
//
//        for (Robot l : listaRobots) {
//            System.out.println(l);
//        }
//
        String idFichero = "robot.txt";
//        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
//            for (Robot l : listaRobots) {
//                flujo.write(l.getNumeroSerie() + " " + l.getPorcentajeVida());
//                flujo.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        List<Robot> lista2 = new ArrayList<>();
        
        String linea;
        String[] tokens;
        
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" ");
                Robot r1 = new Robot(Integer.parseInt(tokens[0]));
                r1.setPorcentajeVida(Integer.parseInt(tokens[1]));
                lista2.add(r1);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------");
        for (Robot r : lista2) {
            System.out.println(r);
        }

//        Collections.sort(listaRobots);
//        
//        for (Robot l : listaRobots) {
//            System.out.println(l);
//        }
//        
//        System.out.println("-----------");
//        
//        for (Robot l : listaRobots) {
//            if(l.getPorcentajeVida() >= 50){
//                System.out.println(l);
//            }
//        }
//        
//        System.out.println("-----------");
//        for (int i = listaRobots.size()-1; i > listaRobots.size()-4; i--) {
//            System.out.println(listaRobots.get(i));
//        }
//        
//        System.out.println("------------");
//        
//        Comparator<Robot> criterioNumeroSerie = (p1,p2)-> Integer.compare(p1.getNumeroSerie(), p2.getNumeroSerie());
//        Collections.sort(listaRobots, criterioNumeroSerie);
//        
//        for (Robot l : listaRobots) {
//            System.out.println(l);
//        }
//        
//        System.out.println(Collections.binarySearch(listaRobots, new Robot(8), criterioNumeroSerie));
//        
//        System.out.println("-----Usando API stream------");
//        listaRobots.stream()
//                .filter(r->r.getPorcentajeVida()>=50)
//                .forEach(r->System.out.println(r));
//        
//        listaRobots.stream()
//                .limit(3)
//                .forEach(r->System.out.println(r.getNumeroSerie()));
    }

}
