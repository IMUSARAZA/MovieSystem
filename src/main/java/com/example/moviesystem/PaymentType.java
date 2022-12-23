package com.example.moviesystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PaymentType {

    Stage primaryStage;
    Scene receiptScene;


    public PaymentType(Stage primaryStage, Scene receiptScene) {
        this.primaryStage=primaryStage;
        this.receiptScene=receiptScene;
    }

    public void start(){


        AnchorPane paymentLayout = new AnchorPane();

        paymentLayout.setPadding(new Insets(10,10,10,10));

        paymentLayout.setStyle("-fx-background-color: Black");


        Image img = new Image(getClass().getResourceAsStream("logo.png"));

        ImageView imageView = new ImageView(img);
        imageView.setX(260);
        imageView.setY(1);
        imageView.setFitWidth(700);
        imageView.setFitHeight(350);


        Label label1 = new Label();
        label1.setText("Add Your Card Details");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(50);
        label1.setLayoutY(200);

        Image img1 = new Image(getClass().getResourceAsStream("mastercard.png"));

        ImageView imageView1 = new ImageView(img1);
        imageView1.setX(300);
        imageView1.setY(300);
        imageView1.setFitWidth(110);
        imageView1.setFitHeight(70);

        Image img2 = new Image(getClass().getResourceAsStream("visa.png"));

        ImageView imageView2 = new ImageView(img2);
        imageView2.setX(420);
        imageView2.setY(300);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(50);

        Image img3 = new Image(getClass().getResourceAsStream("paypal.png"));

        ImageView imageView3 = new ImageView(img3);
        imageView3.setX(540);
        imageView3.setY(300);
        imageView3.setFitWidth(120);
        imageView3.setFitHeight(50);

        Image img4 = new Image(getClass().getResourceAsStream("apple.png"));

        ImageView imageView4 = new ImageView(img4);
        imageView4.setX(678);
        imageView4.setY(285);
        imageView4.setFitWidth(100);
        imageView4.setFitHeight(80);


        Image img5 = new Image(getClass().getResourceAsStream("discover.png"));

        ImageView imageView5 = new ImageView(img5);
        imageView5.setX(800);
        imageView5.setY(290);
        imageView5.setFitWidth(130);
        imageView5.setFitHeight(70);

        TextField text1 = new TextField();
        text1.setPromptText("Card Number");
        text1.setPrefWidth(300);
        text1.setPrefHeight(30);
        text1.setLayoutX(300);
        text1.setLayoutY(400);

        TextField text2 = new TextField();
        text2.setPromptText("MM");
        text2.setPrefWidth(70);
        text2.setPrefHeight(30);
        text2.setLayoutX(300);
        text2.setLayoutY(450);

        TextField text3 = new TextField();
        text3.setPromptText("YY");
        text3.setPrefWidth(70);
        text3.setPrefHeight(30);
        text3.setLayoutX(300);
        text3.setLayoutY(500);

        TextField text4 = new TextField();
        text4.setPromptText("CVV");
        text4.setPrefWidth(70);
        text4.setPrefHeight(30);
        text4.setLayoutX(300);
        text4.setLayoutY(550);


        Button paybutton1 = new Button("PAY");
        paybutton1.setLayoutX(300);
        paybutton1.setLayoutY(595);
        paybutton1.setTextFill(Color.WHITE);
        paybutton1.setStyle("-fx-background-color: Red");
        paybutton1.setPrefWidth(100);
        paybutton1.setPrefHeight(40);

        Button backbutton1 = new Button("CANCEL");
        backbutton1.setLayoutX(407);
        backbutton1.setLayoutY(595);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        paymentLayout.getChildren().add(label1);
        paymentLayout.getChildren().add(imageView);
        paymentLayout.getChildren().add(imageView1);
        paymentLayout.getChildren().add(imageView2);
        paymentLayout.getChildren().add(imageView3);
        paymentLayout.getChildren().add(imageView4);
        paymentLayout.getChildren().add(imageView5);
        paymentLayout.getChildren().add(text1);
        paymentLayout.getChildren().add(text2);
        paymentLayout.getChildren().add(text3);
        paymentLayout.getChildren().add(text4);
        paymentLayout.getChildren().add(paybutton1);
        paymentLayout.getChildren().add(backbutton1);

        Scene paymentScene = new Scene(paymentLayout,1300,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(receiptScene);
            }
        });
        ArrayList<Integer> arrSeatno = null;
        paybutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Confirm cbj = new Confirm(primaryStage,paymentScene);
                cbj.start();
            }
        });


        primaryStage.setScene(paymentScene);
        paymentLayout.requestFocus();
        primaryStage.setMaximized(true);
        primaryStage.show();




    }




}
