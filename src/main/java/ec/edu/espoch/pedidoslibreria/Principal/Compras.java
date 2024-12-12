/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pedidoslibreria.Principal;

/**
 *
 * @author SO-LAB-PC5
 */
public class Compras {

    private static final double IVA = 0.12;

    public void mostrardetalleLibro(Libro libro) {
        double precioIVA = libro.getPrecio() + (libro.getPrecio() * IVA);
        System.out.println("---DETALLES DE LIBRO---");
        System.out.println(" ");
        System.out.println("Libro" + libro.getTitulo());
        System.out.println("Categoria" + libro.getCategoria());
        System.out.println("Precio sin IVA: " + libro.getPrecio()+" $");
        System.out.println("Precio con IVA: " + precioIVA+" $");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void mostrarClienteLibro(Cliente cliente, Libro libro) {
        double precioIVA = libro.getPrecio() + (libro.getPrecio() * IVA);
        System.out.println("---DETALLES DE CLIENTE Y LIBRO---");
        System.out.println(" ");
        System.out.println("Cliente:" + cliente.getNombre());
        System.out.println("Libro" + libro.getTitulo());
        System.out.println("Categoria" + libro.getCategoria());
        System.out.println("Precio sin IVA: " + libro.getPrecio()+" $");
        System.out.println("Precio con IVA: " + precioIVA+" $");

    }

}
