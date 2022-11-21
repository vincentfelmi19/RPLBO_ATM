package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import java.io.IOException;
import java.util.Objects;

public class Login {
    @FXML
    private Button btnhapus;

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField pin;

    @FXML
    void hapusPin(ActionEvent event) {
        pin.setText("");
    }

    @FXML
    void loginNasabah(ActionEvent event) throws IOException {
        if(!Objects.equals(pin.getText(), "") || pin.getText() != null){
            Main mainMenu = new Main();
            mainMenu.pindah("mainmenu.fxml");
        }
    }

}
