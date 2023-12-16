/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562
    
*/

package main;
import controller.clientsController.*;
import controller.dealersController.*;
import controller.principalController.PrincipalController;
import controller.productsController.*;
import model.DealersModel.*;
import model.clientesModel.*;
import model.productsModel.*;
import view.*;
import view.clients.*;
import view.dealers.*;
import view.products.*;
import controller.sellController.SellController;
import model.sellModel.SellModel;

import view.sell.*;
import model.buyModel. *;
import view.buy. *;
import controller.buyController. *;
import model.backUp.BackUpModel;

/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        
        principalView principalView = new principalView();
        addItemView addItemView = new addItemView();
        searchItemView searchItemView = new searchItemView();
        updateItemView updateItemView = new updateItemView();
        deleteItemView deleteItemView = new deleteItemView();

        createClientView createClientView = new createClientView();
        createDealerView createDealerView = new createDealerView();
        addProductView addProductView = new addProductView();
        readClientView readClientView = new readClientView();
        readDealerView readDealerView = new readDealerView();
        readProductView readProductView = new readProductView();
        ReadDealerModel readDealerModel = new ReadDealerModel();
        showClientsView showClientsView = new showClientsView();
        showDealersView showDealerView = new showDealersView();
        showClientsRemoved showClientsRemoved = new showClientsRemoved();
        CreateProductsModel createProductsModel = new CreateProductsModel();
        
        updateClientView updateClientView = new updateClientView();
        updateDealerView updateDealerView = new updateDealerView();
        updateProductView updateProductView = new updateProductView();
        deleteClientView deleteClientView = new deleteClientView();
        deleteDealerView deleteDealerView = new deleteDealerView();
        deleteProductView deleteProductView = new deleteProductView();
        CreateClientModel createClientModel = new CreateClientModel();
        ReadClientModel readClientModel = new ReadClientModel();
        CreateDealerModel createDealerModel = new CreateDealerModel();
        UpdateClientModel updateClientModel = new UpdateClientModel();
        DeleteClientModel deleteClientModel = new DeleteClientModel();
        
        DeleteDealerModel deleteDealerModel = new DeleteDealerModel();
        ReadProductsModel readProductsModel = new ReadProductsModel();
        showProductsView showProductsView = new showProductsView();
        searchAndBuyProductView searchProductView = new searchAndBuyProductView();
        SellModel sellModel = new SellModel();
        searchClientToBuy searchAndBuyClient = new searchClientToBuy();
        UpdateProductsModel updateProductsmodel = new UpdateProductsModel();
        UpdateDealerModel updateDealerModel = new UpdateDealerModel();
        DeleteProductsModel deleteProductsModel = new DeleteProductsModel();
        BackUpModel backUpModel = new BackUpModel();
        
        BuyModel buyModel = new BuyModel();
        buyView buyView = new buyView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView, backUpModel){};
        principalController.startPrincipalView();
        

        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView, updateClientModel);
        
        UpdateDealersController updateDealersController = new UpdateDealersController(updateItemView, updateDealerView, updateDealerModel);
        
        UpdateProductsController updateProductsController = new UpdateProductsController(updateItemView, updateProductView,updateProductsmodel);
        
        DeleteClientController deleteClientController = new DeleteClientController(deleteItemView, deleteClientView, deleteClientModel, showClientsRemoved, principalView );
        
        DeleteDealersController deleteDealersController = new DeleteDealersController(deleteItemView, deleteDealerView, deleteDealerModel);
        
        DeleteProductsController deleteProductsController = new DeleteProductsController(deleteItemView, deleteProductView, deleteProductsModel);

        CreateClientController createClientController = new CreateClientController(addItemView, createClientView, createClientModel, principalView){};
    
        CreateDealersController createDealersController = new CreateDealersController(addItemView,createDealerView, createDealerModel, principalView){};
    
        CreateProductsController createProductsController = new CreateProductsController(addItemView,addProductView, createProductsModel, principalView){};
    
        ReadClientController readClientController = new ReadClientController(searchItemView, readClientView, readClientModel, showClientsView, principalView, createClientModel, searchProductView){};
    
        ReadDealersController readDealerController = new ReadDealersController(searchItemView, readDealerView, showDealerView, readDealerModel, principalView){};
    
        ReadProductsController readProductController = new ReadProductsController(searchItemView, readProductView, readProductsModel, showProductsView, principalView);
    
        SellController sellController = new SellController(searchProductView, sellModel, principalView, searchAndBuyClient);
        
        BuyController buyController = new BuyController(principalView, buyView, buyModel);
    }
        
}
