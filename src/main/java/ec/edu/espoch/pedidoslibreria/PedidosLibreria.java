/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.pedidoslibreria;

import static ec.edu.espoch.pedidoslibreria.Principal.Categoria.EDUCATIVO;
import ec.edu.espoch.pedidoslibreria.Principal.Cliente;
import ec.edu.espoch.pedidoslibreria.Principal.Compras;
import ec.edu.espoch.pedidoslibreria.Principal.Libro;

/**
 *
 * @author SO-LAB-PC5
 */
public class PedidosLibreria {

    public static void main(String[] args) {

        Cliente autor1 = new Cliente("Jhonier", 1010);
        Cliente autor2 = new Cliente("Jostin", 1111);

        Libro libro1 = new Libro("PROGRAMACION", "JHONIER MYERS", 45, EDUCATIVO);
        Libro libro2 = new Libro("MATEMATICAS", "JOSTIN TOWERS", 58, EDUCATIVO);

        //Compras compra1=new Compras(cliente1,libro1,libro2);
        //compra1.mostrar();
        Compras compra = new Compras();

        compra.mostrardetalleLibro(libro1);
        compra.mostrardetalleLibro(libro2);
        
        compra.mostrarClienteLibro(autor1, libro1);
        compra.mostrarClienteLibro(autor2, libro2);
        

    }

}
