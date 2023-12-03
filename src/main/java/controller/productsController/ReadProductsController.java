/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.products.readProductView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadProductsController implements ActionListener{

    private searchItemView searchItemView;
    private readProductView readProductView;

    public ReadProductsController(searchItemView searchItemView, readProductView readProductView) {
        this.searchItemView = searchItemView;
        this.readProductView = readProductView;
        
        searchItemView.searchProductButton.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        searchItemView.dispose();
        readProductView.setVisible(true);
        readProductView.setLocationRelativeTo(null);
        
    }
    
}
