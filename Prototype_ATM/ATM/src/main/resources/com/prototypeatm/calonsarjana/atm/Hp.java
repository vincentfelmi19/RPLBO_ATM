package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Hp {
    private String pulsa;
    @FXML
    void Axis(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nomortelp.fxml");
        this.pulsa = "Axis";
    }

    @FXML
    void Esia(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nomortelp.fxml");
        this.pulsa = "Esia";
    }

    @FXML
    void Fren(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nomortelp.fxml");
        this.pulsa = "Fren";
    }

    @FXML
    void Indosat(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nomortelp.fxml");
        this.pulsa = "Indosat";
    }

    @FXML
    void Telkomsel(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("nomortelp.fxml");
        this.pulsa = "Telkomsel";
    }

    @FXML
    void cancelMenuPulsa(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    public String getPulsa() {
        return pulsa;
    }
}
