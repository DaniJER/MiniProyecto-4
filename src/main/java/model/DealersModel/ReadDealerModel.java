/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562
    
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DealersModel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author El Rey
 */
public class ReadDealerModel {
   
    //Variables que se mostraran en pantalla
    
    private String dealerName;
    private String dealerLastName;
    private String dealerId;
    private String dealerProductName;
    private String dealerCel;

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerLastName() {
        return dealerLastName;
    }

    public void setDealerLastName(String dealerLastName) {
        this.dealerLastName = dealerLastName;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerProductName() {
        return dealerProductName;
    }

    public void setDealerProductName(String dealerProductName) {
        this.dealerProductName = dealerProductName;
    }

    public String getDealerCel() {
        return dealerCel;
    }

    public void setDealerCel(String dealerCel) {
        this.dealerCel = dealerCel;
    }

    public boolean readDealer(String id) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/dealersData"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Verificar si la línea comienza y termina con corchetes
                if (line.startsWith("[") && line.endsWith("]")) {
                    // Eliminar corchetes y espacios, luego dividir por comas
                    String[] keyValuePairs = line.substring(1, line.length() - 1).split(", ");

                    // Buscar la cédula en los pares clave-valor
                    for (String pair : keyValuePairs) {
                        String[] keyValue = pair.split(": ");
                        if (keyValue.length == 2 && keyValue[0].trim().equals("Identificacion") && keyValue[1].trim().equals(id)) {
                            System.out.println("Datos del distribuidor:");
                            System.out.println(line); // Imprime la línea que contiene la cédula

                            this.dealerName = keyValuePairs[0].split(": ")[1].trim(); // Ejemplo, ajusta según tu estructura de datos
                            this.dealerLastName = keyValuePairs[1].split(": ")[1].trim();
                            this.dealerId = keyValuePairs[2].split(": ")[1].trim();
                            this.dealerProductName = keyValuePairs[3].split(": ")[1].trim();
                            this.dealerCel = keyValuePairs[4].split(": ")[1].trim();
                            return true; // Indica que se encontró la cédula
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null,"Distribuidor no encontrado.");
            return false; // Indica que no se encontró la cédula
            
        }   catch (IOException e) {
                e.printStackTrace();
            }
            return false; // Manejo de excepciones
    }
}

           

