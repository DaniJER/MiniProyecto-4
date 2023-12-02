/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.clients. *;
/**
 *
 * @author El Rey
 */
public class UpdateClientController implements ActionListener{
    private updateItemView updateItemView;
    private updateClientView updateClientView;
    
    public UpdateClientController(updateItemView updateItemView, updateClientView updateClientView){
        this.updateItemView = updateItemView;
        this.updateClientView = updateClientView;
        
        updateItemView.updateClientButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateItemView.updateClientButton){
            updateItemView.dispose();
            updateClientView.setVisible(true);
            updateClientView.setLocationRelativeTo(null);
        }
    }
}
