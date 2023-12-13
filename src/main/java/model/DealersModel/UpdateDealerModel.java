package model.DealersModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UpdateDealerModel {
    private String nameDealer;
    private String lastNameDealer;
    private String idDealer;
    private String nameProductDealer;
    private String celDealer;
    
    File dealersFile;
    
    String fileRuteDealers = "src/main/java/textFiles/dealersData";

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
    
    public boolean updateDealer(String id){
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileRuteDealers))) {

            String line;
            
            ArrayList<String> updatedDealerList = new ArrayList<>();
            
            boolean clientFound = false;

            while ((line = br.readLine()) != null) {
                String[] dataArray = line
                        .replaceAll("[\\[\\]]", "")
                        .split(", ");

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");

                    if (keyValue[1].trim().equals(id)) {
                        dataArray[0] = "Nombre: " + nameDealer;
                        dataArray[1] = "Apellido: " + lastNameDealer;
                        dataArray[4] = "Celular: " + celDealer;
                        clientFound = true;
                    }
                }

                updatedDealerList.add(String.join(", ", dataArray));
            }

            if (clientFound) {
                // Escribe la lista actualizada en el archivo de texto
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteDealers))) {
                    for (String updatedDealer : updatedDealerList) {
                        writer.write(updatedDealer);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return false; // Manejo de excepciones al escribir en el archivo
                }

                System.out.println("Proovedor actualizado:");
                for (String entry : updatedDealerList) {
                    System.out.println("Datos del proveedor: " + entry);
                }

                return true; // Indica que se encontró la cédula y se actualizó el cliente
            } else {
                System.out.println("Proovedor no encontrado.");
                return false; // Indica que no se encontró la cédula
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones al leer el archivo
        }
    }
}
