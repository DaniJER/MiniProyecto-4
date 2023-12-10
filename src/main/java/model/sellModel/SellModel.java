/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.sellModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class SellModel {
    
    private String productName;
    String rutaArchivo = "src/main/java/textFiles/productsData";
    
    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }
    
    public boolean validateProduct(String name){
        
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            ArrayList<String> productsList = new ArrayList<>();

            // Lee el archivo y almacena cada línea en el ArrayList
            while ((line = br.readLine()) != null) {
                productsList.add(line);
            }

            // Busca el nombre en el ArrayList
            for (String productsData : productsList) { 
                String[] dataArray = productsData
                        .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                        .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");
                    if (keyValue[1].trim().equals(name)) {
                        
                        // Si se encuentra el nombre, muestra los datos
                        //System.out.println("Datos del cliente:");
                        
                        for (String entry : dataArray) {
                            
                            System.out.println("Datos del producto: " + entry);
                        }
                        
                        JOptionPane.showMessageDialog(null,"El producto existe");
                            
                        return true; // Indica que se encontró el producto
                    }
                }
            }

            JOptionPane.showMessageDialog(null,"Producto no encontrado.");
            return false; // Indica que no se encontró el producto

        } catch (IOException e) {
                e.printStackTrace();
            return false; // Manejo de excepciones
        }
    }
    
    
    }
