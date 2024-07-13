package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
	public static void main(String[] args) {
		
      //Nombres de mis archicos de entrada y salida
        String inputFilePath = "C:\\Users\\Ing Josè Mtz\\Desktop\\Ejercicio1.txt";
        String outputFilePath = "C:\\Users\\Ing Josè Mtz\\Desktop\\Ejer1Escritura.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            
            String linea;
            int lineanumero = 1;
            
            while ((linea = br.readLine()) != null) {
                Map<Character, Integer> numeroc = new HashMap<>();
                StringBuilder caraesp = new StringBuilder();
                
                // Recorremos los caracteres para encontar los números del 0 al 9
                for (char c = '0'; c <= '9'; c++) {
                    numeroc.put(c, 0);
                }
                
                // Contamos los números y guardamos caracteres especiales en la línea
                for (char c : linea.toCharArray()) {
                    if (numeroc.containsKey(c)) { //Verificamos que existan los numeros que buscamos 
                        numeroc.put(c, numeroc.get(c) + 1); //Si coincide lo obtiene y pasa a la siguiente posiscion
                    } else {
                        caraesp.append(c);
                    }
                }
                
                // Resultado para la línea actual el cual veremos en escritura
                bw.write("Línea " + lineanumero + ": " + linea + "\n");
                for (char c = '0'; c <= '9'; c++) {
                    bw.write("Número " + c + ": " + numeroc.get(c) + " veces\n");
                }
                bw.write("Caracteres especiales: " + caraesp.toString() + "\n\n");
                
                lineanumero++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
