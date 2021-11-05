package com.example.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    public TextArea messageArea;
    public TextField textField;

    public void clickButton(ActionEvent actionEvent) {
        final String message = textField.getText();
        messageArea.appendText(message+ "\n");
        textField.setText("");
    }

    public void clickEnter(ActionEvent actionEvent) {
        final String message = textField.getText();
        messageArea.appendText(message+ "\n");
        textField.setText("");
    }
}