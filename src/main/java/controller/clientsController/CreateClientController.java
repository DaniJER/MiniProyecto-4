/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import model.clientesModel.CreateClientModel;
import view.addItemView;
import view.clients.createClientView;
/**
 *
 * @author El Rey
 */
public class CreateClientController implements ActionListener{
    private addItemView addItemView;
    private createClientView createClientView;
    private CreateClientModel createClientModel;
            
    public CreateClientController(addItemView addItemView, createClientView createClientView, CreateClientModel createClientModel) {
        
        this.addItemView = addItemView;
        this.createClientView = createClientView;
        this.createClientModel = createClientModel;
        
        addItemView.selectClientButton.addActionListener(this);
        createClientView.addClientButton.addActionListener(this);
    }
    public void startCreateClientView(){
    
        createClientView.setTitle("Crear un nuevo cliente");
        createClientView.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == addItemView.selectClientButton){
            
            addItemView.dispose();
            createClientView.setVisible(true);
            createClientView.setLocationRelativeTo(null);
            
        }
        if(e.getSource() == createClientView.addClientButton){
        
            createClientModel.setName("Nombre: " + createClientView.clientNameField.getText());
            createClientModel.setLastName("Apellido: " +createClientView.lastNameClientField.getText());
            createClientModel.setId("Identificación: " +createClientView.idClientField.getText());
            createClientModel.setCel("Celular: " +createClientView.celClientField.getText());
            
            createClientModel.createTextFile();
            createClientModel.addClientsCollection();
            
        }
    }
}
