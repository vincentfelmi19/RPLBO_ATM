package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Sukses2 {

    @FXML
    void selesaiTransaksi(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasistruk.fxml");
    }

    @FXML
    void lanjutTransaksi(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

}
