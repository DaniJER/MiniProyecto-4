/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DealersModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author El Rey
 */
public class CreateDealerModel {
    
    private String nameDealer;
    private String lastNameDealer;
    private String idDealer;
    private String nameProductDealer;
    private String celDealer;
    
    File dealersFile;
    
    //String fileRuteClients = "src/main/java/textFiles/clientsData";
    String fileRuteDealers = "src/main/java/textFiles/dealersData";
    //String fileRuteProducts = "src/main/java/textFiles/productsData";

    public String getNameDealer() {
        return nameDealer;
    }

    public void setNameDealer(String nameDealer) {
        this.nameDealer = nameDealer;
    }

    public String getLastNameDealer() {
        return lastNameDealer;
    }

    public void setLastNameDealer(String lastNameDealer) {
        this.lastNameDealer = lastNameDealer;
    }

    public String getIdDealer() {
        return idDealer;
    }

    public void setIdDealer(String idDealer) {
        this.idDealer = idDealer;
    }

    public String getNameProductDealer() {
        return nameProductDealer;
    }

    public void setNameProductDealer(String nameProductDealer) {
        this.nameProductDealer = nameProductDealer;
    }

    public String getCelDealer() {
        return celDealer;
    }

    public void setCelDealer(String celDealer) {
        this.celDealer = celDealer;
    }

    public File getDealersFile() {
        return dealersFile;
    }

    public void setDealersFile(File dealersFile) {
        this.dealersFile = dealersFile;
    }

    public String getFileRuteDealers() {
        return fileRuteDealers;
    }

    public void setFileRuteDealers(String fileRuteDealers) {
        this.fileRuteDealers = fileRuteDealers;
    }
    
   
     //Metodo para crear un archivo y establecerlo en una ruta especificada
    //------------------------------------------------------------------------------------------------
    public void createTextFile(){
        
        try{
            
            dealersFile = new File(fileRuteDealers);
            
            if(!dealersFile.exists()){
                
                dealersFile.createNewFile();
                System.out.println("archivo creado, la ruta es: " + dealersFile.getAbsolutePath());
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }
    
    }
    
    //Metodo para agregar los datos de los distribuidores a una coleccion y al archivo de texto
   public void addDealersCollection() {

        ArrayList<ArrayList<String>> principalDealersArray = new ArrayList<>();
        ArrayList<String> dataDealersArray = new ArrayList<>();

        dataDealersArray.add(this.nameDealer);
        dataDealersArray.add(this.lastNameDealer);
        dataDealersArray.add(this.idDealer);
        dataDealersArray.add(this.nameProductDealer);
        dataDealersArray.add(this.celDealer);

        // Verificar si la cédula ya existe en el archivo
        
        if (isCedulaUnique(this.idDealer)) {
            principalDealersArray.add(dataDealersArray);
            System.out.println("Los siguientes datos fueron guardados " + principalDealersArray);

            // Escribir en el archivo solo si la cédula es única
            try {
                FileWriter fileWriter = new FileWriter(fileRuteDealers, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.valueOf(dataDealersArray));
                bufferedWriter.newLine();  // Agregar una nueva línea para cada usuario
                bufferedWriter.close();
                JOptionPane.showMessageDialog(null,"Datos del distribuidor almacenados");

            } catch (IOException e) {
                System.err.println("Error al añadir texto al archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null,"La cédula ya existe. No se puede agregar el distriubidor.");
        }
    }

    // Método para verificar si la cédula ya existe en el archivo
    private boolean isCedulaUnique(String cedula) {
        
        try (Scanner scanner = new Scanner(new File(fileRuteDealers))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Verificar que la línea tiene al menos tres campos
            if (line.split(",").length < 3) {
                System.err.println("La línea no tiene al menos tres campos.");
                continue; // Saltar a la siguiente línea
            }

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
