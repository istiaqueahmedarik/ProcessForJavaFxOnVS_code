package com.codebook;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
  public static Scene scene;

  @Override
  public void start(Stage stage) throws IOException {
    // scene = new Scene(loadFXML("forTesting"), 1100, 650);
    scene = new Scene(loadFXML("login"));

    if (LoginValidator.validatePassword()) {
      scene = new Scene(loadFXML("dashboard"));
    }
    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();

    stage.setX(bounds.getMinX());
    stage.setY(bounds.getMinY());
    stage.setWidth(bounds.getWidth());
    stage.setHeight(bounds.getHeight());

    scene
        .getStylesheets()
        .add(getClass().getResource("styles.css").toExternalForm());
    stage.setResizable(false);
    stage.setScene(scene);
    // scene.setResizable(false);
    // stage.setMinWidth(1100);
    // stage.setMinHeight(650);
    // stage.setMaxHeight(650);
    // stage.setMaxWidth(1100);
    stage.show();
  }

  static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
  }

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(
        Main.class.getResource(fxml + ".fxml"));
    return fxmlLoader.load();
  }

  public static void main(String[] args) {
    launch();
  }
}