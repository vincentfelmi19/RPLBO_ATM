package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Token {

    @FXML
    private TextField nomor;

    @FXML
    void Batal(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void Hapus(ActionEvent event) {
        nomor.setText("");
    }

    @FXML
    void Lanjut(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nominalpln.fxml");
    }

}
