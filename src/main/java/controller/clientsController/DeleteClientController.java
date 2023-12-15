/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.clients. *;
import view. *;
import model.clientesModel. *;
/**
 *
 * @author El Rey
 */
public class DeleteClientController implements ActionListener {
    private deleteItemView deleteItemView;
    private deleteClientView deleteClientView;
    private DeleteClientModel deleteClientModel;
    private showClientsRemoved showClientsRemoved;
    private principalView principalView; 
    
    public DeleteClientController(deleteItemView deleteItemView, deleteClientView deleteClientView, DeleteClientModel deleteClientModel, showClientsRemoved showClientsRemoved, principalView principalView){
        this.deleteItemView = deleteItemView;
        this.deleteClientView = deleteClientView;
        this.deleteClientModel = deleteClientModel;
        this.showClientsRemoved = showClientsRemoved;
        this.principalView = principalView;
        
        deleteItemView.deleteClientButton.addActionListener(this);
        deleteClientView.deleteClientButton.addActionListener(this);
        showClientsRemoved.backButtonClients.addActionListener(this);
        showClientsRemoved.principalMenuButton.addActionListener(this);
        deleteClientView.backButtonDeleteClients.addActionListener(this);
        
        // deleteClientView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == deleteItemView.deleteClientButton){
            deleteItemView.dispose();
            deleteClientView.setVisible(true);
            deleteClientView.setSize(deleteItemView.getWidth(), deleteItemView.getHeight());
            deleteClientView.setLocationRelativeTo(null);
        }
        if(e.getSource() == deleteClientView.deleteClientButton){
            
            deleteClientModel.deleteClient(deleteClientView.idClientField.getText());
            showClientsRemoved.nameClientRemoved.setText(deleteClientModel.getNameClientRemoved());
            showClientsRemoved.lastNameClientRemoved.setText(deleteClientModel.getLastNameClientRemoved());
            showClientsRemoved.idClientRemoved.setText(deleteClientModel.getIdClientRemoved());
            showClientsRemoved.celClientRemoved.setText(deleteClientModel.getCelClientRemoved());
            
            deleteClientView.dispose();
            showClientsRemoved.setVisible(true);
            showClientsRemoved.setLocationRelativeTo(null);
        }
        if(e.getSource() == showClientsRemoved.backButtonClients){
        
            showClientsRemoved.dispose();
            deleteClientView.setVisible(true);
        
        }
        if(e.getSource() == showClientsRemoved.principalMenuButton){
        
            showClientsRemoved.dispose();
            deleteClientView.dispose();
            principalView.setVisible(true);
        }
        
        if(e.getSource() == deleteClientView.backButtonDeleteClients){
        
            deleteClientView.dispose();
            deleteItemView.setVisible(true);
        }
    }
}
