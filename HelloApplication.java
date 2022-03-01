package com.example.stabmeintheface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        /*
        FileInputStream obr = new FileInputStream("Z:\\kakyoin.jpeg");
        Image img = new Image(obr);
        ImageView view = new ImageView(img);

        StackPane p = new StackPane(view);
        Scene scene = new Scene(p,200,100);
        */

        stage.setTitle("milf");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}