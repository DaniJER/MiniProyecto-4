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
    
    ArrayList<ArrayList<String>> principalClientArray = new ArrayList<>();
    ArrayList<String> dataClientArray = new ArrayList<>();

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
                FileWriter fileWriter = new FileWriter(clientsFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                System.out.println("Texto escrito en el archivo de clientescon exito");
            }
            else{
                //System.out.println("Ya se cuenta con un archivo de texto para clientes!");
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }
    
       /* try{
            
            dealersFile = new File(fileRuteDealers);
            
            if(!dealersFile.exists()){
                
                dealersFile.createNewFile();
                System.out.println("archivo creado, la ruta es: " + dealersFile.getAbsolutePath());
                FileWriter fileWriter = new FileWriter(dealersFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Contenido de prueba");
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                System.out.println("Texto escrito en el archivo de distribuidores con exito");
            }
            else{
                System.out.println("Ya se cuenta con un archivo de texto para distribuidores!");
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }
        
        try{
            
            productsFile = new File(fileRuteProducts);
            
            if(!productsFile.exists()){
                
                productsFile.createNewFile();
                System.out.println("archivo creado, la ruta es: " + productsFile.getAbsolutePath());
                FileWriter fileWriter = new FileWriter(productsFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Contenido de prueba");
                bufferedWriter.newLine();
                bufferedWriter.close();
                
                System.out.println("Texto escrito en el archivo de productos con exito");
            }
            else{
                System.out.println("ya se cuenta con un archivo de texto para productos!");
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }*/
    }
    //--------------------------------------------------------------------------------------------------------------
    
    /*public boolean validateClients(String id){
        
        for (ArrayList<String> clientData : principalClientArray){
        
            String clientId = clientData.get(2);
            
            if(clientId.equals(id)){
                
                System.out.println("La Cedula digitada ya esta en uso, intenta con otra");
                return false;
                
            }
        }
        
        addClientsCollection();
        return true;
    }*/
    
    public void validateClient(){
    
        try{
            
            String linea;
            
            FileReader archivoReader = new FileReader(fileRuteClients);
            
            BufferedReader bufferedReader = new BufferedReader(archivoReader);
            
            while((linea = bufferedReader.readLine()) != null){
            
                //System.out.println(linea);
            }
            
            bufferedReader.close();
            archivoReader.close();
            
            ArrayList<String> datos = new ArrayList<>();
            datos.add(linea);
            principalClientArray.add(datos);
            System.out.println(principalClientArray);
            
        }catch(IOException e){
        
            e.printStackTrace();
        }
 
    }
    
    //Metodo para agregar los datos de los clientes a una coleccion y al archivo de texto
    public void addClientsCollection(){
    
        dataClientArray.add(this.name);
        dataClientArray.add(this.lastName);
        dataClientArray.add(this.id);
        dataClientArray.add(this.cel);
        principalClientArray.add(dataClientArray);
        System.out.println("Array de datos: " + principalClientArray);
        
        try{
        
            FileWriter fileWriter = new FileWriter(fileRuteClients,true);
            BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
            bufferedWriter.write(String.valueOf(principalClientArray));
            bufferedWriter.close();
            System.out.println("Datos almacenados en el archivo de texto");
            
        }catch(IOException e){
        
            System.err.println("Error al añadir texto al archivo: " + e.getMessage());
        }
    
    }
    
  
}
