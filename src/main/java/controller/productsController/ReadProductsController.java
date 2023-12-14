/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.productsModel.ReadProductsModel;
import view.principalView;
import view.products.readProductView;
import view.products.showProductsView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadProductsController implements ActionListener{

    private searchItemView searchItemView;
    private readProductView readProductView;
    private ReadProductsModel readProductsModel;
    private showProductsView showProductsView;
    private principalView principalView; 

    public ReadProductsController(searchItemView searchItemView, readProductView readProductView, ReadProductsModel readProductsModel, showProductsView showProductsView, principalView principalView ) {
        
        this.searchItemView = searchItemView;
        this.readProductView = readProductView;
        this.readProductsModel = readProductsModel;
        this.showProductsView = showProductsView;
        this.principalView = principalView;
        
        searchItemView.searchProductButton.addActionListener(this);
        readProductView.readProductButton.addActionListener(this);
        showProductsView.backButtonProducts.addActionListener(this);
        showProductsView.principalMenuButton.addActionListener(this);
        searchItemView.backButtonSearchItem.addActionListener(this);
        readProductView.backButtonReadProducts.addActionListener(this);
        readProductView.principalMenuButtonProducts.addActionListener(this);
        
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        searchItemView.dispose();
        readProductView.setVisible(true);
        readProductView.setLocationRelativeTo(null);
        
        if(e.getSource() == readProductView.readProductButton){
            
            String id = readProductView.idProduct.getText();
            
            if(id.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor ingrese el Id de un producto");
                
            }else{
                
                readProductsModel.setProductId(readProductView.idProduct.getText());
                
                if(readProductsModel.readProduct(readProductView.idProduct.getText()) == false){
                    
                    readProductView.setVisible(true);
                }else{
           
                    readProductView.dispose();
                    showProductsView.setVisible(true); 
                    showProductsView.setLocationRelativeTo(null);

                    showProductsView.productName.setText(readProductsModel.getProductName());
                    showProductsView.productBrand.setText(readProductsModel.getProductBrand());
                    showProductsView.productPrice.setText(readProductsModel.getProductPrice());
                    showProductsView.productQuantity.setText(readProductsModel.getProductQuantity());
                    showProductsView.productId.setText(readProductsModel.getProductId());
                }
            }
        }
        if(e.getSource() == showProductsView.backButtonProducts){
        
            showProductsView.dispose();
            readProductView.setVisible(true);
        
        }
        if(e.getSource() == showProductsView.principalMenuButton){
        
            showProductsView.dispose();
            readProductView.dispose();
            principalView.setVisible(true);
        }
        if(e.getSource() == readProductView.principalMenuButtonProducts){
        
            showProductsView.dispose();
            readProductView.dispose();
            principalView.setVisible(true);
        }
        if(e.getSource() == readProductView.backButtonReadProducts){
        
            readProductView.dispose();
            searchItemView.setVisible(true);
            
        }
        if(e.getSource() == searchItemView.backButtonSearchItem ){
        
            searchItemView.dispose();
            readProductView.dispose();
            principalView.setVisible(true);
            
        }
        
    }
}
