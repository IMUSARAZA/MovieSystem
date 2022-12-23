package com.example.moviesystem;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Login extends Application {

      String strid,idsearch,strpass,passsearch;
      int count1=0,count2=0;


    @Override
    public void start(final Stage primaryStage) throws Exception {


       AnchorPane loginLayout = new AnchorPane();

       loginLayout.setPadding(new Insets(10,10,10,10));

       Label label1 = new Label();
       label1.setText("Welcome to Hue Cinemas!");
       label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
       label1.setLayoutX(335);
       label1.setLayoutY(210);
       label1.setTextFill(Color.web("#F5F5F5"));


        Image logo = new Image(getClass().getResourceAsStream("logo.png"));

        ImageView logoView = new ImageView();
        logoView.setImage(logo);
        logoView.setLayoutX(250);
        logoView.setLayoutY(55);
        logoView.setFitWidth(400);
        logoView.setFitHeight(200);


        Image img = new Image(getClass().getResourceAsStream("POPI.png"));

        ImageView imageView = new ImageView();
        imageView.setImage(img);

        Rectangle rect = new Rectangle();

        rect.setX(315);
        rect.setY(203);
        rect.setWidth(390);
        rect.setHeight(200);

        rect.setFill(Color.rgb(0,0,0,0.54));
        rect.setStrokeWidth(1.0);
        rect.setStroke(Color.BLACK);
        rect.setStrokeType(StrokeType.INSIDE);


        TextField text1 = new TextField();
        text1.setPromptText("Username or Email");
        text1.setLayoutX(347);
        text1.setLayoutY(256);
        text1.setPrefWidth(222);


        PasswordField pass1 = new PasswordField();
        pass1.setPromptText("Password");
        pass1.setLayoutX(347);
        pass1.setLayoutY(295);
        pass1.setPrefWidth(222);

        ////   Login Button   ////

        Button button1 = new Button("Sign in");
        button1.setLayoutX(347);
        button1.setLayoutY(340);
        button1.setTextFill(Color.WHITE);
        button1.setStyle("-fx-background-color: #FF0000");

        Label label2 = new Label();
        label2.setText("New to Hue Cinema?");
        label2.setLayoutX(347);
        label2.setLayoutY(380);
        label2.setTextFill(Color.web("#F5F5F5"));

        //// Signup button ////

        Button button2 = new Button("Sign Up");
        button2.setFont(new Font(12));
        button2.setLayoutX(455);
        button2.setLayoutY(376);
        button2.setTextFill(Color.WHITE);
        button2.setUnderline(true);
        button2.setStyle("-fx-background-color: transparent");


        //// Adding elements to layout ////

        loginLayout.getChildren().add(imageView);
        loginLayout.getChildren().add(logoView);
        loginLayout.getChildren().add(rect);
        loginLayout.getChildren().add(label1);
        loginLayout.getChildren().add(text1);
        loginLayout.getChildren().add(pass1);
        loginLayout.getChildren().add(button1);
        loginLayout.getChildren().add(label2);
        loginLayout.getChildren().add(button2);

        Scene loginScene = new Scene(loginLayout,950, 475);

                //// Event Handling ////


        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Signup signup = new Signup(primaryStage, loginScene);

                signup.start();
            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {

                idsearch=text1.getText();
                passsearch=pass1.getText();

                try {
                    FileReader myReader = new FileReader("IdCredentials.txt");
                    FileReader myReader1 = new FileReader("PassCredentials.txt");

                    BufferedReader bufferedReader = new BufferedReader(myReader);
                    BufferedReader bufferedReader2 = new BufferedReader(myReader1);

                    while ((strid=bufferedReader.readLine()) != null) {

                        if (strid.equals(idsearch)) {

                            count1 = 2;
                        }
                        while ((strpass = bufferedReader2.readLine()) != null) {

                            if (strpass.equals(passsearch)) {

                                count2 = 2;
                            }
                        }
                    }
                        if (count1 == 2 && count2==2) {
                            System.out.println("Login Successful");
                                    Home home = new Home(primaryStage, loginScene);
                                    home.start();
                                }
                        else{
                            System.out.println("Wrong email or password");
                            Label label3 = new Label();
                            label3.setText("Wrong email or password");
                            label3.setLayoutX(410);
                            label3.setLayoutY(343);
                            label3.setTextFill(Color.RED);
                            loginLayout.getChildren().add(label3);
                        }

                    myReader.close();
                    myReader1.close();

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        primaryStage.setTitle("--------");

        primaryStage.setScene(loginScene);

        primaryStage.setResizable(false);

        loginLayout.requestFocus();

        primaryStage.show();



       }

    public static void main(String[] args) {
        launch(args);
    }


}
