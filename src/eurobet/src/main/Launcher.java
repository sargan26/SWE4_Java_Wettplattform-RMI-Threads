package src.main;

import java.util.logging.LogManager;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Launcher.primaryStage = primaryStage;
        showLoginScene();
    }

    public static void showLoginScene() throws Exception {
        //Parent root = FXMLLoader.load(Launcher.class.getResource("/login.fxml"));
        Parent root = FXMLLoader.load(Launcher.class.getResource("/verwaltung.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showVerwaltungScene() throws Exception {
        Parent root = FXMLLoader.load(Launcher.class.getResource("/verwaltung.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    public static void showWettanwendungScene() throws Exception {
        Parent root = FXMLLoader.load(Launcher.class.getResource("/wettanwendung.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    /*
    @Override
    public void start (Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/wettanwendung.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle ("Eurobet");
        stage.setScene (scene);
        stage.show ();
    }
    */

    public static void main (String[] args) {
        try {
            LogManager.getLogManager ().reset ();   // turn off JDK logging
            launch (args);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
