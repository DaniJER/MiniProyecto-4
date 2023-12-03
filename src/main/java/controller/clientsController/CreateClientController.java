/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.addItemView;
import view.clients.createClientView;
/**
 *
 * @author El Rey
 */
public class CreateClientController implements ActionListener{
    
    private addItemView addItemView;
    private createClientView createClienteView;

    public CreateClientController(addItemView addItemView, createClientView createClienteView) {
        
        this.addItemView = addItemView;
        this.createClienteView = createClienteView;
        
        //addItemView.addClientButton.addActionListener(this);
    }
    public void startCreateClientView(){
    
        createClienteView.setTitle("Crear un nuevo cliente");
        createClienteView.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        addItemView.dispose();
        createClienteView.setVisible(true);
        createClienteView.setLocationRelativeTo(null);
    }
    
}
