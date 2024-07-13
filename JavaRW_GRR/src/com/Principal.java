package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		//Lectura de archivos con java
		
		String linea = "";
		//Representación del archivo
		File file = new File("C:\\Users\\gilro\\OneDrive\\Escritorio\\PruebaArchivos.txt");
		File file2 = new File("C:\\Users\\gilro\\OneDrive\\Escritorio\\ArchivoEscritura.txt");
		try {
			//Crear un cache del archivo en memoria ram
			//FileReader fr = new FileReader(file);
			//Acceder y leer el contenido del cahce
			//BufferedReader br = new BufferedReader(fr);
			/*while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}*/
			
			
			//Si tiene false o no esta nada, sobreescribe el archivo
			//True agrega respetando todo lo anterior
			FileWriter fw = new FileWriter(file2, true);
			fw.write("\n Segundo mensaje desde java");
		
			fw.close();
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
