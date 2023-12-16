/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.backUp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author El Rey
 */
public class BackUpModel {
    
    
    public void respaldo(String rutaOriginalClientes, String rutaRespaldoClientes, String rutaOriginalProductos, String rutaRespaldoProductos, String rutaOriginalDistribuidores, String rutaRespaldoDistribuidores) throws IOException {
        
        // Convierte las rutas a objetos Path
        Path pathArchivoOriginalClientes = Paths.get(rutaOriginalClientes);
        Path pathArchivoRespaldoClientes = Paths.get(rutaRespaldoClientes);
        Path pathArchivoOriginalProductos = Paths.get(rutaOriginalProductos);
        Path pathArchivoRespaldoProductos = Paths.get(rutaRespaldoProductos);
        Path pathArchivoOriginalDistribuidores = Paths.get(rutaOriginalDistribuidores);
        Path pathArchivoRespaldoDistribuidores = Paths.get(rutaRespaldoDistribuidores);

        // Lee todas las líneas del archivo original
        List<String> lineas1 = Files.readAllLines(pathArchivoOriginalClientes);
        List<String> lineas2 = Files.readAllLines(pathArchivoOriginalProductos);
        List<String> lineas3 = Files.readAllLines(pathArchivoOriginalDistribuidores);
        
        // Crea el archivo de respaldo y escribe las líneas en él
        Files.write(pathArchivoRespaldoClientes, lineas1);
        Files.write(pathArchivoRespaldoProductos, lineas2);
        Files.write(pathArchivoRespaldoDistribuidores, lineas3);
        
        JOptionPane.showMessageDialog(null,"Respaldo realizado cone exito");
        
        // Alternativamente, puedes usar Files.copy para realizar el respaldo
        // Files.copy(pathArchivoOriginal, pathArchivoRespaldado, StandardCopyOption.REPLACE_EXISTING);
    }
    
}
