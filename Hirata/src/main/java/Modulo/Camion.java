/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo;

/**
 *
 * @author marti
 */
public class Camion {
    private String patente;
    private String marca;
    private String modelo;
    private int kilometraje;

    // Constructor completo
    public Camion(String patente, String marca, String modelo, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters para que el DAO pueda leer los datos
    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getKilometraje() { return kilometraje; }
}
