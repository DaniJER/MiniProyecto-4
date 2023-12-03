/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.clients.readClientView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadClientController implements ActionListener {

    private searchItemView searchItemView;
    private readClientView readClientView;

    public ReadClientController(searchItemView searchItemView, readClientView readClientView) {
        this.searchItemView = searchItemView;
        this.readClientView = readClientView;
        
        searchItemView.searchClientButton.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        searchItemView.dispose();
        readClientView.setVisible(true);
        readClientView.setLocationRelativeTo(null);
    }
    
}
