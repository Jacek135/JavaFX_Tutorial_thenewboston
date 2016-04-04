package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        button = new Button();
        button.setText("Click me");
        /*button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am an anonymous Inner Class");
            }
        });*/

        button.setOnAction(event -> {
            System.out.println("hey now brown cow");
            System.out.println("I am a metaball");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }
}
