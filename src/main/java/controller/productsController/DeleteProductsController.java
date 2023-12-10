/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.products. *;
/**
 *
 * @author El Rey
 */
public class DeleteProductsController implements ActionListener {
    
    private deleteItemView deleteItemView;
    private deleteProductView deleteProductView;
    
    public DeleteProductsController(deleteItemView deleteItemView, deleteProductView deleteProductView){
        this.deleteItemView = deleteItemView;
        this.deleteProductView = deleteProductView;
        
        deleteItemView.deleteProductButton.addActionListener(this);
        //deleteProductView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteItemView.deleteProductButton){
            deleteItemView.dispose();
            deleteProductView.setVisible(true);
            deleteProductView.setLocationRelativeTo(null);
        }
        /*if(e.getSource() == deleteProductView.backButton){
            deleteProductView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }*/
    }
}
