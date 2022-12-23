package com.example.moviesystem;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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
    }

    public void start(){

        AnchorPane confirmLayout = new AnchorPane();

        confirmLayout.setPadding(new Insets(10,10,10,10));

        Image img1 = new Image(getClass().getResourceAsStream("Booked.png"));

        ImageView imageView1 = new ImageView(img1);

        imageView1.setFitHeight(700);
        imageView1.setFitWidth(1280);

        int j=2;
//
//
        for(int i =1; i<=3; i++){
            Text texti = new Text();
            texti.setText(new String(String.valueOf(arrSeatno.get(i))));
            texti.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
            texti.setFill(Color.WHITE);
            texti.setX(400+j);
            texti.setY(423);

            confirmLayout.getChildren().add(texti);

        }


//        Text text1 = new Text();
//        text1.setText(new String(String.valueOf(arrSeatno)));
//        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
//        text1.setFill(Color.WHITE);
//        text1.setX(400);
//        text1.setY(423);









        confirmLayout.getChildren().add(imageView1);

        Scene confirmScene = new Scene(confirmLayout,1300,1000);

        primaryStage.setScene(confirmScene);
        primaryStage.setMaximized(true);
        primaryStage.show();
        confirmLayout.requestFocus();




    }

}
