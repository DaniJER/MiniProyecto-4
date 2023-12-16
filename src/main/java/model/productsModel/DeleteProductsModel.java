/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562
    
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.productsModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
public class DeleteProductsModel {
    private String productName;
    private String productBrand;
    private String productPrice;
    private String productQuantity;
    private String productId;
    
    File productsFile;
    
    String fileRuteProducts = "src/main/java/textFiles/productsData";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public File getProductsFile() {
        return productsFile;
    }

    public void setProductsFile(File productsFile) {
        this.productsFile = productsFile;
    }

    public String getFileRuteProducts() {
        return fileRuteProducts;
    }

    public void setFileRuteProducts(String fileRuteProducts) {
        this.fileRuteProducts = fileRuteProducts;
    }
    
public boolean deleteProduct(String id) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileRuteProducts))) {
        String line;
        ArrayList<String> productList = new ArrayList<>();

        // Lee el archivo y almacena cada línea en el ArrayList
        while ((line = br.readLine()) != null) {
            productList.add(line);
        }

        // Usar un iterador para recorrer la lista y eliminar elementos de manera segura
        Iterator<String> iterator = productList.iterator();
        while (iterator.hasNext()) {
            String productData = iterator.next();
            String[] dataArray = productData.split(", ");

            for (String data : dataArray) {
                String[] keyValue = data.split(": ");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();

                    if (key.equals("Id de producto") && value.equals(id)) {
                        // Elimina el producto usando el iterador
                        int result = JOptionPane.showConfirmDialog(null, "Se eliminará el producto, ¿Está de acuerdo?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            iterator.remove();
                            JOptionPane.showMessageDialog(null, "El producto ha sido correctamente eliminado de la base de datos");

                            // Escribe el ArrayList actualizado en el archivo de texto
                            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteProducts))) {
                                for (String updatedProduct : productList) {
                                    writer.write(updatedProduct);
                                    writer.newLine();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            return true; // Indica que se encontró el ID y se eliminó el producto
                        } else {
                            break;
                        }
                    }
                } else if (data.contains("Id de producto")) {
                    // Manejo para el nuevo formato
                    String productId = data.substring(data.lastIndexOf(":") + 1).trim();
                    if (productId.equals(id)) {
                        int result = JOptionPane.showConfirmDialog(null, "Se eliminará el producto, ¿Está de acuerdo?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            iterator.remove();
                            JOptionPane.showMessageDialog(null, "El producto ha sido correctamente eliminado de la base de datos");

                            // Escribe el ArrayList actualizado en el archivo de texto
                            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteProducts))) {
                                for (String updatedProduct : productList) {
                                    writer.write(updatedProduct);
                                    writer.newLine();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            return true; // Indica que se encontró el ID y se eliminó el producto
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        return false; // Indica que no se encontró el ID
    } catch (IOException e) {
        e.printStackTrace();
        return false; // Manejo de excepciones
    }
}


}
