/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author El Rey
 */
public class CreateClientModel {
    
    private String name;
    private String lastName;
    private String brand;
    private String id;
    private String cel;
    
    File clientsFile;
    File dealersFile;
    File productsFile;
    
    
    String fileRuteClients = "src/main/java/textFiles/clientsData";
    
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
     //Metodo para crear un archivo y establecerlo en una ruta especificada
    //------------------------------------------------------------------------------------------------
    public void createTextFile(){
        
        try{
            
            clientsFile = new File(fileRuteClients);
            
            if(!clientsFile.exists()){
                
                clientsFile.createNewFile();
                System.out.println("archivo creado, la ruta es: " + clientsFile.getAbsolutePath());
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }
    
    }
    
    //Metodo para agregar los datos de los clientes a una coleccion y al archivo de texto
   public void addClientsCollection() {

        ArrayList<ArrayList<String>> principalClientArray = new ArrayList<>();
        ArrayList<String> dataClientArray = new ArrayList<>();

        dataClientArray.add(this.name);
        dataClientArray.add(this.lastName);
        dataClientArray.add(this.id);
        dataClientArray.add(this.cel);

        // Verificar si la cédula ya existe en el archivo
        if (isCedulaUnique(this.id)) {
            principalClientArray.add(dataClientArray);
            System.out.println("Los siguientes datos fueron guardados " + principalClientArray);

            // Escribir en el archivo solo si la cédula es única
            try {
                FileWriter fileWriter = new FileWriter(fileRuteClients, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.valueOf(dataClientArray));
                bufferedWriter.newLine();  // Agregar una nueva línea para cada usuario
                bufferedWriter.close();
                JOptionPane.showMessageDialog(null,"Datos almacenados del cliente almacenados");

            } catch (IOException e) {
                System.err.println("Error al añadir texto al archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null,"La cédula ya existe. No se puede agregar el usuario.");
        }
    }

    // Método para verificar si la cédula ya existe en el archivo
    private boolean isCedulaUnique(String cedula) {
        
        try (Scanner scanner = new Scanner(new File(fileRuteClients))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] userData = line.substring(1, line.length() - 1).split(",");
                String existingCedula = userData[2].trim(); // Obtener la cédula
                if (existingCedula.equals(cedula)) {
                    return false; // Cédula duplicada
                }
            }
        } catch (FileNotFoundException e) {
            // Manejar la excepción si el archivo no existe (puede ser la primera vez que se ejecuta)
            System.err.println("El archivo no existe, se creará uno nuevo.");
        }
        return true; // Cédula única
    }
}

