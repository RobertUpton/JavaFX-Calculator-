package ch15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {

	private Button Addition = new Button("+");
	private Button Subtraction = new Button("- ");
	private Button Multiplication = new Button("*");
	private Button Division = new Button("/ ");

	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();

	private Button calculate = new Button("Calculate");

	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();

		// creating UI for the calculator
		pane.setVgap(5);
		pane.setHgap(15);
		pane.add(new Label("Enter First Number"), 0, 0);
		pane.add(tf1, 1, 0);
		pane.add(new Label("Enter Second Number"), 0, 1);
		pane.add(tf2, 1, 1);
		pane.add(new Label("Result"), 0, 2);
		pane.add(tf3, 1, 2);
		pane.add(Addition, 0, 3);
		pane.add(Subtraction, 1, 3);
		pane.add(Multiplication, 0, 4);
		pane.add(Division, 1, 4);

		// UI properties applying for the calculator
		pane.setAlignment(Pos.CENTER);
		tf1.setAlignment(Pos.BOTTOM_RIGHT);
		tf2.setAlignment(Pos.BOTTOM_RIGHT);
		tf3.setAlignment(Pos.BOTTOM_RIGHT);
		tf3.setEditable(false);
		Addition.setPrefWidth(25);
		Subtraction.setPrefWidth(25);
		Multiplication.setPrefWidth(25);
		Division.setPrefWidth(25);

		pane.setHalignment(Addition, HPos.CENTER);
		pane.setHalignment(Subtraction, HPos.CENTER);
		pane.setHalignment(Multiplication, HPos.CENTER);
		pane.setHalignment(Division, HPos.CENTER);

		pane.setPadding(new Insets(10, 20, 20, 20));

		// buttons
		Addition.setOnAction(e -> Add());
		Subtraction.setOnAction(e -> Subtract());
		Multiplication.setOnAction(e -> Multiply());
		Division.setOnAction(e -> Divide());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void Add() {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		double result = num1 + num2;
		tf3.setText(String.valueOf(result));

	}

	private void Subtract() {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		double result = num1 - num2;
		tf3.setText(String.valueOf(result));

	}

	private void Multiply() {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		double result = num1 * num2;
		tf3.setText(String.valueOf(result));

	}

	private void Divide() {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		double result = num1 / num2;
		tf3.setText(String.valueOf(result));

	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
