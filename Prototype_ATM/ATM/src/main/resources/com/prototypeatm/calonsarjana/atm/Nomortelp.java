package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Nomortelp extends Hp{

    @FXML
    private TextField nomor;

    @FXML
    void batalPulsa(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hapusKolom(ActionEvent event) {
        nomor.setText("");
    }

    @FXML
    void lanjutPulsa(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("pulsa.fxml");
    }

}
