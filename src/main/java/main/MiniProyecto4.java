/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.clientsController.CreateClientController;
import controller.clientsController.ReadClientController;
import controller.dealersController.CreateDealersController;
import controller.dealersController.ReadDealersController;
import controller.principalController.PrincipalController;
import controller.productsController.CreateProductsController;
import controller.productsController.ReadProductsController;
import view.*;
import view.clients.*;
import view.dealers.*;
import view.products.*;


/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        
        principalView principalView = new principalView();
        addItemView addItemView = new addItemView();
        searchItemView searchItemView = new searchItemView();
        createClientView createClientView = new createClientView();
        createDealerView createDealerView = new createDealerView();
        addProductView addProductView = new addProductView();
        readClientView readClientView = new readClientView();
        readDealerView readDealerView = new readDealerView();
        readProductView readProductView = new readProductView();
        
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView){};
        principalController.startPrincipalView();
        
        CreateClientController createClientController = new CreateClientController(addItemView,createClientView){};
    
        CreateDealersController createDealersController = new CreateDealersController(addItemView,createDealerView){};
    
        CreateProductsController createProductsController = new CreateProductsController(addItemView,addProductView){};
    
        ReadClientController readClientController = new ReadClientController(searchItemView, readClientView){};
    
        ReadDealersController readDealerController = new ReadDealersController(searchItemView,readDealerView ){};
    
        ReadProductsController readProductController = new ReadProductsController(searchItemView, readProductView);
    
    
    }
        
}
