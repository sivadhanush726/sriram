/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 *
 * @author A
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private ComboBox<String> combo;
    @FXML
    private RadioButton Mradio;
    @FXML
    private RadioButton Fradio;
    @FXML
    private RadioButton Oradio;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        String ar[]={"Madurai","Chennai","Ramnadu","Banglore"};
        
        combo.getSelectionModel().select("City");
        for(String obj:ar)
        {
            combo.getItems().add(obj);
        }
    }    

    @FXML
    private void mradioBtn(ActionEvent event) 
    {
        if(Mradio.isSelected())
        {
            
            Fradio.setSelected(false);
            Oradio.setSelected(false);
        }
    }

    @FXML
    private void fradioBtn(ActionEvent event) 
    {
        if(Fradio.isSelected())
        {
            Mradio.setSelected(false);
            Oradio.setSelected(false);
        }
    }

    @FXML
    private void oradioBtn(ActionEvent event) 
    {
        if(Oradio.isSelected())
        {
            Mradio.setSelected(false);
            Fradio.setSelected(false);
        }
    }

    @FXML
    private void submitBtn(ActionEvent event) 
    {
        
        if(Mradio.isSelected())
        {
            System.out.println(Mradio.getText());
        }
        else if(Fradio.isSelected()){System.out.println(Fradio.getText());}
        else if(Oradio.isSelected()){System.out.println(Oradio.getText());}
        
       
        System.out.println(combo.getSelectionModel().getSelectedItem());
    }
    
}
