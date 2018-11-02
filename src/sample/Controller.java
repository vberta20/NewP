package sample;

import javafx.scene.control.*;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class Controller {


    //Fields
    public  TextField bottomTextField;
    public ToggleButton button1;
    public ListView  leftListView;
    public ProgressIndicator procIndict;
    public ListView listView;
    ImageView catWithHat;





    public void initialize(){

        System.out.println("Controller initialize");

    }

    void save() {
        System.out.println("Controller save");

    }

    public void button1Clicked() {
    }

    public void bottomTextFieldClear(){
        System.out.println("" + bottomTextField.getText());

        CheckBox newCheckBox = new CheckBox(bottomTextField.getText());
        newCheckBox.setOnAction(e-> {
            // move the checkbox's text to the present list
            listView.getItems().add(newCheckBox.getText());
            // remove checkbox from the leftListView
            leftListView.getItems().remove(newCheckBox);
        });

        leftListView.getItems().add(newCheckBox);
        bottomTextField.setText("");
        bottomTextField.setPromptText("Type here to add to checklist...");
        bottomTextField.getParent().requestFocus();
    }




}









