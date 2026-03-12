/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Subsystem.FileEncrypt;
import Subsystem.FileRead;
import Subsystem.FileWrite;

/**
 *
 * @author sebas
 */
public class Facade {

    private static Facade instance;

    private FileRead reader;
    private FileWrite writer;
    private FileEncrypt encryptor;

    private Facade() {

        reader = new FileRead();
        writer = new FileWrite();
        encryptor = new FileEncrypt();

    }

    public static Facade getInstance() {

        if (instance == null) {
            instance = new Facade();
        }

        return instance;

    }

    public void writeEncrypted(String path, String texto) {

        String encrypted = encryptor.encrypt(texto);

        writer.writeFile(path, encrypted);

    }

    public String readDecrypted() {

        String encrypted = reader.readFile();

        return encryptor.decrypt(encrypted);

    }

}
