package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFx - thenewboston");
//        window.setOnCloseRequest(event1 -> closeProgram1());
        window.setOnCloseRequest(event1 -> {
            event1.consume();
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    private void closeProgram1(){
        System.out.println("File is saved");
        window.close();
    }
    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Title", "Sure you want to exit");
        if (answer)
            window.close();
        System.out.println("File is saved");
        window.close();
    }
}
