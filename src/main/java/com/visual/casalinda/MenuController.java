package com.visual.casalinda;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static com.visual.casalinda.Product.*;

public class MenuController {


    @FXML
    public Button button;
    @FXML
    public TextField productName;
    @FXML
    public TextField productCode;
    @FXML
    public TextField productDescription;
    @FXML
    public TextField productQuantity;
    @FXML
    public TextField productCategory;

    private Product productClas;

    public void cadatraProduto(){
        System.out.print(productName);
        new Product(productName.getText(), productCode.getText(),productDescription.getText(),
                productQuantity.getText(),productCategory.getText());
        printProduct();
    }

    public void printProduct(){

        for(Product p : productList)
        {
            if(p.getId().equals("eee")) {
                p.setQuantity(2);
                System.out.println(p);
            }


        }



    }
}
