package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Clique aqui!");

        button.setOnAction(e -> System.out.println("Você clicou no botão!"));

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Minha Primeira Janela JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
