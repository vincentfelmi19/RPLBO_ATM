package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pulsa extends Nomortelp{

    @FXML
    private TextField nominal;

    @FXML
    void Batal(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hapusKolom(ActionEvent event) {
        nominal.setText("");
    }

    @FXML
    void Lanjut(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasipulsa.fxml");
    }

    public TextField getNominal() {
        return nominal;
    }
}
