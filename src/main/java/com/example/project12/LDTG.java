package com.example.project12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class LDTG extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        Image icon = new Image("file:icon.png");
        stage.getIcons().add(icon);

        stage.setTitle("Local Distance and Travel Guide");
        stage.setScene(new Scene(root));

        //Set stage dimensions
        stage.setMinWidth(640);
        stage.setMinHeight(480);

        //Default to fullscreen
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press [ALT] + [Q] to exit fullscreen");
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("ALT+Q"));

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}