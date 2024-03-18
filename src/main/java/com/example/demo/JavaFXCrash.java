package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class JavaFXCrash extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane(new Button("Hello World"));
        Scene scene = new Scene(borderPane,550,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
