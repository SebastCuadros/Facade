/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

/**
 *
 * @author sebas
 */
import Facade.Facade;

public class Client {

    public static void main(String[] args) {

        String path = "D:/Descargas/TextoPrueba.txt";
        String texto = "Hola patron Facade";

        Facade facade = Facade.getInstance();

        facade.writeEncrypted(path, texto);

        String contenido = facade.readDecrypted();

        System.out.println(contenido);

    }

}
