/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.addItemView;
import view.products.addProductView;

/**
 *
 * @author El Rey
 */
public class CreateProductsController implements ActionListener{
    
    private addItemView addItemView;
    private addProductView addProductView;

    public CreateProductsController(addItemView addItemView, addProductView addProductView) {
        
        this.addItemView = addItemView;
        this.addProductView = addProductView;
        
        addItemView.addProductButton.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {

        addItemView.dispose();
        addProductView.setVisible(true);
        addProductView.setLocationRelativeTo(null);
    }
    
}
