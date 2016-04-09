import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tut14_ComboBox extends Application {
    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click Me");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good will Hunting",
                "St. Vincent",
                "Blackhat"
        );
        comboBox.setPromptText("What is you favourite movie");

        comboBox.setEditable(true);

        button.setOnAction(event -> printMovie());

        comboBox.setOnAction(event ->
                System.out.println("User selected: " + comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void printMovie(){
        System.out.println(comboBox.getValue());
    }

}
