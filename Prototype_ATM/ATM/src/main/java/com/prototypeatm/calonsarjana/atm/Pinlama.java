package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class Pinlama {

    @FXML
    private PasswordField pinlama;

    @FXML
    void batal(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hapusPin(ActionEvent event) {
        pinlama.setText("");
    }

    @FXML
    void pinBaru(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("gantipin.fxml");
    }

}