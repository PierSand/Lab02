package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	private AlienDictionary ad= new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtField;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	txtArea.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String p="";
    	char c=(Character) null;
    	if(txtField.getText().contains(" ")){
        		String alien=txtField.getText().split(" ")[0];
        		String translation=txtField.getText().split(" ")[1];
        		for(int i=0; i<alien.length(); i++){
        			if(Character.isDigit(alien.charAt(i))){
        				txtArea.appendText("Errore numero.");
        				break;
        			}
        		}
        		ad.addWord(alien, translation);
        		txtArea.setText("Aggiunta parola "+alien+" al dizionario\n");
    	}
    	else {
    		if(ad.translateWord(txtField.getText())!=null)
    			p += ad.translateWord(txtField.getText())+"\n";
    			txtArea.appendText("Traduzione: "+p+"\n");
    	}

    }

    @FXML
    void initialize() {
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
