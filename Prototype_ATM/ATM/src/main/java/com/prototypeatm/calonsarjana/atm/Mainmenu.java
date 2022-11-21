package com.prototypeatm.calonsarjana.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Mainmenu {

    @FXML
    private Button btngantipin;

    @FXML
    private Button btninfosaldo;

    @FXML
    private Button btnpembayaran;

    @FXML
    private Button btntariktunai;

    @FXML
    private Button btntransfer;

    @FXML
    void Transfer(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("menutransfer.fxml");
    }

    @FXML
    void gantiPin(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("pinlama.fxml");
    }

    @FXML
    void infoSaldo(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("infosaldo.fxml");
    }

    @FXML
    void pembayaran(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("menupembayaran.fxml");
    }

    @FXML
    void tarikTunai(ActionEvent event) throws IOException {
        Main mainMenu = new Main();
        mainMenu.pindah("tariktunai.fxml");
    }

}
