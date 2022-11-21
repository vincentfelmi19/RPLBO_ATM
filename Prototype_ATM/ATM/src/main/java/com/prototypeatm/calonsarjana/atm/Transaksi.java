package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Transaksi {

    @FXML
    private TextField nominal;

    @FXML
    void batalTarik(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hapusKolom(ActionEvent event) {
        nominal.setText("");
    }
    @FXML
    void lanjutTarik(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("struk.fxml");
    }

    @FXML
    void cancelMenuPembayaran(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void hp(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("hp.fxml");
    }

    @FXML
    void pln(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("token.fxml");
    }
}
