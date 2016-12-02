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

import java.util.Collections;

public class ScrimishGUI extends Application{

	
		private TextField tfAnnualInterestRate = new TextField();
		private TextField tfNumberOfYears = new TextField();
		private TextField tfLoanAmount = new TextField();
		private TextField tfMonthlyPayment = new TextField();
		private TextField tfTotalPayment = new TextField();
		private Button btCalculate = new Button("Calculate");

		public void start(Stage primaryStage) {
			// Create UI
			Pane pane = new Pane();
			
			
			//ai heading
			Text aiHeading = new Text(500, 50, "AI Pile");
			pane.getChildren().add(aiHeading);
			aiHeading.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			
			//player 1 heading
			Text player = new Text(500, 300, "Player 1");
			pane.getChildren().add(player);
			player.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 15));
			
			//adding images
			//Image image = new Image(getClass().getResourceAsStream("file:mit.jpg"));
			
			//pane.setadd(new ImageView(image));
			//ImageView imageView2 = new ImageView(image); 
			//imageView2.setFitHeight(100); imageView2.setFitWidth(100); 
			//imageView2.setRotate(90); 
			//pane.getChildren().add(imageView2);
			
			//adding buttons

			Button setup = new Button("Setup");
			pane.getChildren().add(setup);
			setup.setTranslateX(0);
			setup.setTranslateY(0);
			
			
			Button play = new Button("Play");
			pane.getChildren().add(play);
			play.setTranslateX(5);
			play.setTranslateY(30);
			
			
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
