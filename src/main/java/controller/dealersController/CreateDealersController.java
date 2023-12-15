/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562
    
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DealersModel.CreateDealerModel;
import view.addItemView;
import view.dealers.createDealerView;
import view.principalView;

/**
 *
 * @author El Rey
 */
public class CreateDealersController implements ActionListener {
    
    private addItemView addItemView;
    private createDealerView createDealerView;
    private CreateDealerModel createDealerModel;
    private principalView principalView;

    public CreateDealersController(addItemView addItemView, createDealerView createDealerView, CreateDealerModel createDealerModel, principalView principalView) {
        
        this.addItemView = addItemView;
        this.createDealerView = createDealerView;
        this.createDealerModel = createDealerModel;
        this.principalView = principalView;
        
        addItemView.addDealerButton.addActionListener(this);
        createDealerView.addDealerButton.addActionListener(this);
        createDealerView.backButtonDealer.addActionListener(this);
        createDealerView.principalMenuButtonDealer.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        addItemView.dispose();
        createDealerView.setVisible(true);
        createDealerView.setLocationRelativeTo(null);
        
        if(e.getSource() == createDealerView.addDealerButton){
            
            String name = createDealerView.dealerNamerField.getText();
            String lastName = createDealerView.lastNameDealerField.getText();
            String id = createDealerView.idDealerField.getText();
            String cel = createDealerView.celDealerField.getText();
            
            //VALIDADOR PARA ASEGURARSE DE QUE SE LLENEN LOS CAMPOS DE AGREGAR CLIENTE
            if(name.isEmpty() || lastName.isEmpty() || id.isEmpty() || cel.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor llene los campos");
                
            }else{
            
                createDealerModel.setNameDealer("Nombre: " +createDealerView.dealerNamerField.getText());
                createDealerModel.setLastNameDealer("Apellido: " +createDealerView.lastNameDealerField.getText());
                createDealerModel.setIdDealer("Identificacion: " +createDealerView.idDealerField.getText());
                createDealerModel.setNameProductDealer("Producto: " +createDealerView.dealerProductField.getText());
                createDealerModel.setQuantifyProductDealer("Cantidad: " + createDealerView.priceProductDealer.getText());
                createDealerModel.setBrandProductDealer("Marca: " + createDealerView.brandProductDealer.getText());
                createDealerModel.setPriceProductDealer("Precio : " + createDealerView.priceProductDealer.getText());
                createDealerModel.setCelDealer("Celular: " +createDealerView.celDealerField.getText());

                createDealerModel.createTextFile();
                createDealerModel.addDealersCollection();
            }
        }
        if(e.getSource() == createDealerView.backButtonDealer){
        
            createDealerView.dispose();
            addItemView.setVisible(true);
        }
        if(e.getSource() == createDealerView.principalMenuButtonDealer){
        
            createDealerView.dispose();
            addItemView.dispose();
            principalView.setVisible(true);
        }
    }
    
}
