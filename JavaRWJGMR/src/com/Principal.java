package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		//Lectura de Archivos con Java
		
		
		String linea="";
		//Representacion del archivo
		File file = new File("C:\\Users\\Ing Josè Mtz\\Desktop\\TextoPrueba.txt");
		File file2 = new File("C:\\Users\\Ing Josè Mtz\\Desktop\\Escritura.txt");
		try {
			//Crea un cache del archivo en memoria RAM 
			//FileReader fr = new FileReader(file);
			//Acceder y leer el contenido del cache
			//BufferedReader br = new BufferedReader(fr);
			//while ((linea=br.readLine())!=null) {
				//System.out.println(linea);
			//}
		FileWriter fw = new FileWriter(file2, true);	
		fw.write("Agrego este nuevo mensaje");
		fw.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
