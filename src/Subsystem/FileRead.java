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

    public String readFile() {

        BufferedReader lector;
        FileReader archivo;
        String contenido = "";

        try {

            archivo = new FileReader("D:/Descargas/TextoPrueba.txt");
            lector = new BufferedReader(archivo);

            String cadena;

            while ((cadena = lector.readLine()) != null) {
                contenido += cadena;
            }

            lector.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return contenido;

    }

}
