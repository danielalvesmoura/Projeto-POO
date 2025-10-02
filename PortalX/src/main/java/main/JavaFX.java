package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFX extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        stage.setTitle("Portal X");
        menuInicial();
        stage.show();
    }

    private void menuInicial() {
        Label titulo = new Label("Portal X");
        titulo.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        HBox topBar = new HBox(titulo);
        topBar.setStyle("-fx-background-color: #2c3e50; -fx-padding: 15;");
        topBar.setAlignment(Pos.CENTER_LEFT);

        Button btnCadastro = new Button("Cadastros");
        btnCadastro.setMaxWidth(Double.MAX_VALUE);
        btnCadastro.setOnAction(e -> menuCadastro());

        VBox sideBar = new VBox(10, btnCadastro);
        sideBar.setStyle("-fx-background-color: #ecf0f1; -fx-padding: 10;");
        sideBar.setPrefWidth(150);

        Label mensagem = new Label("Bem-vindo ao sistema!");
        mensagem.setStyle("-fx-font-size: 16px;");
        StackPane centro = new StackPane(mensagem);
        centro.setPadding(new Insets(20));

        BorderPane layout = new BorderPane();
        layout.setTop(topBar);
        layout.setLeft(sideBar);
        layout.setCenter(centro);



        Scene cena = new Scene(layout, 600, 400);
        stage.setScene(cena);
    }

    private void menuCadastro() {
        Label titulo = new Label("Cadastros");
        titulo.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        HBox topBar = new HBox(titulo);
        topBar.setStyle("-fx-background-color: #2c3e50; -fx-padding: 15;");
        topBar.setAlignment(Pos.CENTER_LEFT);

        VBox sideBar = new VBox(10);
        sideBar.setStyle("-fx-background-color: #ecf0f1; -fx-padding: 10;");
        sideBar.setPrefWidth(150);

        Button btnEvento = new Button("Evento");
        Button btnSala = new Button("Sala");
        Button btnPalestrante = new Button("Palestrante");
        Button btnSessao = new Button("Sessão");

        Button btnVoltarInicial = new Button("Voltar");
        btnVoltarInicial.setOnAction(e -> menuInicial());

        for (Button btn : new Button[]{btnEvento, btnSala, btnPalestrante, btnSessao}) {
            btn.setMaxWidth(Double.MAX_VALUE);
        }
        btnVoltarInicial.setMaxWidth(Double.MAX_VALUE);

        btnEvento.setOnAction(e -> mostrarCadastro("Evento"));
        btnSala.setOnAction(e -> mostrarCadastro("Sala"));
        btnPalestrante.setOnAction(e -> mostrarCadastro("Palestrante"));
        btnSessao.setOnAction(e -> mostrarCadastro("Sessão"));

        sideBar.getChildren().addAll(btnEvento, btnSala, btnPalestrante, btnSessao,btnVoltarInicial);

        Label msg = new Label("Escolha uma opção de cadastro.");
        msg.setStyle("-fx-font-size: 16px;");
        StackPane centro = new StackPane(msg);
        centro.setPadding(new Insets(20));

        BorderPane layout = new BorderPane();
        layout.setTop(topBar);
        layout.setLeft(sideBar);
        layout.setCenter(centro);

        stage.setScene(new Scene(layout, 600, 400));
    }

    private void mostrarCadastro(String tipoCadastro) {
        Label titulo = new Label("Cadastro de " + tipoCadastro);
        titulo.setStyle("-fx-font-size: 20px; -fx-text-fill: white;");
        HBox topBar = new HBox(titulo);
        topBar.setStyle("-fx-background-color: #2c3e50; -fx-padding: 15;");
        topBar.setAlignment(Pos.CENTER_LEFT);

        VBox sideBar = new VBox(10);
        sideBar.setStyle("-fx-background-color: #ecf0f1; -fx-padding: 10;");
        sideBar.setPrefWidth(150);

        Button btnVoltar = new Button("Voltar");
        btnVoltar.setMaxWidth(Double.MAX_VALUE);
        btnVoltar.setOnAction(e -> menuCadastro());
        sideBar.getChildren().add(btnVoltar);

        Label label = new Label("Nome do " + tipoCadastro + ":");
        TextField campoNome = new TextField();
        campoNome.setPromptText("Digite o nome");

        Button btnSalvar = new Button("Salvar");
        btnSalvar.setOnAction(e -> System.out.println(tipoCadastro + " salvo: " + campoNome.getText()));

        VBox centro = new VBox(15, label, campoNome, btnSalvar);
        centro.setAlignment(Pos.CENTER_LEFT);
        centro.setPadding(new Insets(20));

        BorderPane layout = new BorderPane();
        layout.setTop(topBar);
        layout.setLeft(sideBar);
        layout.setCenter(centro);

        stage.setScene(new Scene(layout, 600, 400));
    }

}
