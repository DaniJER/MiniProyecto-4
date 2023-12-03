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
<<<<<<< HEAD
import view.clients. *;
import view.dealers. *;
import view.products. *;
import controller.clientsController. *;
import controller.dealersController. *;
import controller.productsController. *;
=======
import view.clients.*;
import view.dealers.*;
import view.products.*;


>>>>>>> d8c037780703c03d6704da722d3014df98029f05
/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        
        principalView principalView = new principalView();
        addItemView addItemView = new addItemView();
        searchItemView searchItemView = new searchItemView();
<<<<<<< HEAD
        updateItemView updateItemView = new updateItemView();
        deleteItemView deleteItemView = new deleteItemView();
=======
        createClientView createClientView = new createClientView();
        createDealerView createDealerView = new createDealerView();
        addProductView addProductView = new addProductView();
        readClientView readClientView = new readClientView();
        readDealerView readDealerView = new readDealerView();
        readProductView readProductView = new readProductView();
        
>>>>>>> d8c037780703c03d6704da722d3014df98029f05
        
        updateClientView updateClientView = new updateClientView();
        
        updateDealerView updateDealerView = new updateDealerView();
        
        updateProduct updateProductView = new updateProduct();
        
        deleteClientView deleteClientView = new deleteClientView();
        
        deleteDealerView deleteDealerView = new deleteDealerView();
        
        deleteProductView deleteProductView = new deleteProductView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView){};
        principalController.startPrincipalView();
        
<<<<<<< HEAD
        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView);
        
        UpdateDealersController updateDealersController = new UpdateDealersController(updateItemView, updateDealerView);
        
        UpdateProductsController updateProductsController = new UpdateProductsController(updateItemView, updateProductView);
        
        DeleteClientController deleteClientController = new DeleteClientController(deleteItemView, deleteClientView);
        
        DeleteDealersController deleteDealersController = new DeleteDealersController(deleteItemView, deleteDealerView);
        
        DeleteProductsController deleteProductsController = new DeleteProductsController(deleteItemView, deleteProductView);
=======
        CreateClientController createClientController = new CreateClientController(addItemView,createClientView){};
    
        CreateDealersController createDealersController = new CreateDealersController(addItemView,createDealerView){};
    
        CreateProductsController createProductsController = new CreateProductsController(addItemView,addProductView){};
    
        ReadClientController readClientController = new ReadClientController(searchItemView, readClientView){};
    
        ReadDealersController readDealerController = new ReadDealersController(searchItemView,readDealerView ){};
    
        ReadProductsController readProductController = new ReadProductsController(searchItemView, readProductView);
    
    
>>>>>>> d8c037780703c03d6704da722d3014df98029f05
    }
        
}
