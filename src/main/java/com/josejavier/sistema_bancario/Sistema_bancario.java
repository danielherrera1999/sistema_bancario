/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.josejavier.sistema_bancario;


import java.io.IOException;

/**
 *
 * @author ROOT
 */
public class Sistema_bancario {

    public static void main(String[] args) {
        connectDatabase con = new connectDatabase();
        con.conn();
        System.out.println("Sistema bancario");
        try {
            System.out.println("La aplicación está en ejecución. Presiona Enter para salir...");
            System.in.read();
        } catch (IOException e) {
            System.err.println("Error al esperar la entrada del usuario");
        }
    }
}
