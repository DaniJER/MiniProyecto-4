/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.principalController.PrincipalController;
import view.*;


/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        principalView principalView = new principalView();
        addItemView addItemView = new addItemView();
        searchItemView searchItemView = new searchItemView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView){};
        principalController.startPrincipalView();
        
        
    }
        
}
