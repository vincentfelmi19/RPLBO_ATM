package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Infosaldo {

    @FXML
    void Tidak(ActionEvent event) throws IOException {
        Main mainmenu = new Main();
        mainmenu.pindah("konfirmasinostruk.fxml");
    }

    @FXML
    void Ya(ActionEvent event) throws IOException {
        Main mainmenu = new Main();
        mainmenu.pindah("loginmenu.fxml");
    }

}
