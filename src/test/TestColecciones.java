package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        //La lista mantiene un orden, guarda un orden, se pueden duplicar elementos
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
//        miLista.add("Sabado");
//        miLista.add("Domingo");
        //   imprimir(miLista);
        //Set no respeta el orden, no guarda un orden, no se pueden duplicar elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //  imprimir(miSet);

        //MAAAP
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Alex");
        miMapa.put("Valor2", "Lourdes");
        miMapa.put("Valor3", "Rosalia");

        String elemento = (String) miMapa.get("Valor1");
        //System.out.println("elemento = " + elemento);
        
        //Devuelve todas las llaves pero no garantiza el orden
        imprimir(miMapa.keySet());
        //Devuelve todos los valores asociados a las keys en orden segun las keys asociadas.
        imprimir(miMapa.values());
        
        
        ////Impresion de miLista y miSet
//        //ForEach
//        for (Object dia : miLista) {
//            System.out.println("Dia: " + dia);
//        }
//        //FUNCION LAMDA O FUNCION FLECHA
//        //Lista----ForEach--Variable del tipo que sea la collecion (Object)
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
    }

    public static void imprimir(Collection coleccion) {
//        //Opcion 1 con ForEach
//        for (Object elemento : coleccion) {
//            System.out.println("elemento = " + elemento);
//        }
//        Opcion 2 con Lamda
        coleccion.forEach(elemento
                -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
