/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562
    
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

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
public class ReadClientModel{
    
    private String idClient;
    
    //Variables que se mostraran en pantalla
    
    private String name;
    private String lastName;
    private String cel;
    private String id;
    private String productName;

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean readClient(String id) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/clientsData"))) {
            String line;
            ArrayList<String> clientList = new ArrayList<>();

            // Lee el archivo y almacena cada línea en el ArrayList
            while ((line = br.readLine()) != null) {
                clientList.add(line);
            }

            // Busca la cédula en el ArrayList
            for (String clientData : clientList) {
                String[] dataArray = clientData
                        .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                        .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");
                    if (keyValue[0].trim().equals("Identificación") && keyValue[1].trim().equals(id)) {
                        // Si se encuentra la cédula, muestra los datos
                        //System.out.println("Datos del cliente:");
                        
                        /*for (String entry : dataArray) {
                            
                            System.out.println("Datos del cliente: " + entry);
                        }*/
                            this.name = dataArray[0];
                            this.lastName = dataArray[1];
                            this.id = dataArray[2];
                            this.cel = dataArray[3];
                            this.productName = dataArray[4];
                            
                            /*System.out.println(name);
                            System.out.println(lastName);
                            System.out.println(id);
                            System.out.println(cel);
                            System.out.println(productName);
                            */
                        return true; // Indica que se encontró la cédula
                    }
                }
            }

            JOptionPane.showMessageDialog(null,"Cliente no encontrado.");
            return false; // Indica que no se encontró la cédula

        } catch (IOException e) {
                e.printStackTrace();
            return false; // Manejo de excepciones
        }
    }
    
    
}
      




