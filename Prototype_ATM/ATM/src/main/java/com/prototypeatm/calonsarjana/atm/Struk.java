package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Struk {

    @FXML
    void cetakStruk(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("sukses2.fxml");
    }

    @FXML
    void tanpaStruk(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("sukses1.fxml");
    }

}
