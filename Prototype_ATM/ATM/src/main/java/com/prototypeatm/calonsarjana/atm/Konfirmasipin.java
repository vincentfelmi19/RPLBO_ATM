package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class Konfirmasipin {

    @FXML
    private PasswordField pin;

    @FXML
    void batal(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hapusPin(ActionEvent event) {
        pin.setText("");
    }

    @FXML
    void pinSimpan(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasinostruk.fxml");
    }
}
