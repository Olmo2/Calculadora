package com.olmo.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Parte3 {

	public void Lectura() throws IOException {

		Scanner teclado = new Scanner(System.in);
		String str = "";
		File file = new File("C:/users/alumnado/desktop/test.txt");
		FileOutputStream fos = new FileOutputStream(file);

		OutputStreamWriter osw = new OutputStreamWriter(fos);

		do {

			System.out.println("Introduce la siguiente línea");
			str = teclado.next();
			if (!str.equals("FIN")) {
				osw.write(str + "\n");
				osw.flush();
			}
		} while (!str.equals("FIN"));

		osw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
			
			
		} 
		br.close();

	}
}
