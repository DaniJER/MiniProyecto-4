
/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

*/
package model.buyModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class BuyModel {
    
    private String productName;
    private String quantityStock;
    private String productBrand;
    private String productPrice;
    private String productQuantity;
    private String productId;
    
    String fileRuteProducts = "src/main/java/textFiles/productsData";
    
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
                            this.productBrand = dataArray[5];
                            this.productPrice = dataArray[6];
                            this.productId = dataArray[7];
                                                        
                            JOptionPane.showMessageDialog(null, "Cantidad encontrada" + quantityStock);
                            
                            String stock = quantityStock.substring(10);
                            int stockParse = Integer.parseInt(stock);
                            
                            String option = JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar : ");
                            int optionInt = Integer.parseInt(option);
                            
                            String productIdSubstring = productId.substring(17);
                            int productIdParse = Integer.parseInt(productIdSubstring);
                            
                            if (stockParse >= optionInt){
                                productStockValidation(productId, productBrand, productName,  optionInt, productPrice, quantityStock,  productIdParse);
                                int cantidadRestante = stockParse - optionInt;
                                updateStockDealer(cantidadRestante,id);
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
    

    
    public boolean productStockValidation(String id, String brand, String nameProduct, int quantityToAdd, String price, String quantity, int idSubstring) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileRuteProducts))) {
            String line;
            ArrayList<String> updatedProductsList = new ArrayList<>();
            boolean productFound = false;

            while ((line = br.readLine()) != null) {
                String[] dataArray = line
                        .replaceAll("[\\[\\]]", "")
                        .split(", ");

                String productId = dataArray[4].trim();
                String productIdSubstring = productId.substring(17);

                // Convertir idSubstring a cadena antes de comparar
                if (productIdSubstring.equals(String.valueOf(idSubstring))) {
                    String currentQuantity = dataArray[3].trim();
                    String currentQuantitySubstring = currentQuantity.substring(10);
                    int currentQuantityInteger = Integer.parseInt(currentQuantitySubstring);
                    int newQuantity = currentQuantityInteger + quantityToAdd;
                    dataArray[3] = "Cantidad: " + newQuantity;
                    System.out.println("Se actualizó la cantidad");
                    productFound = true;
                }
                updatedProductsList.add(String.join(", ", dataArray));
            }
                if (!productFound) {
                    String quantityToAddString = String.valueOf(quantityToAdd);
                    // Agregar un nuevo producto solo si el ID es único
                    ArrayList<String> newProductData = new ArrayList<>();
                    newProductData.add(nameProduct);
                    newProductData.add(brand);
                    newProductData.add(price);
                    newProductData.add("Cantidad: " + quantityToAddString);
                    newProductData.add(id);

                    // Agregar datos a la colección principal
                    updatedProductsList.add(String.join(", ", newProductData));

                    // Escribir en el archivo
                    try (FileWriter fileWriter = new FileWriter(fileRuteProducts, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                        bufferedWriter.write(String.join(", ", newProductData));
                        bufferedWriter.newLine();  // Agregar una nueva línea para cada producto
                        JOptionPane.showMessageDialog(null, "Datos del producto almacenados");
                    } catch (IOException e) {
                        throw new RuntimeException("Error al añadir texto al archivo: " + e.getMessage(), e);
                    }
                }else if (productFound) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteProducts))) {
                        for (String updatedProduct : updatedProductsList) {
                        writer.write(updatedProduct);
                        writer.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false; // Manejo de excepciones al escribir en el archivo
                     }
                    System.out.println("Producto actualizado:");
                    for (String entry : updatedProductsList) {
                        System.out.println("Datos del producto: " + entry);
                    }
                }else {
                    System.out.println("Producto no encontrado. Se añadió uno nuevo si el ID era único.");
                    }
            return true; // Indica que se encontró el producto y se actualizó la cantidad o se añadió uno nuevo
        }catch (IOException e) {
            e.printStackTrace();
            return false;
            }
    }
    
    public boolean updateStockDealer(int cantidadStockRestante, String id) {
    String fileRuteDealers = "src/main/java/textFiles/dealersData";

    try (BufferedReader br = new BufferedReader(new FileReader(fileRuteDealers))) {

        String line;
        ArrayList<String> updatedDealerList = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            String[] dataArray = line.replaceAll("[\\[\\]]", "").split(", ");

            for (int i = 0; i < dataArray.length; i++) {
                String[] keyValue = dataArray[i].split(":");
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();

                if (value.equals(id)) {
                    dataArray[4] = "Cantidad: " + cantidadStockRestante; // Ajustar el índice para apuntar al campo correcto
                    // Crear una nueva línea con los campos actualizados
                    String updatedLine = "[" + String.join(", ", dataArray) + "]";
                    updatedDealerList.add(updatedLine);
                    break; // Salir del bucle una vez que se ha encontrado el proveedor
                }
            }
        }

        // Escribir la lista actualizada en el archivo de proveedores
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteDealers))) {
            for (String updatedDealer : updatedDealerList) {
                writer.write(updatedDealer);
                writer.newLine();
            }
            return true; // Devolver true indicando que la actualización fue exitosa
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones al escribir en el archivo
        }

    } catch (IOException e) {
        e.printStackTrace();
        return false; // Manejo de excepciones al leer el archivo
    }
}


}


