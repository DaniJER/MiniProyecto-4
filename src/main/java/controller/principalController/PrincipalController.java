/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.principalController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;

/**
 *
 * @author El Rey
 */
public class PrincipalController implements ActionListener {

    private PrincipalView principalView;
    private AddItemView addItemView;

    public PrincipalController(PrincipalView principalView, AddItemView addItem) {
        
        this.addItemView = addItemView;
        this.principalView = principalView;
        principalView.addItemButton.addActionListener(this);
        principalView.searchItemButton.addActionListener(this);
        
    }
    
    public void startPrincipalView(){
        principalView.setTitle("Modulo de mercado Univalle");
        principalView.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == principalView.addItemButton){
            
            addItemView.setVisible(true);
            addItemView.setLocationRelativeTo(null);
            addItemView.setSize(principalView.getWidth(), principalView.getHeight());
        }
        
        if(e.getSource() == addItemView.backButton){
            
            principalView.setVisible(true);
        }
        
        
    }
    
}
