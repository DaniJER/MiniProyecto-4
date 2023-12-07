/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DealersModel.CreateDealerModel;
import view.addItemView;
import view.dealers.createDealerView;

/**
 *
 * @author El Rey
 */
public class CreateDealersController implements ActionListener {
    
    private addItemView addItemView;
    private createDealerView createDealerView;
    private CreateDealerModel createDealerModel;

    public CreateDealersController(addItemView addItemView, createDealerView createDealerView, CreateDealerModel createDealerModel) {
        
        this.addItemView = addItemView;
        this.createDealerView = createDealerView;
        this.createDealerModel = createDealerModel;
        
        addItemView.addDealerButton.addActionListener(this);
        createDealerView.addDealerButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        addItemView.dispose();
        createDealerView.setVisible(true);
        createDealerView.setLocationRelativeTo(null);
        
        if(e.getSource() == createDealerView.addDealerButton){
            
            createDealerModel.setNameDealer("Nombre: " +createDealerView.dealerNamerField.getText());
            createDealerModel.setLastNameDealer("Apellido: " +createDealerView.lastNameDealerField.getText());
            createDealerModel.setIdDealer("Identificacion: " +createDealerView.idDealerField.getText());
            createDealerModel.setNameProductDealer("Producto: " +createDealerView.dealerProductField.getText());
            createDealerModel.setCelDealer("Celular: " +createDealerView.celDealerField.getText());
            
            createDealerModel.createTextFile();
            createDealerModel.addDealersCollection();
        }
    }
    
}
