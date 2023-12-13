/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sellController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.sellModel.SellModel;
import view.principalView;
import view.sell.searchAndBuyProductView;
import view.sell.searchClientToBuy;

/**
 *
 * @author El Rey
 */
public class SellController implements ActionListener {
    
    private searchAndBuyProductView searchProductView;
    private SellModel sellModel;
    private principalView principalView;
    private searchClientToBuy searchAndBuyClient;

    public SellController(searchAndBuyProductView searchProductView, SellModel sellModel, principalView principalView, searchClientToBuy searchAndBuyClient) {
        
        this.searchProductView = searchProductView;
        this.sellModel = sellModel;
        this.principalView = principalView;
        this.searchAndBuyClient = searchAndBuyClient;
        
        
        principalView.sellButton.addActionListener(this);
        searchProductView.searchProductButton.addActionListener(this);
        searchProductView.BackButtonProducts.addActionListener(this);
        searchAndBuyClient.searchClientToBuy.addActionListener(this);
        searchAndBuyClient.BackButtonClient.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == principalView.sellButton){
            
            principalView.dispose();
            searchProductView.setVisible(true);
            searchProductView.setLocationRelativeTo(null);
        }
        if(e.getSource() == searchProductView.searchProductButton){
        
            sellModel.setProductName(searchProductView.nameProductToSellField.getText());
            
            if(sellModel.validateProduct(searchProductView.nameProductToSellField.getText()) == true){
            
                searchProductView.dispose();
                searchAndBuyClient.setVisible(true);
                searchAndBuyClient.setLocationRelativeTo(null);
            
            }
        }
        if(e.getSource() == searchAndBuyClient.searchClientToBuy){
        
            sellModel.setIdClient(searchAndBuyClient.idClienteField.getText());
            try {
                sellModel.validateClient(searchAndBuyClient.idClienteField.getText(), searchProductView.nameProductToSellField.getText());
            } catch (IOException ex) {
                Logger.getLogger(SellController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == searchAndBuyClient.BackButtonClient){
        
            searchAndBuyClient.dispose();
            searchProductView.setVisible(true);
        }
            
        if(e.getSource() == searchProductView.BackButtonProducts){
        
            searchProductView.dispose();
            principalView.setVisible(true);
        }
         
    }
}
