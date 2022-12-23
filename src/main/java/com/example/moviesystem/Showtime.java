package com.example.moviesystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Showtime {

    Stage primaryStage;
    Scene homeScene;


    public Showtime(Stage primaryStage, Scene homeScene) {
        this.primaryStage = primaryStage;
        this.homeScene = homeScene;

    }

    public void start1(){



        AnchorPane showtimelayout = new AnchorPane();


        Label label1 = new Label();
        label1.setText("The Dark Night");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 85));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(15);
        label1.setLayoutY(80);

        Image img = new Image(getClass().getResourceAsStream("Batmanfinal.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(720);
        imageView.setY(110);
        imageView.setFitHeight(550);
        imageView.setFitWidth(550);

        Text text1 = new Text();
        text1.setText("T| 1h 32min | 2008 (USA)");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(20);
        text1.setY(250);


        Text text4 = new Text();
        text4.setText("After Gordon, Dent and Batman begin an assault on Gotham's organised crime, the mobs\n\nhire the Joker, a psychopathic criminal mastermind who offers to kill Batman and bring\n\nthe city to its knees.");
        text4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 18));
        text4.setFill(Color.WHITE);
        text4.setX(20);
        text4.setY(360);


        Rectangle rec1 = new Rectangle();
        rec1.setX(20);
        rec1.setY(279);
        rec1.setWidth(70);
        rec1.setHeight(21);
        rec1.setFill(Color.gray(0.3));

        Text text2 = new Text();
        text2.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setFill(Color.WHITE);
        text2.setText("Drama");
        text2.setX(30);
        text2.setY(294);

        Rectangle rec2 = new Rectangle();
        rec2.setX(100);
        rec2.setY(279);
        rec2.setWidth(70);
        rec2.setHeight(21);
        rec2.setFill(Color.gray(0.3));


        Text text3 = new Text();
        text3.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setFill(Color.WHITE);
        text3.setText("Thriller");
        text3.setX(106);
        text3.setY(294);

        Rectangle rec3 = new Rectangle();
        rec3.setX(180);
        rec3.setY(279);
        rec3.setWidth(70);
        rec3.setHeight(21);
        rec3.setFill(Color.gray(0.3));

        Text text5 = new Text();
        text5.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setFill(Color.WHITE);
        text5.setText("2:30 PM");
        text5.setX(189);
        text5.setY(294);



        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(20);
        backbutton1.setLayoutY(550);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        Button bookbutton1 = new Button("BOOK NOW");
        bookbutton1.setLayoutX(130);
        bookbutton1.setLayoutY(550);
        bookbutton1.setTextFill(Color.WHITE);
        bookbutton1.setStyle("-fx-background-color: Red");
        bookbutton1.setPrefWidth(100);
        bookbutton1.setPrefHeight(40);




        showtimelayout.setStyle("-fx-background-color: Black");

        showtimelayout.getChildren().add(label1);
        showtimelayout.getChildren().add(backbutton1);
        showtimelayout.getChildren().add(imageView);
        showtimelayout.getChildren().add(text1);
        showtimelayout.getChildren().add(text4);
        showtimelayout.getChildren().add(rec1);
        showtimelayout.getChildren().add(text2);
        showtimelayout.getChildren().add(rec2);
        showtimelayout.getChildren().add(text3);
        showtimelayout.getChildren().add(rec3);
        showtimelayout.getChildren().add(text5);
        showtimelayout.getChildren().add(bookbutton1);


        Scene showScene = new Scene(showtimelayout,2000,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(homeScene);
                primaryStage.show();
            }
        });

        bookbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SeatSelection seatSelection = new SeatSelection(primaryStage,showScene);
                seatSelection.start();
            }
        });

        primaryStage.setScene(showScene);
        primaryStage.setMaximized(true);
        primaryStage.show();



    }

    public void start2(){

        AnchorPane showtimelayout = new AnchorPane();


        Label label1 = new Label();
        label1.setText("Taxi Driver");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 85));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(15);
        label1.setLayoutY(80);

        Image img = new Image(getClass().getResourceAsStream("taxi.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(720);
        imageView.setY(110);
        imageView.setFitHeight(550);
        imageView.setFitWidth(550);

        Text text1 = new Text();
        text1.setText("T| 1h 32min | 2002 (USA)");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(20);
        text1.setY(250);


        Text text4 = new Text();
        text4.setText("Suffering from insomnia, disturbed loner Travis Bickle (Robert De Niro) takes a job\n\nas a New York City cabbie haunting the streets nightly, growing increasingly detached\n\nfrom reality as he dreams of cleaning up the filthy city");
        text4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 18));
        text4.setFill(Color.WHITE);
        text4.setX(20);
        text4.setY(360);


        Rectangle rec1 = new Rectangle();
        rec1.setX(20);
        rec1.setY(279);
        rec1.setWidth(70);
        rec1.setHeight(21);
        rec1.setFill(Color.gray(0.3));

        Text text2 = new Text();
        text2.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setFill(Color.WHITE);
        text2.setText("Drama");
        text2.setX(30);
        text2.setY(294);

        Rectangle rec2 = new Rectangle();
        rec2.setX(100);
        rec2.setY(279);
        rec2.setWidth(70);
        rec2.setHeight(21);
        rec2.setFill(Color.gray(0.3));

        Text text3 = new Text();
        text3.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setFill(Color.WHITE);
        text3.setText("Thriller");
        text3.setX(106);
        text3.setY(294);

        Rectangle rec3 = new Rectangle();
        rec3.setX(180);
        rec3.setY(279);
        rec3.setWidth(70);
        rec3.setHeight(21);
        rec3.setFill(Color.gray(0.3));

        Text text5 = new Text();
        text5.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setFill(Color.WHITE);
        text5.setText("2:30 PM");
        text5.setX(189);
        text5.setY(294);




        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(20);
        backbutton1.setLayoutY(550);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        Button bookbutton1 = new Button("BOOK NOW");
        bookbutton1.setLayoutX(130);
        bookbutton1.setLayoutY(550);
        bookbutton1.setTextFill(Color.WHITE);
        bookbutton1.setStyle("-fx-background-color: Red");
        bookbutton1.setPrefWidth(100);
        bookbutton1.setPrefHeight(40);


        showtimelayout.setStyle("-fx-background-color: Black");

        showtimelayout.getChildren().add(label1);
        showtimelayout.getChildren().add(backbutton1);
        showtimelayout.getChildren().add(imageView);
        showtimelayout.getChildren().add(text1);
        showtimelayout.getChildren().add(text4);
        showtimelayout.getChildren().add(rec1);
        showtimelayout.getChildren().add(text2);
        showtimelayout.getChildren().add(rec2);
        showtimelayout.getChildren().add(text3);
        showtimelayout.getChildren().add(rec3);
        showtimelayout.getChildren().add(text5);
        showtimelayout.getChildren().add(bookbutton1);

        Scene showScene = new Scene(showtimelayout,2000,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(homeScene);
                primaryStage.show();
            }
        });

        bookbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SeatSelection seatSelection = new SeatSelection(primaryStage,showScene);
                seatSelection.start();
            }
        });

        primaryStage.setScene(showScene);
        primaryStage.setMaximized(true);
        primaryStage.show();

    }

    public void start3(){


        AnchorPane showtimelayout = new AnchorPane();


        Label label1 = new Label();
        label1.setText("The GodFather");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 85));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(15);
        label1.setLayoutY(80);

        Image img = new Image(getClass().getResourceAsStream("god.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(720);
        imageView.setY(110);
        imageView.setFitHeight(550);
        imageView.setFitWidth(550);

        Text text1 = new Text();
        text1.setText("T| 1h 32min | 2001 (USA)");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(20);
        text1.setY(250);


        Text text4 = new Text();
        text4.setText("Widely regarded as one of the greatest films of all time, this mob drama based on Mario Puzo's\n\nnovel of the same name focuses on the powerful Italian-American crime family of Don Vito\n\nCorleone(Marlon Brando)");
        text4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 18));
        text4.setFill(Color.WHITE);
        text4.setX(20);
        text4.setY(360);


        Rectangle rec1 = new Rectangle();
        rec1.setX(20);
        rec1.setY(279);
        rec1.setWidth(70);
        rec1.setHeight(21);
        rec1.setFill(Color.gray(0.3));

        Text text2 = new Text();
        text2.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setFill(Color.WHITE);
        text2.setText("Drama");
        text2.setX(30);
        text2.setY(294);

        Rectangle rec2 = new Rectangle();
        rec2.setX(100);
        rec2.setY(279);
        rec2.setWidth(70);
        rec2.setHeight(21);
        rec2.setFill(Color.gray(0.3));

        Text text3 = new Text();
        text3.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setFill(Color.WHITE);
        text3.setText("Thriller");
        text3.setX(106);
        text3.setY(294);

        Rectangle rec3 = new Rectangle();
        rec3.setX(180);
        rec3.setY(279);
        rec3.setWidth(70);
        rec3.setHeight(21);
        rec3.setFill(Color.gray(0.3));

        Text text5 = new Text();
        text5.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setFill(Color.WHITE);
        text5.setText("2:30 PM");
        text5.setX(189);
        text5.setY(294);





        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(20);
        backbutton1.setLayoutY(550);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        Button bookbutton1 = new Button("BOOK NOW");
        bookbutton1.setLayoutX(130);
        bookbutton1.setLayoutY(550);
        bookbutton1.setTextFill(Color.WHITE);
        bookbutton1.setStyle("-fx-background-color: Red");
        bookbutton1.setPrefWidth(100);
        bookbutton1.setPrefHeight(40);


        showtimelayout.setStyle("-fx-background-color: Black");

        showtimelayout.getChildren().add(label1);
        showtimelayout.getChildren().add(backbutton1);
        showtimelayout.getChildren().add(imageView);
        showtimelayout.getChildren().add(text1);
        showtimelayout.getChildren().add(text4);
        showtimelayout.getChildren().add(rec1);
        showtimelayout.getChildren().add(text2);
        showtimelayout.getChildren().add(rec2);
        showtimelayout.getChildren().add(text3);
        showtimelayout.getChildren().add(rec3);
        showtimelayout.getChildren().add(text5);
        showtimelayout.getChildren().add(bookbutton1);

        Scene showScene = new Scene(showtimelayout,2000,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(homeScene);
                primaryStage.show();
            }
        });

        bookbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SeatSelection seatSelection = new SeatSelection(primaryStage,showScene);
                seatSelection.start();
            }
        });

        primaryStage.setScene(showScene);
        primaryStage.setMaximized(true);
        primaryStage.show();



    }

    public void start4(){

        AnchorPane showtimelayout = new AnchorPane();


        Label label1 = new Label();
        label1.setText("Kung Fu Panda");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 85));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(15);
        label1.setLayoutY(80);

        Image img = new Image(getClass().getResourceAsStream("kun.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(720);
        imageView.setY(110);
        imageView.setFitHeight(550);
        imageView.setFitWidth(550);

        Text text1 = new Text();
        text1.setText("T| 1h 50min | 2008 (China)");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(20);
        text1.setY(250);


        Text text4 = new Text();
        text4.setText("Po might just be the laziest, clumsiest panda in the Valley of Peace\n\nbut he secretly dreams of becoming a kung fu legend. When the villainous snow leopard Tai\n\nLung threatens Po's homeland, the hapless panda is chosen to fulfil an ancient prophecy");
        text4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 18));
        text4.setFill(Color.WHITE);
        text4.setX(20);
        text4.setY(360);


        Rectangle rec1 = new Rectangle();
        rec1.setX(20);
        rec1.setY(279);
        rec1.setWidth(70);
        rec1.setHeight(21);
        rec1.setFill(Color.gray(0.3));

        Text text2 = new Text();
        text2.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setFill(Color.WHITE);
        text2.setText("Drama");
        text2.setX(30);
        text2.setY(294);

        Rectangle rec2 = new Rectangle();
        rec2.setX(100);
        rec2.setY(279);
        rec2.setWidth(70);
        rec2.setHeight(21);
        rec2.setFill(Color.gray(0.3));

        Text text3 = new Text();
        text3.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setFill(Color.WHITE);
        text3.setText("Thriller");
        text3.setX(106);
        text3.setY(294);


        Rectangle rec3 = new Rectangle();
        rec3.setX(180);
        rec3.setY(279);
        rec3.setWidth(70);
        rec3.setHeight(21);
        rec3.setFill(Color.gray(0.3));

        Text text5 = new Text();
        text5.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setFill(Color.WHITE);
        text5.setText("2:30 PM");
        text5.setX(189);
        text5.setY(294);


        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(20);
        backbutton1.setLayoutY(550);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        Button bookbutton1 = new Button("BOOK NOW");
        bookbutton1.setLayoutX(130);
        bookbutton1.setLayoutY(550);
        bookbutton1.setTextFill(Color.WHITE);
        bookbutton1.setStyle("-fx-background-color: Red");
        bookbutton1.setPrefWidth(100);
        bookbutton1.setPrefHeight(40);


        showtimelayout.setStyle("-fx-background-color: Black");

        showtimelayout.getChildren().add(label1);
        showtimelayout.getChildren().add(backbutton1);
        showtimelayout.getChildren().add(imageView);
        showtimelayout.getChildren().add(text1);
        showtimelayout.getChildren().add(text4);
        showtimelayout.getChildren().add(rec1);
        showtimelayout.getChildren().add(text2);
        showtimelayout.getChildren().add(rec2);
        showtimelayout.getChildren().add(text3);
        showtimelayout.getChildren().add(rec3);
        showtimelayout.getChildren().add(text5);
        showtimelayout.getChildren().add(bookbutton1);

        Scene showScene = new Scene(showtimelayout,2000,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(homeScene);
                primaryStage.show();
            }
        });

        bookbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SeatSelection seatSelection = new SeatSelection(primaryStage,showScene);
                seatSelection.start();
            }
        });

        primaryStage.setScene(showScene);
        primaryStage.setMaximized(true);
        primaryStage.show();

    }

    public void start5(){

        AnchorPane showtimelayout = new AnchorPane();


        Label label1 = new Label();
        label1.setText("Justice League");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 85));
        label1.setTextFill(Color.WHITE);
        label1.setLayoutX(15);
        label1.setLayoutY(80);

        Image img = new Image(getClass().getResourceAsStream("justice.png"));
        ImageView imageView = new ImageView(img);
        imageView.setX(720);
        imageView.setY(110);
        imageView.setFitHeight(550);
        imageView.setFitWidth(550);

        Text text1 = new Text();
        text1.setText("T| 2h 10min | 2017 (USA)");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
        text1.setFill(Color.WHITE);
        text1.setX(20);
        text1.setY(250);


        Text text4 = new Text();
        text4.setText("Fuelled by his restored faith in humanity, and inspired by Superman's selfless act\n\nBruce Wayne enlists newfound ally Diana Prince to face an even greater threat. Together\n\nBatman and Wonder Woman work quickly to recruit a team to stand against this\n\nnewly-awakened enemy.");
        text4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 18));
        text4.setFill(Color.WHITE);
        text4.setX(20);
        text4.setY(360);


        Rectangle rec1 = new Rectangle();
        rec1.setX(20);
        rec1.setY(279);
        rec1.setWidth(70);
        rec1.setHeight(21);
        rec1.setFill(Color.gray(0.3));

        Text text2 = new Text();
        text2.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setFill(Color.WHITE);
        text2.setText("Drama");
        text2.setX(30);
        text2.setY(294);

        Rectangle rec2 = new Rectangle();
        rec2.setX(100);
        rec2.setY(279);
        rec2.setWidth(70);
        rec2.setHeight(21);
        rec2.setFill(Color.gray(0.3));

        Text text3 = new Text();
        text3.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setFill(Color.WHITE);
        text3.setText("Thriller");
        text3.setX(106);
        text3.setY(294);


        Rectangle rec3 = new Rectangle();
        rec3.setX(180);
        rec3.setY(279);
        rec3.setWidth(70);
        rec3.setHeight(21);
        rec3.setFill(Color.gray(0.3));

        Text text5 = new Text();
        text5.setFont(Font.font("Arial ", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setFill(Color.WHITE);
        text5.setText("2:30 PM");
        text5.setX(189);
        text5.setY(294);


        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(130);
        backbutton1.setLayoutY(550);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: Red");
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);

        Button bookbutton1 = new Button("BOOK NOW");
        bookbutton1.setLayoutX(20);
        bookbutton1.setLayoutY(550);
        bookbutton1.setTextFill(Color.WHITE);
        bookbutton1.setStyle("-fx-background-color: Red");
        bookbutton1.setPrefWidth(100);
        bookbutton1.setPrefHeight(40);


        showtimelayout.setStyle("-fx-background-color: Black");

        showtimelayout.getChildren().add(label1);
        showtimelayout.getChildren().add(backbutton1);
        showtimelayout.getChildren().add(imageView);
        showtimelayout.getChildren().add(text1);
        showtimelayout.getChildren().add(text4);
        showtimelayout.getChildren().add(rec1);
        showtimelayout.getChildren().add(text2);
        showtimelayout.getChildren().add(rec2);
        showtimelayout.getChildren().add(text3);
        showtimelayout.getChildren().add(rec3);
        showtimelayout.getChildren().add(text5);
        showtimelayout.getChildren().add(bookbutton1);

        Scene showScene = new Scene(showtimelayout,2000,1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(homeScene);
                primaryStage.show();
            }
        });

        bookbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SeatSelection seatSelection = new SeatSelection(primaryStage,showScene);
                seatSelection.start();
            }
        });

        primaryStage.setScene(showScene);
        primaryStage.setMaximized(true);
        primaryStage.show();

    }



}
