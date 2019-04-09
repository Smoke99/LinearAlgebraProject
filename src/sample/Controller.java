package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    private Button CalcButton;

    @FXML
    private TextField IP2;

    @FXML
    private TextField IP1;

    @FXML
    private TextField IP4;

    @FXML
    private TextField IP3;

    @FXML
    private TextField Result;

    @FXML
    void stripIP(ActionEvent event)
    {
        String ipone = IP1.getText();
        char[] IPOne = ipone.toCharArray();
        System.out.println(ipone);

        String iptwo = IP2.getText();
        char[] IPTwo = iptwo.toCharArray();
        System.out.println(iptwo);

        String ipthree = IP3.getText();
        char[] IPThree = ipthree.toCharArray();

        String ipfour = IP4.getText();
        char[] IPFour = ipfour.toCharArray();

        String s = ipone + " " + iptwo;

        PrintText(s);
    }

    void PrintText(String s)
    {
        Result.setText(s);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}
