/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerrepa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {

    }

    private static Map<String, Integer> totalPasajerosDestino(List<Vuelo> vuelos) {
        Map<String, Integer> aux = new HashMap<>();

        for (int i = 0; i < vuelos.size(); i++) {
            if (aux.containsKey(vuelos.get(i).getDestino())) {
                aux.replace(vuelos.get(i).getDestino(),//seleccionamos el destino del vuelo actual
                        aux.get(vuelos.get(i).getDestino())//seleccionamos el value ya asociado con esa key
                        + vuelos.get(i).getLista().size());//sumamos al value los pasajeros del vuelo actual
            }else{
                aux.put(vuelos.get(i).getDestino(), vuelos.get(i).getLista().size());
            }
        }
        return aux;
    }
    
    private static Map<Integer, Set<Pasajero>> conjuntoPasajeros(List<Vuelo> vuelos){
        Map<Integer, Set<Pasajero>> aux = new TreeMap<>();
        
        for (Vuelo v : vuelos) {
            Set<Pasajero> setPas = new TreeSet<>(v.getLista());
            aux.put(v.getCodigo(), setPas);
        }
        return aux;
    }

}
