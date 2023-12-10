package model.clientesModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class UpdateClientModel {
    
    private String nameUpdate;
    private String lastNameUpdate;
    private String brandUpdate;
    private String idUpdate;
    private String celUpdate;
        
    String fileRuteClients = "src/main/java/textFiles/clientsData";

    public String getNameUpdate() {
        return nameUpdate;
    }

    public void setNameUpdate(String nameUpdate) {
        this.nameUpdate = nameUpdate;
    }

    public String getLastNameUpdate() {
        return lastNameUpdate;
    }

    public void setLastNameUpdate(String lastNameUpdate) {
        this.lastNameUpdate = lastNameUpdate;
    }

    public String getBrandUpdate() {
        return brandUpdate;
    }

    public void setBrandUpdate(String brandUpdate) {
        this.brandUpdate = brandUpdate;
    }

    public String getIdUpdate() {
        return idUpdate;
    }

    public void setIdUpdate(String idUpdate) {
        this.idUpdate = idUpdate;
    }

    public String getCelUpdate() {
        return celUpdate;
    }

    public void setCelUpdate(String celUpdate) {
        this.celUpdate = celUpdate;
    }

    public String getFileRuteClients() {
        return fileRuteClients;
    }

    public void setFileRuteClients(String fileRuteClients) {
        this.fileRuteClients = fileRuteClients;
    }
    
   
/*   public boolean updateClient(String id) {

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

                    // Actualiza los datos del cliente en el ArrayList
                    dataArray[0] = "Nombre: " + nameUpdate;
                    dataArray[1] = "Apellido: " + lastNameUpdate;
                    dataArray[3] = "Celular: " + idUpdate;

                    // Escribe el ArrayList actualizado en el archivo de texto
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/textFiles/clientsData"))) {

                        for (String updatedClient : clientList) {
                            writer.write(updatedClient);
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Cliente actualizado:");
                    for (String entry : dataArray) {
                        System.out.println("Datos del cliente: " + entry);
                    }

                    return true; // Indica que se encontró la cédula y se actualizó el cliente
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        return false; // Indica que no se encontró la cédula

    } catch (IOException e) {
        e.printStackTrace();
        return false; // Manejo de excepciones
    }
}
   }*/

    public boolean updateClient(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/clientsData"))) {

            String line;
            ArrayList<String> updatedClientList = new ArrayList<>();
            boolean clientFound = false;

            while ((line = br.readLine()) != null) {
                String[] dataArray = line
                        .replaceAll("[\\[\\]]", "")
                        .split(", ");

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");

                    if (keyValue[0].trim().equals("Identificación") && keyValue[1].trim().equals(id)) {
                        dataArray[0] = "Nombre: " + nameUpdate;
                        dataArray[1] = "Apellido: " + lastNameUpdate;
                        dataArray[3] = "Celular: " + idUpdate;
                        clientFound = true;
                    }
                }

                updatedClientList.add(String.join(", ", dataArray));
            }

            if (clientFound) {
                // Escribe la lista actualizada en el archivo de texto
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/textFiles/clientsData"))) {
                    for (String updatedClient : updatedClientList) {
                        writer.write(updatedClient);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return false; // Manejo de excepciones al escribir en el archivo
                }

                System.out.println("Cliente actualizado:");
                for (String entry : updatedClientList) {
                    System.out.println("Datos del cliente: " + entry);
                }

                return true; // Indica que se encontró la cédula y se actualizó el cliente
            } else {
                System.out.println("Cliente no encontrado.");
                return false; // Indica que no se encontró la cédula
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones al leer el archivo
        }
    }
} 


