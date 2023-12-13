package model.DealersModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class DeleteDealerModel {
    
    String fileRuteDealers = "src/main/java/textFiles/dealersData";
    
    private String nameDealerRemoved;
    private String lastNameDealerRemoved;
    private String idDealerRemoved;
    private String celDealerRemoved;

    public String getNameDealerRemoved() {
        return nameDealerRemoved;
    }

    public void setNameDealerRemoved(String nameDealerRemoved) {
        this.nameDealerRemoved = nameDealerRemoved;
    }

    public String getLastNameDealerRemoved() {
        return lastNameDealerRemoved;
    }

    public void setLastNameDealerRemoved(String lastNameDealerRemoved) {
        this.lastNameDealerRemoved = lastNameDealerRemoved;
    }

    public String getIdDealerRemoved() {
        return idDealerRemoved;
    }

    public void setIdDealerRemoved(String idDealerRemoved) {
        this.idDealerRemoved = idDealerRemoved;
    }

    public String getCelDealerRemoved() {
        return celDealerRemoved;
    }

    public void setCelDealerRemoved(String celDealerRemoved) {
        this.celDealerRemoved = celDealerRemoved;
    }

    public String getFileRuteDealers() {
        return fileRuteDealers;
    }

    public void setFileRuteDealers(String fileRuteDealers) {
        this.fileRuteDealers = fileRuteDealers;
    }
    
    public boolean deleteDealer(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/dealersData"))) {

            String line;
            ArrayList<String> dealerList = new ArrayList<>();

            // Lee el archivo y almacena cada línea en el ArrayList
            while ((line = br.readLine()) != null) {
                dealerList.add(line);
            }

            // Usar un iterador para recorrer la lista y eliminar elementos de manera segura
            Iterator<String> iterator = dealerList.iterator();
            while (iterator.hasNext()) {
                String dealerData = iterator.next();
                String[] dataArray = dealerData
                        .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                        .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");
                    if (keyValue[1].trim().equals(id)) {
                        // Elimina el proveedor usando el iterador
                        int result = JOptionPane.showConfirmDialog(null, "Se eliminaran los datos del usuario, ¿Está de acuerdo?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(result == JOptionPane.YES_OPTION){
                           iterator.remove(); 
                        }else {
                            break;
                        }

                        // Escribe el ArrayList actualizado en el archivo de texto
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/textFiles/dealersData"))) {
                            for (String updatedDealer : dealerList) {
                                writer.write(updatedDealer);
                                writer.newLine();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        /*System.out.println("Proveedor eliminado:");
                        for (String entry : dataArray) {
                            System.out.println("Datos del proveedor: " + entry);
                        }

                        this.nameDealerRemoved = dataArray[0];
                        this.lastNameDealerRemoved = dataArray[1];
                        this.idDealerRemoved = dataArray[2];
                        this.celDealerRemoved = dataArray[3];
                        */
                        return true; // Indica que se encontró la cédula y se eliminó el proveedor
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
            return false; // Indica que no se encontró la cédula
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones
        }
    }
}
