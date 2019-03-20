package sample;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class WIndowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CalcButton;

    @FXML
    private TextField Input1;

    @FXML
    private TextField N1ToN2;

    @FXML
    private TextField N3ToN4;

    @FXML
    private TextField N1ToN3;

    @FXML
    private TextField N2ToN4;

    @FXML
    private TextField Output2;

    @FXML
    private TextField Input2;

    @FXML
    private AnchorPane Pane;

    @FXML
    void Calculate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert CalcButton != null : "fx:id=\"CalcButton\" was not injected: check your FXML file 'Window.fxml'.";
        assert Input1 != null : "fx:id=\"Input1\" was not injected: check your FXML file 'Window.fxml'.";
        assert N1ToN2 != null : "fx:id=\"N1ToN2\" was not injected: check your FXML file 'Window.fxml'.";
        assert N3ToN4 != null : "fx:id=\"N3ToN4\" was not injected: check your FXML file 'Window.fxml'.";
        assert N1ToN3 != null : "fx:id=\"N1ToN3\" was not injected: check your FXML file 'Window.fxml'.";
        assert N2ToN4 != null : "fx:id=\"N2ToN4\" was not injected: check your FXML file 'Window.fxml'.";
        assert Output2 != null : "fx:id=\"Output2\" was not injected: check your FXML file 'Window.fxml'.";
        assert Input2 != null : "fx:id=\"Input2\" was not injected: check your FXML file 'Window.fxml'.";
        assert Pane != null : "fx:id=\"Pane\" was not injected: check your FXML file 'Window.fxml'.";

    }
}
