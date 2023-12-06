/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;

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
    String fileRuteDealers = "src/main/java/textFiles/dealersData";
    String fileRuteProducts = "src/main/java/textFiles/productsData";
    
   
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
    public void addClientsCollection(){
        
        ArrayList<ArrayList<String>> principalClientArray = new ArrayList<>();
        ArrayList<String> dataClientArray = new ArrayList<>();
        
        dataClientArray.add(this.name);
        dataClientArray.add(this.lastName);
        dataClientArray.add(this.id);
        dataClientArray.add(this.cel);
        
        principalClientArray.add(dataClientArray);
        System.out.println("Los siguientes datos fueron guardados " + principalClientArray);
        
        try{
        
            FileWriter fileWriter = new FileWriter(fileRuteClients,true);
            BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
            bufferedWriter.write(String.valueOf(dataClientArray));
            bufferedWriter.close();
            System.out.println("Datos almacenados en el archivo de texto");
            
        }catch(IOException e){
        
            System.err.println("Error al añadir texto al archivo: " + e.getMessage());
        }
    }
}
