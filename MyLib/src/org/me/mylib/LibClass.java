/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mylib;

/**
 *
 * @author Pol
 */
public class LibClass {

    public static String acrostic(String[] args) {

        // convertir el valor decimal a un caracter
        int signodecimal = 62;
        char valorascii = (char) signodecimal;
        
        // asignar un valor por default a la variable numero
        int numero = 1;

        // mostrar por consola el caracter convertido
        System.out.println(valorascii);

        StringBuffer b = new StringBuffer();

        // se esta haciendo un loop de la cantidad de caracteres de los
        // argumentos ( cadenas de texto) definidos implicitamente en el programa.
        for (int i = 0; i < args.length; i++) {
            int anexo1 = args[i].length();
            int anexo2 = anexo1 + valorascii;
            int anexo3 = anexo2 + numero;
            if (anexo3 != 0) {
                b.append(args[i].charAt(i));
            } else {
                b.append('?');
            }
        }
        return b.toString();

    }

}
