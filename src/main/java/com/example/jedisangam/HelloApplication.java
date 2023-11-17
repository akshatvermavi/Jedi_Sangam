package com.example.jedisangam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Parent root;

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        //FXMLLoader fxmlLoader = new FXMLLoader();
//        Scene scene = new Scene(fxmlLoader.load(), 245, 250);
//        Parent root = fxmlLoader.load(getClass().getResource("project.fxml"));
//        stage.setTitle("Hello!");
//        stage.setScene(new Scene(root, 612,444));
//        stage.show();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}