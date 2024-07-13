package com;

import java.io.File;
import java.io.FileWriter;

public class Principal {
public static void main(String[] args) {
	
	//Lectura de archivos con java
	String linea="";
	File file = new File("C:\\Users\\dario\\OneDrive\\Escritorio\\Texto_Para_Java.txt");
	File file2 = new File("C:\\Users\\dario\\OneDrive\\Escritorio\\Texto_Para_Java.txt");
	
	try {
		//Crear un cache del archivo en memoria ram
		/*FileReader fr = new FileReader(file);
		//Acceder al archivo
		BufferedReader br = new BufferedReader(fr);
		
		while((linea = br.readLine() )!= null) {
			System.out.println(linea);
		}*/
		// false se sobreescribe el contenido, con true se agrega lo nuevo respetando texto anterior
		FileWriter fw = new FileWriter(file2,true);
		fw.write("Este es otro mensaje " + 1 + "\n" );
		fw.close();
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
