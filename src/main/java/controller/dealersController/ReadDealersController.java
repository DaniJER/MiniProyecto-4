/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.dealers.readDealerView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadDealersController implements ActionListener {

    private searchItemView searchItemView;
    private readDealerView readDealerView;

    public ReadDealersController(searchItemView searchItemView, readDealerView readDealerView) {
        this.searchItemView = searchItemView;
        this.readDealerView = readDealerView;
        
        searchItemView.searchDealerButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        searchItemView.dispose();
        readDealerView.setVisible(true);
        readDealerView.setLocationRelativeTo(null);
        
    }
    
}
