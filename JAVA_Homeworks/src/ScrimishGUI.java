import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import java.util.Collections;

public class ScrimishGUI extends Application{

	
		private TextField addCardTx = new TextField();
		private TextField attackTx = new TextField();
		private TextField discardTx = new TextField();
		private TextField AIpileTx = new TextField();
		private TextField playerPileTx = new TextField();

		public void start(Stage primaryStage) {
			// Create UI
			Pane pane = new Pane();
			
			
			//ai heading
			Text setup = new Text(500, 50, "Setup");
			pane.getChildren().add(setup);
			setup.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			
			//player 1 heading
			Text gamePlay = new Text(500, 300, "GamePlay");
			pane.getChildren().add(gamePlay);
			gamePlay.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			
			
			
			
			
			//Ai card status
			
			Text AIstat = new Text(100, 100, "AI Pile");
			pane.getChildren().add(AIstat);
			AIstat.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			
			
			//Ai card status
			
			Text playerStat = new Text(100, 400, "Player Pile");
			pane.getChildren().add(playerStat);
			playerStat.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			
			
			//adding buttons

			Button addCardBt = new Button("Add Card");
			pane.getChildren().add(addCardBt);
			addCardBt.setTranslateX(400);
			addCardBt.setTranslateY(100);
			
			
			Button attackBt = new Button("Attack");
			pane.getChildren().add(attackBt);
			attackBt.setTranslateX(400);
			attackBt.setTranslateY(350);
			
			
			Button discardBt = new Button("Discard");
			pane.getChildren().add(discardBt);
			discardBt.setTranslateX(400);
			discardBt.setTranslateY(400);
			
			
			
			//adding text fields
			pane.getChildren().add(addCardTx);
			addCardTx.setTranslateX(500);
			addCardTx.setTranslateY(100);
			
			
			pane.getChildren().add(attackTx);
			attackTx.setTranslateX(500);
			attackTx.setTranslateY(350);
			
			pane.getChildren().add(discardTx);
			discardTx.setTranslateX(500);
			discardTx.setTranslateY(400);
			
			
			
			pane.getChildren().add(AIpileTx);
			AIpileTx.setTranslateX(50);
			AIpileTx.setTranslateY(200);
			
			pane.getChildren().add(playerPileTx);
			playerPileTx.setTranslateX(50);
			playerPileTx.setTranslateY(500);
			
			
			
			
			//adding radio buttons
			BorderPane pane1 = new BorderPane();
			VBox paneForRadioButtons = new VBox(20);
			//paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
			paneForRadioButtons.setStyle("-fx-border-color: green");
			RadioButton rbRed = new RadioButton("Red");
			RadioButton rbGreen = new RadioButton("Green");
			RadioButton rbBlue = new RadioButton("Blue");
			paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
			//pane.setOnSwipeLeft(paneForRadioButtons);
			ToggleGroup group = new ToggleGroup();
			rbRed.setToggleGroup(group);
			rbGreen.setToggleGroup(group);
			rbBlue.setToggleGroup(group);
			
			
			//pane.getChildren().addAll(rb1,rb2,rb3);
			Scene scene = new Scene(pane, 1000, 1000);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
	
		
		public static void main(String[] args) {
				launch(args);
			}
			
		
		
		
	}
