/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class DeleteClientModel {
    
    String fileRuteClients = "src/main/java/textFiles/clientsData";
    
    private String nameClientRemoved;
    private String lastNameClientRemoved;
    private String idClientRemoved;
    private String celClientRemoved;

    public String getNameClientRemoved() {
        return nameClientRemoved;
    }

    public void setNameClientRemoved(String nameClientRemoved) {
        this.nameClientRemoved = nameClientRemoved;
    }

    public String getLastNameClientRemoved() {
        return lastNameClientRemoved;
    }

    public void setLastNameClientRemoved(String lastNameClientRemoved) {
        this.lastNameClientRemoved = lastNameClientRemoved;
    }

    public String getIdClientRemoved() {
        return idClientRemoved;
    }

    public void setIdClientRemoved(String idClientRemoved) {
        this.idClientRemoved = idClientRemoved;
    }

    public String getCelClientRemoved() {
        return celClientRemoved;
    }

    public void setCelClientRemoved(String celClientRemoved) {
        this.celClientRemoved = celClientRemoved;
    }

    public String getFileRuteClients() {
        return fileRuteClients;
    }

    public void setFileRuteClients(String fileRuteClients) {
        this.fileRuteClients = fileRuteClients;
    }
    

    public boolean deleteClient(String id){
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/clientsData"))) {

        String line;
        ArrayList<String> clientList = new ArrayList<>();

        // Lee el archivo y almacena cada línea en el ArrayList
        while ((line = br.readLine()) != null) {
            clientList.add(line);
        }

        // Busca la cédula en el ArrayList
        for (int i = 0; i < clientList.size(); i++) {
            
            String clientData = clientList.get(i);
            String[] dataArray = clientData
                    .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                    .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");
                    if (keyValue[0].trim().equals("Identificación") && keyValue[1].trim().equals(id)) {
                        // Elimina el cliente del ArrayList
                        clientList.remove(i);

                        // Escribe el ArrayList actualizado en el archivo de texto
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/textFiles/clientsData"))) {
                            
                            for (String updatedClient : clientList) {
                                writer.write(updatedClient);
                                writer.newLine();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Cliente eliminado:");
                            for (String entry : dataArray) {
                                
                                System.out.println("Datos del cliente: " + entry);
                            }
                            
                            this.nameClientRemoved = dataArray[0];
                            this.lastNameClientRemoved = dataArray[1];
                            this.idClientRemoved = dataArray[2];
                            this.celClientRemoved = dataArray[3];

                            return true; // Indica que se encontró la cédula y se eliminó el cliente
                        }
                    }
                }

                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    return false; // Indica que no se encontró la cédula
        }catch (IOException e) {
            e.printStackTrace();
        return false; // Manejo de excepciones
    }
}
}

