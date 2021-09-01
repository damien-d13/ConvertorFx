package fr.damien;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;

import fr.damien.utils.CalculConvertor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label convertedValue;

    @FXML
    private Label currencyUp;

    @FXML
    private Label currencyDown;

    @FXML
    private TextField valueToConvert;

    @FXML
    private ComboBox<Currency> currencyToConvert;

    @FXML
    private ComboBox<Currency> yourCurrency;


    @FXML
    private Button clear;

    @FXML
    private Button convert;
    
    @FXML
    private void onConvertAction(ActionEvent event) {
        Currency inputLeft = currencyToConvert.getValue();
        Currency inputRight = yourCurrency.getValue();
 
         if(!valueToConvert.getText().isEmpty()){
            double inputNum = Double.parseDouble(valueToConvert.getText().replace(",", "."));
         
            convertedValue.setText(CalculConvertor.calculCurrency(inputLeft, inputRight, inputNum));
            currencyUp.setText(inputLeft.getSymbol());
            currencyDown.setText(inputRight.getSymbol());
        }
        
    }

    @FXML
    private void onClearAction(ActionEvent event) {
        convertedValue.setText("");
        valueToConvert.setText("");
        currencyUp.setText("");
        currencyDown.setText("");

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        currencyToConvert.getItems().setAll(Currency.values());
        yourCurrency.getItems().setAll(Currency.values());
        currencyToConvert.getSelectionModel().selectFirst();
        yourCurrency.getSelectionModel().selectFirst();
    }    
}
