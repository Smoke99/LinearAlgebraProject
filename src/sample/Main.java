package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        Platform.setImplicitExit(false);

        Matrix.main(1,1,0,100,1,0,0,100,0,0,1,100,0,-1,1,100);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
