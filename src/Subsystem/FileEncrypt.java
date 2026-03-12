/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsystem;

/**
 *
 * @author sebas
 */
public class FileEncrypt {

    public String encrypt(String texto) {

        String resultado = "";

        for (char c : texto.toCharArray()) {
            resultado += (char) (c + 1);
        }

        return resultado;
    }

    public String decrypt(String texto) {

        String resultado = "";

        for (char c : texto.toCharArray()) {
            resultado += (char) (c - 1);
        }

        return resultado;
    }

}
