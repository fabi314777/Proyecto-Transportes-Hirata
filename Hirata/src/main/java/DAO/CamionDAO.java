/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modulo.Camion;
/**
 *
 * @author Pablo
 */
public class CamionDAO {

    public boolean registrarKilometraje(Camion c) {
        System.out.println(">>> Conectando a MySQL para actualizar camión: " + c.getPatente());
       
     
        System.out.println("INFO: Kilometraje [" + c.getKilometraje() + " km] guardado con éxito.");
       

        this.revisarAlertaMantenimiento(c);
       
        return true;
    }

    private void revisarAlertaMantenimiento(Camion c) {
        if (c.getKilometraje() >= 5000) {
            System.out.println("¡ALERTA DE MANTENIMIENTO! Camión: " + c.getPatente());
            System.out.println("Motivo: Ha alcanzado o superado los 5000 km.");
            System.out.println("Acción: Desencadenando proceso preventivo.");
        }
    }
}