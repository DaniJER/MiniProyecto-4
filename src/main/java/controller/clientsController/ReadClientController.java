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
import javax.swing.JOptionPane;
import model.clientesModel.CreateClientModel;
import model.clientesModel.ReadClientModel;
import view.clients.readClientView;
import view.clients.showClientsView;
import view.principalView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadClientController implements ActionListener {

    private searchItemView searchItemView;
    private readClientView readClientView;
    private ReadClientModel readClientModel;
    private showClientsView showClientsView;
    private principalView principalView;
    private CreateClientModel createClientModel;
    public ReadClientController(searchItemView searchItemView, readClientView readClientView, ReadClientModel readClientModel, showClientsView showClientsView, principalView principalView, CreateClientModel createClientModel ) {
        
        this.searchItemView = searchItemView;
        this.readClientView = readClientView;
        this.readClientModel = readClientModel;
        this.showClientsView = showClientsView;
        this.principalView = principalView;
        this.createClientModel = createClientModel;
        
        searchItemView.selectClientButton.addActionListener(this);
        readClientView.searchClientButton.addActionListener(this);
        showClientsView.principalMenuButton.addActionListener(this);
        readClientView.backButtonReadClients.addActionListener(this);
        readClientView.menuPrincipalButtonClients.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        searchItemView.dispose();
        readClientView.setVisible(true);
        readClientView.setLocationRelativeTo(null);
        showClientsView.backButtonClients.addActionListener(this);
        
        if(e.getSource() == readClientView.searchClientButton){
            
            String id = readClientView.idClientField.getText();
            if(id.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor ingrese una cedula");
                
            }else{
                
                readClientModel.setIdClient(readClientView.idClientField.getText());
                
                if(readClientModel.readClient(readClientView.idClientField.getText()) == false){
                
                    readClientView.setVisible(true);
                }else{
           
                    readClientView.dispose();
                    showClientsView.setVisible(true); 
                    showClientsView.setLocationRelativeTo(null);

                    showClientsView.name.setText(readClientModel.getName());
                    showClientsView.lastName.setText(readClientModel.getLastName());
                    showClientsView.cel.setText(readClientModel.getCel());
                    showClientsView.id.setText(readClientModel.getId());
                    showClientsView.clientProducts.setText("Productos " +String.valueOf(createClientModel.getProducts()));
                }
            }
        }
        if(e.getSource() == showClientsView.backButtonClients){
        
            showClientsView.dispose();
            readClientView.setVisible(true);
        
        }
        if(e.getSource() == showClientsView.principalMenuButton){
        
            showClientsView.dispose();
            readClientView.dispose();
            principalView.setVisible(true);
        }
        if(e.getSource() == readClientView.backButtonReadClients){
        
            readClientView.dispose();
            searchItemView.setVisible(true);
           
        }
        if(e.getSource() == readClientView.menuPrincipalButtonClients){
        
            readClientView.dispose();
            showClientsView.dispose();
            principalView.setVisible(true);
           
        }
        
        
        
    }
    
}
