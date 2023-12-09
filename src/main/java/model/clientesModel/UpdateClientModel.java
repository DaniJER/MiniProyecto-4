package model.clientesModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class UpdateClientModel {
    private String name;
    private String lastName;
    private String brand;
    private String id;
    private String cel;
        
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

    public void UpdateClient() {

    /*  ArrayList<ArrayList<String>> principalClientArray = new ArrayList<>();
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
                JOptionPane.showMessageDialog(null, "Datos almacenados del cliente almacenados");

            } catch (IOException e) {
                System.err.println("Error al añadir texto al archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cédula ya existe. No se puede agregar el usuario.");
        }*/
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
