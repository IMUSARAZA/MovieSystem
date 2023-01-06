package com.example.moviesystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Confirm {

    Stage primaryStage;
    Scene paymentScene;

    ArrayList<Integer> arrSeatno = new ArrayList<Integer>();


    public Confirm(Stage primaryStage, Scene paymentScene) {
            this.primaryStage=primaryStage;
            this.paymentScene=paymentScene;
    }

    public Confirm(ArrayList<Integer> arrSeatno) {
        this.arrSeatno = arrSeatno;
        System.out.println("Array"+arrSeatno);
    }

    public void start(){

        AnchorPane confirmLayout = new AnchorPane();

        confirmLayout.setPadding(new Insets(10,10,10,10));

        Image img1 = new Image(getClass().getResourceAsStream("Booked.png"));

        ImageView imageView1 = new ImageView(img1);

        imageView1.setFitHeight(700);
        imageView1.setFitWidth(1280);




        System.out.println(SeatSelection.arrSeatno.size());
        System.out.println(String.valueOf(SeatSelection.arrSeatno.get(0)));

        String a = (String)String.valueOf(SeatSelection.arrSeatno.get(0));
            String b = (String)String.valueOf(SeatSelection.arrSeatno.get(1));
            String c = (String)String.valueOf(SeatSelection.arrSeatno.get(2));
            String d = (String)String.valueOf(SeatSelection.arrSeatno.get(3));
            String e = (String)String.valueOf(SeatSelection.arrSeatno.get(4));


        Text text1 = new Text();
        text1.setText(a);
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(620);
        text1.setY(410);

        Text text2 = new Text();
        text2.setText(b);
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text2.setFill(Color.WHITE);
        text2.setX(650);
        text2.setY(410);

        Text text3 = new Text();
        text3.setText(c);
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text3.setFill(Color.WHITE);
        text3.setX(680);
        text3.setY(410);

        Text text4 = new Text();
        text4.setText(d);
        text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text4.setFill(Color.WHITE);
        text4.setX(710);
        text4.setY(410);

        Text text5 = new Text();
        text5.setText(e);
        text5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text5.setFill(Color.WHITE);
        text5.setX(740);
        text5.setY(410);

        confirmLayout.getChildren().add(imageView1);
        confirmLayout.getChildren().add(text1);
        confirmLayout.getChildren().add(text2);
        confirmLayout.getChildren().add(text3);
        confirmLayout.getChildren().add(text4);
        confirmLayout.getChildren().add(text5);


        Scene confirmScene = new Scene(confirmLayout,1300,1000);

        primaryStage.setScene(confirmScene);
        primaryStage.setMaximized(true);
        primaryStage.show();
        confirmLayout.requestFocus();




    }

}
