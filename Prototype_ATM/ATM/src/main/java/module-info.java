module com.prototypeatm.calonsarjana.atm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.prototypeatm.calonsarjana.atm to javafx.fxml;
    exports com.prototypeatm.calonsarjana.atm;
}