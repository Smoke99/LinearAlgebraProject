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
    private TextField Output1;

    @FXML
    private TextField Output2;

    @FXML
    private TextField Input2;

    @FXML
    private AnchorPane Pane;

    @FXML
    void Calculate(ActionEvent event) {
        int I1 = Integer.parseInt(Input1.getText());
        int I2 = Integer.parseInt(Input2.getText());
        int x = Integer.parseInt(N1ToN2.getText());
        int y = Integer.parseInt(N1ToN3.getText());
        int z = Integer.parseInt(N3ToN4.getText());
        int w = Integer.parseInt(N2ToN4.getText());
        int O1 = Integer.parseInt(Output1.getText());
        int O2 = Integer.parseInt(Output2.getText());

        int[][] matrix = new int[4][5];
        matrix[0][0] = 0;
        matrix[0][1] = x;
        matrix[0][2] = y;
        matrix[0][3] = 0;
        matrix[0][4] = I1;

        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = -y;
        matrix[1][3] = z;
        matrix[1][4] = I2;

        matrix[2][0] = -w;
        matrix[2][1] = x;
        matrix[2][2] = 0;
        matrix[2][3] = 0;
        matrix[2][4] = O1;

        matrix[3][0] = w;
        matrix[3][1] = 0;
        matrix[3][2] = 0;
        matrix[3][3] = z;
        matrix[3][4] = O2;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }

    @FXML
    void initialize() {
        assert CalcButton != null : "fx:id=\"CalcButton\" was not injected: check your FXML file 'Window.fxml'.";
        assert Input1 != null : "fx:id=\"Input1\" was not injected: check your FXML file 'Window.fxml'.";
        assert N1ToN2 != null : "fx:id=\"N1ToN2\" was not injected: check your FXML file 'Window.fxml'.";
        assert N3ToN4 != null : "fx:id=\"N3ToN4\" was not injected: check your FXML file 'Window.fxml'.";
        assert N1ToN3 != null : "fx:id=\"N1ToN3\" was not injected: check your FXML file 'Window.fxml'.";
        assert N2ToN4 != null : "fx:id=\"N2ToN4\" was not injected: check your FXML file 'Window.fxml'.";
        assert Output1 != null : "fx:id=\"Output1\" was not injected: check your FXML file 'Window.fxml'.";
        assert Output2 != null : "fx:id=\"Output2\" was not injected: check your FXML file 'Window.fxml'.";
        assert Input2 != null : "fx:id=\"Input2\" was not injected: check your FXML file 'Window.fxml'.";
        assert Pane != null : "fx:id=\"Pane\" was not injected: check your FXML file 'Window.fxml'.";

    }
}
