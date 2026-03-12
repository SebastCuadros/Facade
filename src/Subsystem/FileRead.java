/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsystem;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author sebas
 */
public class FileRead {

    BufferedReader lector;
    FileReader archivo;

    public FileRead() {
        try {
            archivo = new FileReader("D:/Descargas/TextoPrueba.txt");
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) != null) {
                    System.out.println(cadena);

                }
            }else{
                System.out.println("El archivo no está listo para ser leido...");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
