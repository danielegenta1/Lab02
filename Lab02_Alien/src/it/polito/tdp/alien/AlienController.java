package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    //
	private AlienModel model;
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
    
    public void setModel(AlienModel model) 
	{
		this.model = model;
	}
    
    @FXML
    void doTranslate(ActionEvent event) 
    {
    	String stringaInserita = txtWord.getText();
    	String result = model.doTranslate(stringaInserita);
    	
    	//inserimento nuova parola
    	//traduzione
    	txtResult.appendText(result);
    	
    	//op. comuni
    	txtWord.clear();
    	    	
    }
    
    @FXML
    void doReset(ActionEvent event) 
    {
    	txtResult.clear();
    }
    
}
