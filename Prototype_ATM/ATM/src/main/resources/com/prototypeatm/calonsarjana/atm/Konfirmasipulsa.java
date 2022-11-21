package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Konfirmasipulsa extends Pulsa{

    @FXML
    private TextField nominal = getNominal();

    @FXML
    void Batal(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("loginmenu.fxml");
    }

    @FXML
    void Lanjut(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("sukses2.fxml");
    }

}
