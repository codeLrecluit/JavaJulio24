package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FiltrarNumeros {
	public static void main(String[] args) {
		String linea = "";
		int[] numeros = new int[10];
		String[] nombreNumeros = {"Una", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
		int numero;
		String residuo = "";
		File file = new File("C:\\Users\\gilro\\OneDrive\\Escritorio\\PruebaArchivos.txt");
		File file2 = new File("C:\\Users\\gilro\\OneDrive\\Escritorio\\ArchivoEscritura.txt");
		
		
		
		try {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((linea = br.readLine()) != null) {
				for (int i = 0; i < linea.length(); i++) {
					if(Character.isDigit(linea.charAt(i))) {
						numero = Integer.parseInt(Character.toString(linea.charAt(i)));
						numeros[numero] = 
								numeros[Integer.parseInt(Character.toString(linea.charAt(i)))] + 1;	
					}else {
						residuo = residuo + Character.toString(linea.charAt(i));
					}
				}
				
				for (int i = 1; i < numeros.length; i++) {
					if(numeros[i] != 0) {
						FileWriter fw = new FileWriter(file2, true);
						fw.write(i+ ": " + nombreNumeros[numeros[i] - 1] +" veces \n");
						fw.close();
					}
				}
				
				FileWriter fw = new FileWriter(file2, true);
				fw.write(residuo + "\n");
				fw.close();
				
				residuo = "";
				numeros = new int[10];
			}	
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
