/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author El Rey
 */
public class DeleteClientModel {
    
    String fileRuteClients = "src/main/java/textFiles/clientsData";
    
    public void deleteClient(){
        
    }
    
    
    public boolean isCedulaUnique(String cedula) {
        
        try (Scanner scanner = new Scanner(new File(fileRuteClients))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] userData = line.substring(1, line.length() - 1).split(",");
                String existingCedula = userData[2].trim(); // Obtener la cédula
                if (existingCedula.equals(cedula)) {
                    return false; 
                }
            }
        } catch (FileNotFoundException e) {
            // Manejar la excepción si el archivo no existe (puede ser la primera vez que se ejecuta)
            System.err.println("El archivo no existe, se creará uno nuevo.");
        }
        return true;
    }
}
