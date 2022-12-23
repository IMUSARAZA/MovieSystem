package com.example.moviesystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Home {

    Stage primaryStage;
    Scene loginScene;


    public Home(Stage primaryStage, Scene loginScene) {
        this.primaryStage=primaryStage;
        this.loginScene=loginScene;
    }

    public void start(){

        AnchorPane homelayout = new AnchorPane();

        homelayout.setPadding(new Insets(10,10,10,10));


        Image slide1 = new Image(getClass().getResourceAsStream("maula.jpg"));
        Image slide3 = new Image(getClass().getResourceAsStream("Avengers.jpeg"));
        Image slide4 = new Image(getClass().getResourceAsStream("Avatar.jpg"));

        ImageView imageView = new ImageView();
        imageView.setX(0);
        imageView.setX(0);
        imageView.setFitWidth(1300);
        imageView.setFitHeight(280);



            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            imageView.setImage(slide1);
                            cancel();
                        }
                    },
                    1000

            );


            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            imageView.setImage(slide3);
                            cancel();
                        }
                    },
                    3000

            );

            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            imageView.setImage(slide4);
                            cancel();
                        }
                    },
                    5000

            );

        Label label1 = new Label();
        label1.setText("NOW SHOWING!");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(50);
        label1.setLayoutY(325);

        Image img2 = new Image(getClass().getResourceAsStream("1.jpg"));

        ImageView imageView2= new ImageView(img2);
        imageView2.setX(50);
        imageView2.setY(400);

        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);

        Button buttonimg1 = new Button();
        buttonimg1.setLayoutX(50);
        buttonimg1.setLayoutY(400);
        buttonimg1.setPrefWidth(200);
        buttonimg1.setPrefHeight(200);
        buttonimg1.setStyle("-fx-background-color: transparent");


        Image img3 = new Image(getClass().getResourceAsStream("3.jpg"));

        ImageView imageView3 = new ImageView(img3);
        imageView3.setX(300);
        imageView3.setY(400);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);

        Button buttonimg2 = new Button();
        buttonimg2.setLayoutX(300);
        buttonimg2.setLayoutY(400);
        buttonimg2.setPrefWidth(200);
        buttonimg2.setPrefHeight(200);
        buttonimg2.setStyle("-fx-background-color: transparent");

        Image img4 = new Image(getClass().getResourceAsStream("4.jpg"));

        ImageView imageView4 = new ImageView(img4);
        imageView4.setX(550);
        imageView4.setY(400);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        Button buttonimg3 = new Button();
        buttonimg3.setLayoutX(550);
        buttonimg3.setLayoutY(400);
        buttonimg3.setPrefWidth(200);
        buttonimg3.setPrefHeight(200);
        buttonimg3.setStyle("-fx-background-color: transparent");


        Image img5 = new Image(getClass().getResourceAsStream("7.jpg"));

        ImageView imageView5 = new ImageView(img5);
        imageView5.setX(800);
        imageView5.setY(400);
        imageView5.setFitWidth(200);
        imageView5.setFitHeight(200);

        Button buttonimg4 = new Button();
        buttonimg4.setLayoutX(800);
        buttonimg4.setLayoutY(400);
        buttonimg4.setPrefWidth(200);
        buttonimg4.setPrefHeight(200);
        buttonimg4.setStyle("-fx-background-color: transparent");

        Image img6 = new Image(getClass().getResourceAsStream("6.jpg"));

        ImageView imageView6 = new ImageView(img6);
        imageView6.setX(1050);
        imageView6.setY(400);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(200);

        Button buttonimg5 = new Button();
        buttonimg5.setLayoutX(1050);
        buttonimg5.setLayoutY(400);
        buttonimg5.setPrefWidth(200);
        buttonimg5.setPrefHeight(200);
        buttonimg5.setStyle("-fx-background-color: transparent");



        Scene homescene = new Scene(homelayout,1300 ,1000);
        homelayout.getChildren().add(label1);
        homelayout.getChildren().add(imageView);
        homelayout.getChildren().add(imageView2);
        homelayout.getChildren().add(imageView3);
        homelayout.getChildren().add(imageView4);
        homelayout.getChildren().add(imageView5);
        homelayout.getChildren().add(imageView6);
        homelayout.getChildren().add(buttonimg1);
        homelayout.getChildren().add(buttonimg2);
        homelayout.getChildren().add(buttonimg3);
        homelayout.getChildren().add(buttonimg4);
        homelayout.getChildren().add(buttonimg5);


        homelayout.setStyle("-fx-background-color: Black");

        buttonimg1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Showtime showtime = new Showtime(primaryStage,homescene);
                showtime.start1();

            }
        });

        buttonimg2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Showtime showtime = new Showtime(primaryStage,homescene);
                showtime.start2();
            }
        });

        buttonimg3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Showtime showtime = new Showtime(primaryStage,homescene);
                showtime.start3();
            }
        });

        buttonimg4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Showtime showtime = new Showtime(primaryStage,homescene);
                showtime.start4();
            }
        });
        buttonimg5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Showtime showtime = new Showtime(primaryStage,homescene);
                showtime.start5();
            }
        });

        primaryStage.setScene(homescene);
        primaryStage.setMaximized(true);
        primaryStage.show();






    }




}