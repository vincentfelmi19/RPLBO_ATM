package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Sukses1 {

    @FXML
    void selesaiTransaksi(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasinostruk.fxml");
    }

    @FXML
    void lanjutTransaksi(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

}
