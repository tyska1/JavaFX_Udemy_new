package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello World");
//            }
//        });
        exit.setOnAction(actionEvent -> {
            System.out.println("Application about to close");
            System.exit(0);
        });
        btn.setOnAction(actionEvent -> System.out.println("Hello World"));
        //StackPane root = new StackPane();
        VBox root = new VBox();
        //root.getChildren().add(btn); //jeden
        root.getChildren().addAll(btn,exit);
        Scene scene = new Scene(root, 300, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}