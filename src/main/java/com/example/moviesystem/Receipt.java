package com.example.moviesystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Receipt {

    Stage primaryStage;
    Scene selectionScene;

    int bookingCounter;

    public Receipt(Stage primaryStage, Scene selectionScene, int bookingCounter) {
        this.primaryStage=primaryStage;
        this.selectionScene=selectionScene;
        this.bookingCounter=bookingCounter;
    }


    public void start(){


        AnchorPane receiptLayout = new AnchorPane();

        receiptLayout.setPadding(new Insets(10,10,10,10));

        Image img1 = new Image(getClass().getResourceAsStream("Order.png"));

        ImageView imageView1 = new ImageView(img1);

        imageView1.setFitHeight(700);
        imageView1.setFitWidth(1280);

        float price;
        String pricee = null;
        price = bookingCounter*5;
        pricee= new String(String.valueOf(price));

        Text text1 = new Text();
        text1.setText(new String(String.valueOf(bookingCounter)));
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(400);
        text1.setY(350);

        Text text2 = new Text();
        text2.setText(pricee);
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text2.setFill(Color.WHITE);
        text2.setX(400);
        text2.setY(423);

        Text symbol1 = new Text("$");
        symbol1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        symbol1.setFill(Color.WHITE);
        symbol1.setX(470);
        symbol1.setY(423);


        Text text3 = new Text();
        text3.setText("CREDIT");
        text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text3.setFill(Color.WHITE);
        text3.setX(480);
        text3.setY(506);

        Text text4 = new Text();
        text4.setText(pricee);
        text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text4.setFill(Color.WHITE);
        text4.setX(480);
        text4.setY(632);

        Text symbol2 = new Text("$");
        symbol2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        symbol2.setFill(Color.WHITE);
        symbol2.setX(550);
        symbol2.setY(632);



        Button button1 = new Button("BUY");
        button1.setLayoutX(907);
        button1.setLayoutY(600);
        button1.setTextFill(Color.WHITE);
        button1.setStyle("-fx-background-color: Red");
        button1.setPrefWidth(100);
        button1.setPrefHeight(40);

        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(800);
        backbutton1.setLayoutY(600);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);





        receiptLayout.getChildren().add(imageView1);
        receiptLayout.getChildren().add(text1);
        receiptLayout.getChildren().add(text2);
        receiptLayout.getChildren().add(text3);
        receiptLayout.getChildren().add(symbol1);
        receiptLayout.getChildren().add(text4);
        receiptLayout.getChildren().add(symbol2);
        receiptLayout.getChildren().add(button1);
        receiptLayout.getChildren().add(backbutton1);


        Scene receiptScene = new Scene(receiptLayout,1300,1000);


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                PaymentType pbj = new PaymentType(primaryStage, receiptScene);
                pbj.start();
            }
        });

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(selectionScene);
            }
        });

        primaryStage.setScene(receiptScene);
        receiptLayout.requestFocus();
        primaryStage.setMaximized(true);
        primaryStage.show();



    }







}
