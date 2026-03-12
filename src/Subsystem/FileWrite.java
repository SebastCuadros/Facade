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

    public void writeFile(String path, String texto) {

        try {

            FileWriter archivo = new FileWriter(path);
            PrintWriter escribir = new PrintWriter(archivo);

            escribir.println(texto);

            escribir.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
