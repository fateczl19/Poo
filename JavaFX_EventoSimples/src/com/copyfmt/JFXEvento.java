package com.copyfmt;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JFXEvento extends Application {
	private Label lblOla;
	private Pane root;
	class Manipulador implements EventHandler<MouseEvent> {
		public void handle(MouseEvent e) {
			System.exit(0);
		} 
	}
	public void start(Stage stage) throws Exception {	
		Manipulador man = new Manipulador();
		root = new Pane();
		Scene scene = new Scene(root, 300, 150);
		lblOla = new Label("Ola mundo");
		lblOla.relocate(100, 50);
		Button btnSair = new Button("Sair");
		btnSair.relocate(100, 80);
		btnSair.addEventFilter(MouseEvent.MOUSE_CLICKED, man);
		root.getChildren().addAll(lblOla, btnSair);
		stage.setScene(scene);
		stage.setTitle("Teste de System.exit(0)");
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
