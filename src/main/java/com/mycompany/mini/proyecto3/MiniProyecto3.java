/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini.proyecto3;

import view.*;
import controller.principalController.PrincipalController;


/**
 *
 * @author El Rey
 */
public class MiniProyecto3 {

    public static void main(String[] args) {
        
        PrincipalView principalView = new PrincipalView();
        AddItemView addItemView = new AddItemView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView){};
        principalController.startPrincipalView();
        
        
    }
        
}
