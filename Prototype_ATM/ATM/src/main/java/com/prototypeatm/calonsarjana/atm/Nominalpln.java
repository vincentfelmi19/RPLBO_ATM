package com.prototypeatm.calonsarjana.atm;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Nominalpln {

    @FXML
    void cancelNominalToken(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void nominal1(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasitoken.fxml");
    }

    @FXML
    void nominal2(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasitoken.fxml");
    }

    @FXML
    void nominal3(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasitoken.fxml");
    }

    @FXML
    void nominal4(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("konfirmasitoken.fxml");
    }

}
