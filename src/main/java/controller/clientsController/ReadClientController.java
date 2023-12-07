/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.clientesModel.ReadClientModel;
import view.clients.readClientView;
import view.clients.showClientsView;
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

    public ReadClientController(searchItemView searchItemView, readClientView readClientView, ReadClientModel readClientModel, showClientsView showClientsView) {
        
        this.searchItemView = searchItemView;
        this.readClientView = readClientView;
        this.readClientModel = readClientModel;
        this.showClientsView = showClientsView;
        
        searchItemView.selectClientButton.addActionListener(this);
        readClientView.searchClientButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        searchItemView.dispose();
        readClientView.setVisible(true);
        readClientView.setLocationRelativeTo(null);
        showClientsView.backButtonClients.addActionListener(this);
        
        if(e.getSource() == readClientView.searchClientButton){
            
            readClientModel.setIdClient(readClientView.idClientField.getText());
            readClientModel.readClient(readClientView.idClientField.getText());
            
            readClientView.dispose();
            showClientsView.setVisible(true); 
            showClientsView.setLocationRelativeTo(null);
            
            showClientsView.name.setText(readClientModel.getName());
            showClientsView.lastName.setText(readClientModel.getLastName());
            showClientsView.cel.setText(readClientModel.getCel());
            showClientsView.id.setText(readClientModel.getId());
        }
        if(e.getSource() == showClientsView.backButtonClients){
        
            showClientsView.dispose();
            readClientView.setVisible(true);
        
        }
        
        
    }
    
}
