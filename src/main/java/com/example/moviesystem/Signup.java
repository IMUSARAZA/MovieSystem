package com.example.moviesystem;


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

import java.io.*;
import java.util.ArrayList;


public class Signup {

    Stage primaryStage;
    Scene loginScene;

    public Signup(Stage primaryStage, Scene loginScene) {
        this.primaryStage=primaryStage;
        this.loginScene=loginScene;
    }

    public void start() {


        AnchorPane singupLayout = new AnchorPane();

        singupLayout.setPadding(new Insets(10,10,10,10));

        Image img = new Image(getClass().getResourceAsStream("POPI.png"));

        ImageView imageView = new ImageView(img);

        Rectangle rect = new Rectangle();

        rect.setX(315);
        rect.setY(100);
        rect.setWidth(390);
        rect.setHeight(350);

        rect.setFill(Color.rgb(0,0,0,0.54));
        rect.setStrokeWidth(1.0);
        rect.setStroke(Color.BLACK);
        rect.setStrokeType(StrokeType.INSIDE);

        Label label1 = new Label();
        label1.setText("Creat Your Account!");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        label1.setLayoutX(330);
        label1.setLayoutY(120);
        label1.setTextFill(Color.WHITE);

        TextField text1 = new TextField();
        text1.setPromptText("Enter your first name");
        text1.setLayoutX(330);
        text1.setLayoutY(115);
        text1.setPrefWidth(222);

        TextField text2 = new TextField();
        text2.setPromptText("Enter your last name");
        text2.setLayoutX(330);
        text2.setLayoutY(151);
        text2.setPrefWidth(222);

        TextField text3 = new TextField();
        text3.setPromptText("Enter your email");
        text3.setLayoutX(330);
        text3.setLayoutY(193);
        text3.setPrefWidth(222);

        PasswordField pass1 = new PasswordField();
        pass1.setPromptText("Enter your password");
        pass1.setLayoutX(330);
        pass1.setLayoutY(228);
        pass1.setPrefWidth(222);

        PasswordField pass2 = new PasswordField();
        pass2.setPromptText("Confirm your password");
        pass2.setLayoutX(330);
        pass2.setLayoutY(265);
        pass2.setPrefWidth(222);

        TextField text4= new TextField();
        text4.setPromptText("Enter your phone number");
        text4.setLayoutX(330);
        text4.setLayoutY(303);
        text4.setPrefWidth(222);

        Button button1 = new Button("Creat Account");
        button1.setLayoutX(330);
        button1.setLayoutY(340);
        button1.setTextFill(Color.WHITE);
        button1.setStyle("-fx-background-color: #FF0000");

        Button backbutton1 = new Button("Back");
        backbutton1.setLayoutX(430);
        backbutton1.setLayoutY(340);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: #FF0000");

        Label label2 = new Label();
        label2.setTextFill(Color.RED);
        label2.setLayoutX(430);
        label2.setLayoutY(370);


        ArrayList<String> idarray = new ArrayList<String>();
        ArrayList<String> passarray = new ArrayList<String>();


        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                char c = '@';
                String temp;
                int hold;
                Boolean test = false;


                /// Checking for valid email address //
                temp=text3.getText();
                hold=temp.length();

                    for(int k=0; k<hold; k++){
                    if(text3.getText().charAt(k) == c){
                        test=true;
                        break;
                    }
                    else {
                        test=false;
                    }
                }

                if (pass1.getText().equals(pass2.getText()) == true && test==true) {
                        label2.setText("Account Created Successfully");


                        idarray.add(text3.getText());
                        System.out.println(idarray);

                        passarray.add(pass1.getText());
                        System.out.println(passarray);
                        try {
                            BufferedWriter myWriter = new BufferedWriter(new FileWriter(new File("IdCredentials.txt"), true));
                            BufferedWriter myWriter2 = new BufferedWriter(new FileWriter(new File("PassCredentials.txt"), true));

                            for (int i = 0; i < idarray.size(); i++) {
                                myWriter.write(idarray.get(i));
                                myWriter.newLine();
                            }
                            for (int i = 0; i < passarray.size(); i++) {
                                myWriter2.write(passarray.get(i));
                                myWriter2.newLine();
                            }
                            myWriter.close();
                            myWriter2.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                }

                else if (pass1.getText().equals(pass2.getText()) == false){
                    label2.setText("Password does not match");

                } else if (test==false) {
                    label2.setText("Enter a valid email address");

                }
            }

        });

        singupLayout.getChildren().add(imageView);
        singupLayout.getChildren().add(rect);
        singupLayout.getChildren().add(text1);
        singupLayout.getChildren().add(text2);
        singupLayout.getChildren().add(text3);
        singupLayout.getChildren().add(pass1);
        singupLayout.getChildren().add(pass2);
        singupLayout.getChildren().add(text4);
        singupLayout.getChildren().add(label2);
        singupLayout.getChildren().add(button1);
        singupLayout.getChildren().add(backbutton1);
        Scene signUpscene = new Scene(singupLayout,950,475);


        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                primaryStage.setScene(loginScene);
                primaryStage.show();
            }
        });


        singupLayout.requestFocus();
        primaryStage.setScene(signUpscene);
        primaryStage.show();


    }
}
