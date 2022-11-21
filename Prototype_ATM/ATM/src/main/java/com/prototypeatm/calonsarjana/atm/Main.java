package com.prototypeatm.calonsarjana.atm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class Main extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader menuLogin = new FXMLLoader(Main.class.getResource("loginmenu.fxml"));
        Scene scene = new Scene(menuLogin.load());
        stg.setScene(scene);
        stg.show();
    }

    public void pindah(String fxml) throws IOException {
        FXMLLoader mainMenu = new FXMLLoader(Main.class.getResource(fxml));
        Scene scene = new Scene(mainMenu.load());
        stg.setScene(scene);
        stg.show();
    }

    public static void main(String[] args) {
        launch();
    }
}