/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class FileWrite {

    FileWriter archivo = null;
    PrintWriter escribir = null;
    String texto = null;
    Scanner leer = new Scanner(System.in);

    public FileWrite() throws IOException {
        try {
            archivo = new FileWriter("D:/Descargas/TextoPrueba.txt");
            escribir = new PrintWriter(archivo);

            System.out.println("Escriba el contenido del archivo: ");
            texto = leer.nextLine();
            escribir.println(texto);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            archivo.close();
        }

    }

}
