package src;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tut21_MakingMenus extends Application {
    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston");

        Menu fileMenu = new Menu("_File");
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(event -> System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);

        fileMenu.getItems().add(new MenuItem("Open"));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit"));

        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));

        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(event -> System.out.println("Pasting some crap"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLinea = new CheckMenuItem("Show Line Numbers");
        showLinea.setOnAction(event -> {
            if(showLinea.isSelected())
                System.out.println("Program will now dispay line numbers");
            else
                System.out.println("Edikflsdj;fa line number");
        });

        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);

        helpMenu.getItems().addAll(showLinea, autoSave);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
