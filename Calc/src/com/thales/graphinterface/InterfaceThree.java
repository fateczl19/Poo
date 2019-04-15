package com.thales.graphinterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InterfaceThree extends Application{
	public static void main(String[] args){
		Application.launch(args); 
	}
	@Override 
	public void start(Stage stage) throws Exception { 
		BorderPane panel = new BorderPane(); 
		FlowPane displayPanel = new FlowPane(); 
		GridPane botoes = new GridPane(); 
		 
		displayPanel.setHgap(5); 
	 
		TextField txtDisplay = new TextField(); 
		txtDisplay.setPrefWidth(130); 
		Button btnCE = new Button("CE"); 
		 
		for(int i = 0; i <16; i++) { 
			int row = i / 4; 
			int col = i%4; 
			Button btn = new Button(""+i); 
			botoes.add(btn, col, row); 
			btn.setPrefWidth(40); 
			btn.setPrefHeight(40); 
		} 
		 
		displayPanel.getChildren().addAll(txtDisplay, btnCE); 
		 
		 
		panel.setTop(displayPanel); 
		panel.setCenter(botoes); 
		 
		Scene scn = new Scene(panel); 
		 
		 
		stage.setScene(scn); 
		stage.show(); 
		 
	} 
}