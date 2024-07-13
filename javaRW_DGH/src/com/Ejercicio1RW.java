package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1RW {
public static void main(String[] args) {
	//Lectura de archivos con java
		String linea="";
		File file = new File("C:\\Users\\dario\\OneDrive\\Escritorio\\Texto_Para_Java.txt");
		File file2 = new File("C:\\Users\\dario\\OneDrive\\Escritorio\\Texto_Para_Java_resultados.txt");
		String numeros = "0123456789";
		String[] snumeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		try {
			//Crear un cache del archivo en memoria ram
			FileReader fr = new FileReader(file);
			FileReader fr2 = new FileReader(file);
			//Acceder al archivo
			BufferedReader br = new BufferedReader(fr);
			BufferedReader br2 = new BufferedReader(fr2);
			
			
			int numLinea = 0;
			//Por cada linea
			while((linea = br.readLine() )!= null) {
				//System.out.println(linea);
				String residuos="";
				int[] cantidad = {0,0,0,0,0,0,0,0,0,0};
			//Por cada letra de la linea	
				for (int i=0;i<linea.length();i++) {
			boolean flag = false;
			//Por cada numero
					for (int j=0;j<numeros.length();j++) {
						if (linea.charAt(i) == numeros.charAt(j)) {
							cantidad[numeros.indexOf(numeros.charAt(j))]++;
							flag = true;				
						}
						
						}
					//Si no es numero
					if(!flag){
						residuos+= String.valueOf(linea.charAt(i));
					}		
				}
				
			//Escribir resultado en otro documento
				numLinea++;
				FileWriter fw = new FileWriter(file2,true);
				fw.write("Linea numero: " + numLinea + "\n");
				
				for (int k=0; k <= snumeros.length-1;k++) {
				String nCantidad = String.valueOf(cantidad[k]); 
				int posicion = numeros.indexOf(nCantidad);
				fw.write(k + " : " + snumeros[posicion] + " veces. \n");	
				}
				fw.write("Residuos :" + residuos + "\n");
				fw.write("---------------------------------------------- \n");
	
				fw.close();
				
//				for (int i=0; i < cantidad.length ; i++) {
//					System.out.println(cantidad[i]);
//					
//				}
//				System.out.println("Residuos : " + residuos);
//				System.out.println("Otra linea:: ");
			}
				
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
				
}
}
