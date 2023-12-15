
/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

*/
package model.buyModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class BuyModel {
    
    String productName;
    String quantityStock;
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(String quantityStock) {
        this.quantityStock = quantityStock;
    }
    
    
    
    public boolean buy(String id) {
        
       try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/dealersData"))) {
            String line;
            ArrayList<String> dealerList = new ArrayList<>();

            // Lee el archivo y almacena cada línea en el ArrayList
            while ((line = br.readLine()) != null) {
                dealerList.add(line);
            }

            // Busca la cédula en el ArrayList
            for (String dealerData : dealerList) {
                String[] dataArray = dealerData
                        .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                        .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");
                    if (keyValue[1].trim().equals(id)) {
                        // Si se encuentra la cédula, muestra el producto
                            this.productName = dataArray[3];
                            this.quantityStock = dataArray[4];
                            
                            JOptionPane.showMessageDialog(null, "Cantidad encontrada" + quantityStock);
                            String stock = quantityStock.substring(10);
                            int stockParse = Integer.parseInt(stock);
                            String option = JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar : ");
                            
                            
                            int optionInt = Integer.parseInt(option);
                            
                            if (stockParse <= optionInt){
                                System.out.println("Felicidades, si es la misma cantidad");
                            }else {
                                System.out.println("Nada mi rey");
                            }
                            
                        return true; // Indica que se encontró la cédula
                    }
                    
                }
            }

            JOptionPane.showMessageDialog(null,"Cliente no encontrado.");
            return false; // Indica que no se encontró la cédula

        } catch (IOException e) {
                e.printStackTrace();
            return false; // Manejo de excepciones
        }
    }
}


