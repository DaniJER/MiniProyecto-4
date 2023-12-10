/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;
import model.clientesModel.CreateClientModel;
import view.addItemView;
import view.clients.createClientView;
import view.principalView;
/**
 *
 * @author El Rey
 */
public class CreateClientController implements ActionListener{
    
    private addItemView addItemView;
    private createClientView createClientView;
    private CreateClientModel createClientModel;
    private principalView principalView;
            
    public CreateClientController(addItemView addItemView, createClientView createClientView, CreateClientModel createClientModel, principalView principalView){
        
        this.addItemView = addItemView;
        this.createClientView = createClientView;
        this.createClientModel = createClientModel;
        this.principalView = principalView;
        
        
        addItemView.selectClientButton.addActionListener(this);
        createClientView.addClientButton.addActionListener(this);
        addItemView.backButtonaddItem.addActionListener(this);
        createClientView.backButtonAddClient.addActionListener(this);
        createClientView.principalMenuAddClient.addActionListener(this);
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
            
            String name = createClientView.clientNameField.getText();
            String lastName = createClientView.lastNameClientField.getText();
            String id = createClientView.idClientField.getText();
            String cel = createClientView.celClientField.getText();
            
            //VALIDADOR PARA ASEGURARSE DE QUE SE LLENEN LOS CAMPOS DE AGREGAR CLIENTE
            if(name.isEmpty() || lastName.isEmpty() || id.isEmpty() || cel.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor llene los campos");
                
            }else{
            
                createClientModel.setName("Nombre: " + createClientView.clientNameField.getText());
                createClientModel.setLastName("Apellido: " +createClientView.lastNameClientField.getText());
                createClientModel.setId("Identificación: " +createClientView.idClientField.getText());
                createClientModel.setCel("Celular: " +createClientView.celClientField.getText());
                

                createClientModel.createTextFile();
                createClientModel.addClientsCollection();
            }
        }
        if(e.getSource() == addItemView.backButtonaddItem){
        
            addItemView.dispose();
            principalView.setVisible(true);
        }
        if(e.getSource() == createClientView.backButtonAddClient){
        
            createClientView.dispose();
            addItemView.setVisible(true);
        }
        if(e.getSource() == createClientView.principalMenuAddClient){
        
            addItemView.dispose();
            createClientView.dispose();
            principalView.setVisible(true);
        }
        
    }
}
