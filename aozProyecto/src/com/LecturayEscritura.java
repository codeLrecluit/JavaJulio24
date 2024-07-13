package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturayEscritura {

	public static void main(String[] args) {
		File lecturaFile = new File("C:\\Users\\artur\\OneDrive\\Escritorio\\Lectura.txt");
        File escrituraFile = new File("C:\\Users\\artur\\OneDrive\\Escritorio\\Escritura.txt");

        try (FileReader fr = new FileReader(lecturaFile);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(escrituraFile)) {

            String linea;
            int fila = 1;

            while ((linea = br.readLine()) != null) {
                fw.write("Fila " + fila + ":\n");

                // Arreglo para contar la frecuencia de cada dígito del 0 al 9
                int[] digitCount = new int[10];
                StringBuilder residuo = new StringBuilder();

                // Procesar cada caracter de la línea
                char[] arregloChar = linea.toCharArray();
                for (char c : arregloChar) {
                    if (Character.isDigit(c)) {
                        int num = c - '0';
                        digitCount[num]++;
                    } else {
                        residuo.append(c);
                    }
                }

                // Escribir la frecuencia de cada dígito
                for (int i = 0; i < 10; i++) {
                    if (digitCount[i] > 0) {
                        fw.write(i + ": " + digitCount[i] + " veces\n");
                    }
                }

                // Escribir el residuo
                fw.write("Residuo: " + residuo.toString() + "\n\n");

                fila++;
            }

            System.out.println("Se ha escrito correctamente en el archivo Escritura.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
