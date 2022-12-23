package com.example.moviesystem;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class SeatSelection {

    Stage primaryStage;

    Scene showScene;

    public SeatSelection(Stage primaryStage, Scene showScene) {

        this.primaryStage = primaryStage;
        this.showScene = showScene;
    }

    public SeatSelection() {

    }

    int bookingCounter=0;

    ArrayList<Integer> arrSeatno = new ArrayList<Integer>();

    public void start()  {

        AnchorPane selectionlayout = new AnchorPane();

        Label label1 = new Label();
        label1.setText("SELECT YOUR SEATS");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        label1.setLayoutX(100);
        label1.setLayoutY(30);
        label1.setTextFill(Color.WHITE);


        Image img = new Image(getClass().getResourceAsStream("Screen.jpeg"));

        ImageView imageView = new ImageView(img);

        imageView.setLayoutX(290);
        imageView.setLayoutY(70);
        imageView.setFitWidth(720);



        Button button1 = new Button("01");
        button1.setLayoutX(250);
        button1.setLayoutY(250);
        button1.setTextFill(Color.WHITE);
        button1.setStyle("-fx-background-color: Grey");

        Button button2 = new Button("02");
        button2.setLayoutX(282);
        button2.setLayoutY(250);
        button2.setTextFill(Color.WHITE);
        button2.setStyle("-fx-background-color: Grey");

        Button button3 = new Button("03");
        button3.setLayoutX(314);
        button3.setLayoutY(250);
        button3.setTextFill(Color.WHITE);
        button3.setStyle("-fx-background-color: Grey");

        Button button4 = new Button("04");
        button4.setLayoutX(346);
        button4.setLayoutY(250);
        button4.setTextFill(Color.WHITE);
        button4.setStyle("-fx-background-color: Grey");

        Button button5 = new Button("05");
        button5.setLayoutX(378);
        button5.setLayoutY(250);
        button5.setTextFill(Color.WHITE);
        button5.setStyle("-fx-background-color: Grey");

        Button button6 = new Button("06");
        button6.setLayoutX(478);
        button6.setLayoutY(250);
        button6.setTextFill(Color.WHITE);
        button6.setStyle("-fx-background-color: Grey");

        Button button7 = new Button("07");
        button7.setLayoutX(510);
        button7.setLayoutY(250);
        button7.setTextFill(Color.WHITE);
        button7.setStyle("-fx-background-color: Grey");

        Button button8 = new Button("08");
        button8.setLayoutX(542);
        button8.setLayoutY(250);
        button8.setTextFill(Color.WHITE);
        button8.setStyle("-fx-background-color: Grey");

        Button button9 = new Button("09");
        button9.setLayoutX(574);
        button9.setLayoutY(250);
        button9.setTextFill(Color.WHITE);
        button9.setStyle("-fx-background-color: Grey");

        Button button10 = new Button("10");
        button10.setLayoutX(606);
        button10.setLayoutY(250);
        button10.setTextFill(Color.WHITE);
        button10.setStyle("-fx-background-color: Grey");

        Button button11 = new Button("11");
        button11.setLayoutX(638);
        button11.setLayoutY(250);
        button11.setTextFill(Color.WHITE);
        button11.setStyle("-fx-background-color: Grey");

        Button button12 = new Button("12");
        button12.setLayoutX(670);
        button12.setLayoutY(250);
        button12.setTextFill(Color.WHITE);
        button12.setStyle("-fx-background-color: Grey");

        Button button13 = new Button("13");
        button13.setLayoutX(702);
        button13.setLayoutY(250);
        button13.setTextFill(Color.WHITE);
        button13.setStyle("-fx-background-color: Grey");

        Button button14 = new Button("14");
        button14.setLayoutX(734);
        button14.setLayoutY(250);
        button14.setTextFill(Color.WHITE);
        button14.setStyle("-fx-background-color: Grey");

        Button button15 = new Button("15");
        button15.setLayoutX(766);
        button15.setLayoutY(250);
        button15.setTextFill(Color.WHITE);
        button15.setStyle("-fx-background-color: Grey");


        Button button16 = new Button("16");
        button16.setLayoutX(866);
        button16.setLayoutY(250);
        button16.setTextFill(Color.WHITE);
        button16.setStyle("-fx-background-color: Grey");

        Button button17 = new Button("17");
        button17.setLayoutX(898);
        button17.setLayoutY(250);
        button17.setTextFill(Color.WHITE);
        button17.setStyle("-fx-background-color: Grey");

        Button button18 = new Button("18");
        button18.setLayoutX(930);
        button18.setLayoutY(250);
        button18.setTextFill(Color.WHITE);
        button18.setStyle("-fx-background-color: Grey");

        Button button19 = new Button("19");
        button19.setLayoutX(962);
        button19.setLayoutY(250);
        button19.setTextFill(Color.WHITE);
        button19.setStyle("-fx-background-color: Grey");

        Button button20 = new Button("20");
        button20.setLayoutX(994);
        button20.setLayoutY(250);
        button20.setTextFill(Color.WHITE);
        button20.setStyle("-fx-background-color: Grey");





        Button button21 = new Button("21");
        button21.setLayoutX(250);
        button21.setLayoutY(300);
        button21.setTextFill(Color.WHITE);
        button21.setStyle("-fx-background-color: Grey");

        Button button22 = new Button("22");
        button22.setLayoutX(282);
        button22.setLayoutY(300);
        button22.setTextFill(Color.WHITE);
        button22.setStyle("-fx-background-color: Grey");

        Button button23 = new Button("23");
        button23.setLayoutX(314);
        button23.setLayoutY(300);
        button23.setTextFill(Color.WHITE);
        button23.setStyle("-fx-background-color: Grey");

        Button button24 = new Button("24");
        button24.setLayoutX(346);
        button24.setLayoutY(300);
        button24.setTextFill(Color.WHITE);
        button24.setStyle("-fx-background-color: Grey");

        Button button25 = new Button("25");
        button25.setLayoutX(378);
        button25.setLayoutY(300);
        button25.setTextFill(Color.WHITE);
        button25.setStyle("-fx-background-color: Grey");

        Button button26 = new Button("26");
        button26.setLayoutX(478);
        button26.setLayoutY(300);
        button26.setTextFill(Color.WHITE);
        button26.setStyle("-fx-background-color: Grey");

        Button button27 = new Button("27");
        button27.setLayoutX(510);
        button27.setLayoutY(300);
        button27.setTextFill(Color.WHITE);
        button27.setStyle("-fx-background-color: Grey");

        Button button28 = new Button("28");
        button28.setLayoutX(542);
        button28.setLayoutY(300);
        button28.setTextFill(Color.WHITE);
        button28.setStyle("-fx-background-color: Grey");

        Button button29 = new Button("29");
        button29.setLayoutX(574);
        button29.setLayoutY(300);
        button29.setTextFill(Color.WHITE);
        button29.setStyle("-fx-background-color: Grey");

        Button button30 = new Button("30");
        button30.setLayoutX(606);
        button30.setLayoutY(300);
        button30.setTextFill(Color.WHITE);
        button30.setStyle("-fx-background-color: Grey");

        Button button31 = new Button("31");
        button31.setLayoutX(638);
        button31.setLayoutY(300);
        button31.setTextFill(Color.WHITE);
        button31.setStyle("-fx-background-color: Grey");

        Button button32 = new Button("32");
        button32.setLayoutX(670);
        button32.setLayoutY(300);
        button32.setTextFill(Color.WHITE);
        button32.setStyle("-fx-background-color: Grey");

        Button button33 = new Button("33");
        button33.setLayoutX(702);
        button33.setLayoutY(300);
        button33.setTextFill(Color.WHITE);
        button33.setStyle("-fx-background-color: Grey");

        Button button34 = new Button("34");
        button34.setLayoutX(734);
        button34.setLayoutY(300);
        button34.setTextFill(Color.WHITE);
        button34.setStyle("-fx-background-color: Grey");

        Button button35 = new Button("35");
        button35.setLayoutX(766);
        button35.setLayoutY(300);
        button35.setTextFill(Color.WHITE);
        button35.setStyle("-fx-background-color: Grey");


        Button button36 = new Button("36");
        button36.setLayoutX(866);
        button36.setLayoutY(300);
        button36.setTextFill(Color.WHITE);
        button36.setStyle("-fx-background-color: Grey");

        Button button37 = new Button("37");
        button37.setLayoutX(898);
        button37.setLayoutY(300);
        button37.setTextFill(Color.WHITE);
        button37.setStyle("-fx-background-color: Grey");

        Button button38 = new Button("38");
        button38.setLayoutX(930);
        button38.setLayoutY(300);
        button38.setTextFill(Color.WHITE);
        button38.setStyle("-fx-background-color: Grey");

        Button button39 = new Button("39");
        button39.setLayoutX(962);
        button39.setLayoutY(300);
        button39.setTextFill(Color.WHITE);
        button39.setStyle("-fx-background-color: Grey");

        Button button40 = new Button("40");
        button40.setLayoutX(994);
        button40.setLayoutY(300);
        button40.setTextFill(Color.WHITE);
        button40.setStyle("-fx-background-color: Grey");

        Button button41 = new Button("41");
        button41.setLayoutX(250);
        button41.setLayoutY(350);
        button41.setTextFill(Color.WHITE);
        button41.setStyle("-fx-background-color: Grey");

        Button button42 = new Button("42");
        button42.setLayoutX(282);
        button42.setLayoutY(350);
        button42.setTextFill(Color.WHITE);
        button42.setStyle("-fx-background-color: Grey");

        Button button43 = new Button("43");
        button43.setLayoutX(314);
        button43.setLayoutY(350);
        button43.setTextFill(Color.WHITE);
        button43.setStyle("-fx-background-color: Grey");

        Button button44 = new Button("44");
        button44.setLayoutX(346);
        button44.setLayoutY(350);
        button44.setTextFill(Color.WHITE);
        button44.setStyle("-fx-background-color: Grey");

        Button button45 = new Button("45");
        button45.setLayoutX(378);
        button45.setLayoutY(350);
        button45.setTextFill(Color.WHITE);
        button45.setStyle("-fx-background-color: Grey");

        Button button46 = new Button("46");
        button46.setLayoutX(478);
        button46.setLayoutY(350);
        button46.setTextFill(Color.WHITE);
        button46.setStyle("-fx-background-color: Grey");

        Button button47 = new Button("47");
        button47.setLayoutX(510);
        button47.setLayoutY(350);
        button47.setTextFill(Color.WHITE);
        button47.setStyle("-fx-background-color: Grey");

        Button button48 = new Button("48");
        button48.setLayoutX(542);
        button48.setLayoutY(350);
        button48.setTextFill(Color.WHITE);
        button48.setStyle("-fx-background-color: Grey");

        Button button49 = new Button("49");
        button49.setLayoutX(574);
        button49.setLayoutY(350);
        button49.setTextFill(Color.WHITE);
        button49.setStyle("-fx-background-color: Grey");

        Button button50 = new Button("50");
        button50.setLayoutX(606);
        button50.setLayoutY(350);
        button50.setTextFill(Color.WHITE);
        button50.setStyle("-fx-background-color: Grey");

        Button button51 = new Button("51");
        button51.setLayoutX(638);
        button51.setLayoutY(350);
        button51.setTextFill(Color.WHITE);
        button51.setStyle("-fx-background-color: Grey");

        Button button52 = new Button("52");
        button52.setLayoutX(670);
        button52.setLayoutY(350);
        button52.setTextFill(Color.WHITE);
        button52.setStyle("-fx-background-color: Grey");

        Button button53 = new Button("53");
        button53.setLayoutX(702);
        button53.setLayoutY(350);
        button53.setTextFill(Color.WHITE);
        button53.setStyle("-fx-background-color: Grey");

        Button button54 = new Button("54");
        button54.setLayoutX(734);
        button54.setLayoutY(350);
        button54.setTextFill(Color.WHITE);
        button54.setStyle("-fx-background-color: Grey");

        Button button55 = new Button("55");
        button55.setLayoutX(766);
        button55.setLayoutY(350);
        button55.setTextFill(Color.WHITE);
        button55.setStyle("-fx-background-color: Grey");


        Button button56 = new Button("56");
        button56.setLayoutX(866);
        button56.setLayoutY(350);
        button56.setTextFill(Color.WHITE);
        button56.setStyle("-fx-background-color: Grey");

        Button button57 = new Button("57");
        button57.setLayoutX(898);
        button57.setLayoutY(350);
        button57.setTextFill(Color.WHITE);
        button57.setStyle("-fx-background-color: Grey");

        Button button58 = new Button("58");
        button58.setLayoutX(930);
        button58.setLayoutY(350);
        button58.setTextFill(Color.WHITE);
        button58.setStyle("-fx-background-color: Grey");

        Button button59 = new Button("59");
        button59.setLayoutX(962);
        button59.setLayoutY(350);
        button59.setTextFill(Color.WHITE);
        button59.setStyle("-fx-background-color: Grey");

        Button button60 = new Button("60");
        button60.setLayoutX(994);
        button60.setLayoutY(350);
        button60.setTextFill(Color.WHITE);
        button60.setStyle("-fx-background-color: Grey");


                   ////// GOLD SEATS ////////

        Button button61 = new Button("61");
        button61.setLayoutX(314);
        button61.setLayoutY(450);
        button61.setTextFill(Color.WHITE);
        button61.setStyle("-fx-background-color: Gold");

        Button button62 = new Button("62");
        button62.setLayoutX(346);
        button62.setLayoutY(450);
        button62.setTextFill(Color.WHITE);
        button62.setStyle("-fx-background-color: Gold");

        Button button63 = new Button("63");
        button63.setLayoutX(378);
        button63.setLayoutY(450);
        button63.setTextFill(Color.WHITE);
        button63.setStyle("-fx-background-color: Gold");

        Button button64 = new Button("64");
        button64.setLayoutX(478);
        button64.setLayoutY(450);
        button64.setTextFill(Color.WHITE);
        button64.setStyle("-fx-background-color: Gold");

        Button button65 = new Button("65");
        button65.setLayoutX(510);
        button65.setLayoutY(450);
        button65.setTextFill(Color.WHITE);
        button65.setStyle("-fx-background-color: Gold");

        Button button66 = new Button("66");
        button66.setLayoutX(542);
        button66.setLayoutY(450);
        button66.setTextFill(Color.WHITE);
        button66.setStyle("-fx-background-color: Gold");

        Button button67 = new Button("67");
        button67.setLayoutX(574);
        button67.setLayoutY(450);
        button67.setTextFill(Color.WHITE);
        button67.setStyle("-fx-background-color: Gold");

        Button button68 = new Button("68");
        button68.setLayoutX(606);
        button68.setLayoutY(450);
        button68.setTextFill(Color.WHITE);
        button68.setStyle("-fx-background-color: Gold");

        Button button69 = new Button("69");
        button69.setLayoutX(638);
        button69.setLayoutY(450);
        button69.setTextFill(Color.WHITE);
        button69.setStyle("-fx-background-color: Gold");

        Button button70 = new Button("70");
        button70.setLayoutX(670);
        button70.setLayoutY(450);
        button70.setTextFill(Color.WHITE);
        button70.setStyle("-fx-background-color: Gold");

        Button button71 = new Button("71");
        button71.setLayoutX(702);
        button71.setLayoutY(450);
        button71.setTextFill(Color.WHITE);
        button71.setStyle("-fx-background-color: Gold");

        Button button72 = new Button("72");
        button72.setLayoutX(734);
        button72.setLayoutY(450);
        button72.setTextFill(Color.WHITE);
        button72.setStyle("-fx-background-color: Gold");

        Button button73 = new Button("73");
        button73.setLayoutX(766);
        button73.setLayoutY(450);
        button73.setTextFill(Color.WHITE);
        button73.setStyle("-fx-background-color: Gold");


        Button button74 = new Button("74");
        button74.setLayoutX(866);
        button74.setLayoutY(450);
        button74.setTextFill(Color.WHITE);
        button74.setStyle("-fx-background-color: Gold");

        Button button75 = new Button("75");
        button75.setLayoutX(898);
        button75.setLayoutY(450);
        button75.setTextFill(Color.WHITE);
        button75.setStyle("-fx-background-color: Gold");

        Button button76 = new Button("76");
        button76.setLayoutX(930);
        button76.setLayoutY(450);
        button76.setTextFill(Color.WHITE);
        button76.setStyle("-fx-background-color: Gold");




        Button button77 = new Button("77");
        button77.setLayoutX(314);
        button77.setLayoutY(500);
        button77.setTextFill(Color.WHITE);
        button77.setStyle("-fx-background-color: Gold");


        Button button78 = new Button("78");
        button78.setLayoutX(346);
        button78.setLayoutY(500);
        button78.setTextFill(Color.WHITE);
        button78.setStyle("-fx-background-color: Gold");


        Button button79 = new Button("79");
        button79.setLayoutX(378);
        button79.setLayoutY(500);
        button79.setTextFill(Color.WHITE);
        button79.setStyle("-fx-background-color: Gold");

        Button button80 = new Button("80");
        button80.setLayoutX(478);
        button80.setLayoutY(500);
        button80.setTextFill(Color.WHITE);
        button80.setStyle("-fx-background-color: Gold");

        Button button81 = new Button("81");
        button81.setLayoutX(510);
        button81.setLayoutY(500);
        button81.setTextFill(Color.WHITE);
        button81.setStyle("-fx-background-color: Gold");

        Button button82 = new Button("82");
        button82.setLayoutX(542);
        button82.setLayoutY(500);
        button82.setTextFill(Color.WHITE);
        button82.setStyle("-fx-background-color: Gold");

        Button button83 = new Button("83");
        button83.setLayoutX(574);
        button83.setLayoutY(500);
        button83.setTextFill(Color.WHITE);
        button83.setStyle("-fx-background-color: Gold");

        Button button84 = new Button("84");
        button84.setLayoutX(606);
        button84.setLayoutY(500);
        button84.setTextFill(Color.WHITE);
        button84.setStyle("-fx-background-color: Gold");

        Button button85 = new Button("85");
        button85.setLayoutX(638);
        button85.setLayoutY(500);
        button85.setTextFill(Color.WHITE);
        button85.setStyle("-fx-background-color: Gold");

        Button button86 = new Button("86");
        button86.setLayoutX(670);
        button86.setLayoutY(500);
        button86.setTextFill(Color.WHITE);
        button86.setStyle("-fx-background-color: Gold");

        Button button87 = new Button("87");
        button87.setLayoutX(702);
        button87.setLayoutY(500);
        button87.setTextFill(Color.WHITE);
        button87.setStyle("-fx-background-color: Gold");

        Button button88 = new Button("88");
        button88.setLayoutX(734);
        button88.setLayoutY(500);
        button88.setTextFill(Color.WHITE);
        button88.setStyle("-fx-background-color: Gold");

        Button button89 = new Button("89");
        button89.setLayoutX(766);
        button89.setLayoutY(500);
        button89.setTextFill(Color.WHITE);
        button89.setStyle("-fx-background-color: Gold");

        Button button90 = new Button("90");
        button90.setLayoutX(866);
        button90.setLayoutY(500);
        button90.setTextFill(Color.WHITE);
        button90.setStyle("-fx-background-color: Gold");

        Button button91 = new Button("91");
        button91.setLayoutX(898);
        button91.setLayoutY(500);
        button91.setTextFill(Color.WHITE);
        button91.setStyle("-fx-background-color: Gold");


        Button button92 = new Button("92");
        button92.setLayoutX(930);
        button92.setLayoutY(500);
        button92.setTextFill(Color.WHITE);
        button92.setStyle("-fx-background-color: Gold");

        Button doneButton = new Button("NEXT");
        doneButton.setLayoutX(985);
        doneButton.setLayoutY(600);
        doneButton.setPrefWidth(100);
        doneButton.setPrefHeight(40);
        doneButton.setTextFill(Color.WHITE);
        doneButton.setStyle("-fx-background-color: #FF0000");

        Button backbutton1 = new Button("BACK");
        backbutton1.setLayoutX(870);
        backbutton1.setLayoutY(600);
        backbutton1.setPrefWidth(100);
        backbutton1.setPrefHeight(40);
        backbutton1.setTextFill(Color.WHITE);
        backbutton1.setStyle("-fx-background-color: #FF0000");


        Label label2 = new Label();
        label2.setText("------SILVER------");
        label2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        label2.setLayoutX(550);
        label2.setLayoutY(200);
        label2.setTextFill(Color.SILVER);

        Label label3 = new Label();
        label3.setText("------GOLD------");
        label3.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        label3.setLayoutX(559);
        label3.setLayoutY(410);
        label3.setTextFill(Color.GOLD);








                                /////////// EVENT HANDLING ////////////


        button1.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button1.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(1);
                }
                else if(j%2==0){
                    button1.setStyle(null);
                    button1.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });



        button2.setOnAction(new EventHandler<ActionEvent>() {

            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button2.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(2);
                }
                else if(j%2==0){
                    button2.setStyle(null);
                    button2.setStyle("-fx-background-color: Grey");
                    --bookingCounter;
                }

            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button3.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(3);
                }
                else if(j%2==0){
                    button3.setStyle(null);
                    button3.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button4.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(4);
                }
                else if(j%2==0){
                    button4.setStyle(null);
                    button4.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button5.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(5);
                }
                else if(j%2==0){
                    button5.setStyle(null);
                    button5.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });

        button6.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button6.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(6);
                }
                else if(j%2==0){
                    button6.setStyle(null);
                    button6.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button7.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(7);
                }
                else if(j%2==0){
                    button7.setStyle(null);
                    button7.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button8.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button8.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(8);
                }
                else if(j%2==0){
                    button8.setStyle(null);
                    button8.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button9.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(9);
                }
                else if(j%2==0){
                    button9.setStyle(null);
                    button9.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button10.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button10.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(10);
                }
                else if(j%2==0){
                    button10.setStyle(null);
                    button10.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button11.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button11.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(11);
                }
                else if(j%2==0){
                    button11.setStyle(null);
                    button11.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button12.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button12.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(12);
                }
                else if(j%2==0){
                    button12.setStyle(null);
                    button12.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button13.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button13.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(13);
                }
                else if(j%2==0){
                    button13.setStyle(null);
                    button13.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button14.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button14.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(14);
                }
                else if(j%2==0){
                    button14.setStyle(null);
                    button14.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button15.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button15.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(15);
                }
                else if(j%2==0){
                    button15.setStyle(null);
                    button15.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button16.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button16.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(16);
                }
                else if(j%2==0){
                    button16.setStyle(null);
                    button16.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button17.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button17.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(17);
                }
                else if(j%2==0){
                    button17.setStyle(null);
                    button17.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button18.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button18.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(18);
                }
                else if(j%2==0){
                    button18.setStyle(null);
                    button18.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button19.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button19.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(19);
                }
                else if(j%2==0){
                    button19.setStyle(null);
                    button19.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button20.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button20.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(20);
                }
                else if(j%2==0){
                    button20.setStyle(null);
                    button20.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button21.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button21.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(21);
                }
                else if(j%2==0){
                    button21.setStyle(null);
                    button21.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });
        button21.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button21.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(21);
                }
                else if(j%2==0){
                    button21.setStyle(null);
                    button21.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button22.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button22.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(22);
                }
                else if(j%2==0){
                    button22.setStyle(null);
                    button22.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button23.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button23.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(23);
                }
                else if(j%2==0){
                    button23.setStyle(null);
                    button23.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button24.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button24.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(25);
                }
                else if(j%2==0){
                    button24.setStyle(null);
                    button24.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button25.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button25.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(25);
                }
                else if(j%2==0){
                    button25.setStyle(null);
                    button25.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button26.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button26.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(26);
                }
                else if(j%2==0){
                    button26.setStyle(null);
                    button26.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button27.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button27.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(27);
                }
                else if(j%2==0){
                    button27.setStyle(null);
                    button27.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button28.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button28.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(28);
                }
                else if(j%2==0){
                    button28.setStyle(null);
                    button28.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button29.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button29.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(29);
                }
                else if(j%2==0){
                    button29.setStyle(null);
                    button29.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button30.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button30.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(30);
                }
                else if(j%2==0){
                    button30.setStyle(null);
                    button30.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button31.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button31.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(31);
                }
                else if(j%2==0){
                    button31.setStyle(null);
                    button31.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button32.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button32.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(32);
                }
                else if(j%2==0){
                    button32.setStyle(null);
                    button32.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button33.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button33.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(33);
                }
                else if(j%2==0){
                    button33.setStyle(null);
                    button33.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button34.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button34.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(34);
                }
                else if(j%2==0){
                    button34.setStyle(null);
                    button34.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button35.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button35.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(35);
                }
                else if(j%2==0){
                    button35.setStyle(null);
                    button35.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });
        button36.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button36.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(36);
                }
                else if(j%2==0){
                    button36.setStyle(null);
                    button36.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button37.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button37.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(37);
                }
                else if(j%2==0){
                    button37.setStyle(null);
                    button37.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button38.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button38.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(38);
                }
                else if(j%2==0){
                    button38.setStyle(null);
                    button38.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button39.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button39.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(39);
                }
                else if(j%2==0){
                    button39.setStyle(null);
                    button39.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button40.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button40.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(40);
                }
                else if(j%2==0){
                    button40.setStyle(null);
                    button40.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button41.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button41.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(41);
                }
                else if(j%2==0){
                    button41.setStyle(null);
                    button41.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button42.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button42.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(42);
                }
                else if(j%2==0){
                    button36.setStyle(null);
                    button36.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button43.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button43.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(43);
                }
                else if(j%2==0){
                    button43.setStyle(null);
                    button43.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button44.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button44.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(44);
                }
                else if(j%2==0){
                    button44.setStyle(null);
                    button44.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button45.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button45.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(45);
                }
                else if(j%2==0){
                    button45.setStyle(null);
                    button45.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button46.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button46.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(46);
                }
                else if(j%2==0){
                    button46.setStyle(null);
                    button46.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button47.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button47.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(47);
                }
                else if(j%2==0){
                    button47.setStyle(null);
                    button47.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button48.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button48.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(48);
                }
                else if(j%2==0){
                    button48.setStyle(null);
                    button48.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button49.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button49.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(49);
                }
                else if(j%2==0){
                    button49.setStyle(null);
                    button49.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button50.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button50.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(50);
                }
                else if(j%2==0){
                    button50.setStyle(null);
                    button50.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button51.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button51.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(51);
                }
                else if(j%2==0){
                    button51.setStyle(null);
                    button51.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button52.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button52.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(52);
                }
                else if(j%2==0){
                    button52.setStyle(null);
                    button52.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button53.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button50.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(53);
                }
                else if(j%2==0){
                    button53.setStyle(null);
                    button53.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button54.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button54.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(54);
                }
                else if(j%2==0){
                    button54.setStyle(null);
                    button54.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button55.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button55.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(55);
                }
                else if(j%2==0){
                    button55.setStyle(null);
                    button55.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button56.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button56.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(56);
                }
                else if(j%2==0){
                    button56.setStyle(null);
                    button56.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button57.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button57.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(57);
                }
                else if(j%2==0){
                    button57.setStyle(null);
                    button57.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button58.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button58.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(58);
                }
                else if(j%2==0){
                    button58.setStyle(null);
                    button58.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button59.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button59.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(59);
                }
                else if(j%2==0){
                    button59.setStyle(null);
                    button59.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button60.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button60.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(60);
                }
                else if(j%2==0){
                    button60.setStyle(null);
                    button60.setStyle("-fx-background-color: Grey");
                    --bookingCounter;

                }

            }
        });button61.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button61.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(61);
                }
                else if(j%2==0){
                    button61.setStyle(null);
                    button61.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button62.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button62.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(62);
                }
                else if(j%2==0){
                    button62.setStyle(null);
                    button62.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button63.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button63.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(63);
                }
                else if(j%2==0){
                    button63.setStyle(null);
                    button63.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button64.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button64.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(64);
                }
                else if(j%2==0){
                    button64.setStyle(null);
                    button64.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button65.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button65.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(65);
                }
                else if(j%2==0){
                    button65.setStyle(null);
                    button65.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button66.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button66.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(66);
                }
                else if(j%2==0){
                    button66.setStyle(null);
                    button66.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button67.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button67.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(67);
                }
                else if(j%2==0){
                    button67.setStyle(null);
                    button67.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button68.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button68.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(68);
                }
                else if(j%2==0){
                    button68.setStyle(null);
                    button68.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button69.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button69.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(69);
                }
                else if(j%2==0){
                    button69.setStyle(null);
                    button69.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button70.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button70.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(70);
                }
                else if(j%2==0){
                    button70.setStyle(null);
                    button70.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button71.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button71.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(71);
                }
                else if(j%2==0){
                    button71.setStyle(null);
                    button71.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button72.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button72.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(72);
                }
                else if(j%2==0){
                    button72.setStyle(null);
                    button72.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button73.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button73.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(73);
                }
                else if(j%2==0){
                    button74.setStyle(null);
                    button74.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button74.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button74.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(74);
                }
                else if(j%2==0){
                    button74.setStyle(null);
                    button74.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button75.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button75.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(75);
                }
                else if(j%2==0){
                    button75.setStyle(null);
                    button75.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button76.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button76.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(76);
                }
                else if(j%2==0){
                    button76.setStyle(null);
                    button76.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button77.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button77.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(77);
                }
                else if(j%2==0){
                    button77.setStyle(null);
                    button77.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button78.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button78.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(78);
                }
                else if(j%2==0){
                    button78.setStyle(null);
                    button78.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button79.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button79.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(79);
                }
                else if(j%2==0){
                    button79.setStyle(null);
                    button79.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button80.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button80.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(80);
                }
                else if(j%2==0){
                    button80.setStyle(null);
                    button80.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button81.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button81.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(81);
                }
                else if(j%2==0){
                    button81.setStyle(null);
                    button81.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button82.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button82.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(82);
                }
                else if(j%2==0){
                    button82.setStyle(null);
                    button82.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button83.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button83.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(83);
                }
                else if(j%2==0){
                    button83.setStyle(null);
                    button83.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button84.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button84.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(84);
                }
                else if(j%2==0){
                    button84.setStyle(null);
                    button84.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button85.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button85.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(85);
                }
                else if(j%2==0){
                    button85.setStyle(null);
                    button85.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button86.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button86.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(86);
                }
                else if(j%2==0){
                    button86.setStyle(null);
                    button86.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button87.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button87.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(87);
                }
                else if(j%2==0){
                    button87.setStyle(null);
                    button87.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button88.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button88.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(88);
                }
                else if(j%2==0){
                    button88.setStyle(null);
                    button88.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button89.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button89.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(89);
                }
                else if(j%2==0){
                    button89.setStyle(null);
                    button89.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button90.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button90.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(90);
                }
                else if(j%2==0){
                    button90.setStyle(null);
                    button90.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button91.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button91.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(91);
                }
                else if(j%2==0){
                    button91.setStyle(null);
                    button91.setStyle("-fx-background-color: Gold");
                    --bookingCounter;

                }

            }
        });button92.setOnAction(new EventHandler<ActionEvent>() {
            int j=0;
            @Override
            public void handle(ActionEvent actionEvent) {
                j++;
                if(j%2!=0){
                    button92.setStyle("-fx-border-color: Yellow; -fx-border-width: 0.5px;");
                    bookingCounter++;
                    arrSeatno.add(92);
                }
                else if(j%2==0){
                    button92.setStyle(null);
                    button92.setStyle("-fx-background-color: Gold");

                    --bookingCounter;

                }

            }
        });



//        BufferedWriter myWriter = new BufferedWriter(new FileWriter(new File("Bookings.txt"), true));
//        for (int i = 0; i < arrSeatno.size(); i++) {
//            myWriter.write(.get(i));
//            myWriter.newLine();
//        }


        selectionlayout.getChildren().add(label1);
        selectionlayout.getChildren().add(button1);
        selectionlayout.getChildren().add(button2);
        selectionlayout.getChildren().add(button3);
        selectionlayout.getChildren().add(button4);
        selectionlayout.getChildren().add(button5);
        selectionlayout.getChildren().add(button6);
        selectionlayout.getChildren().add(button7);
        selectionlayout.getChildren().add(button8);
        selectionlayout.getChildren().add(button9);
        selectionlayout.getChildren().add(button10);
        selectionlayout.getChildren().add(button11);
        selectionlayout.getChildren().add(button12);
        selectionlayout.getChildren().add(button13);
        selectionlayout.getChildren().add(button14);
        selectionlayout.getChildren().add(button15);
        selectionlayout.getChildren().add(button16);
        selectionlayout.getChildren().add(button17);
        selectionlayout.getChildren().add(button18);
        selectionlayout.getChildren().add(button19);
        selectionlayout.getChildren().add(button20);
        selectionlayout.getChildren().add(button21);
        selectionlayout.getChildren().add(button22);
        selectionlayout.getChildren().add(button23);
        selectionlayout.getChildren().add(button24);
        selectionlayout.getChildren().add(button25);
        selectionlayout.getChildren().add(button26);
        selectionlayout.getChildren().add(button27);
        selectionlayout.getChildren().add(button28);
        selectionlayout.getChildren().add(button29);
        selectionlayout.getChildren().add(button30);
        selectionlayout.getChildren().add(button31);
        selectionlayout.getChildren().add(button32);
        selectionlayout.getChildren().add(button33);
        selectionlayout.getChildren().add(button34);
        selectionlayout.getChildren().add(button35);
        selectionlayout.getChildren().add(button36);
        selectionlayout.getChildren().add(button37);
        selectionlayout.getChildren().add(button38);
        selectionlayout.getChildren().add(button39);
        selectionlayout.getChildren().add(button40);
        selectionlayout.getChildren().add(button41);
        selectionlayout.getChildren().add(button42);
        selectionlayout.getChildren().add(button43);
        selectionlayout.getChildren().add(button44);
        selectionlayout.getChildren().add(button45);
        selectionlayout.getChildren().add(button46);
        selectionlayout.getChildren().add(button47);
        selectionlayout.getChildren().add(button48);
        selectionlayout.getChildren().add(button49);
        selectionlayout.getChildren().add(button50);
        selectionlayout.getChildren().add(button51);
        selectionlayout.getChildren().add(button52);
        selectionlayout.getChildren().add(button53);
        selectionlayout.getChildren().add(button54);
        selectionlayout.getChildren().add(button55);
        selectionlayout.getChildren().add(button56);
        selectionlayout.getChildren().add(button57);
        selectionlayout.getChildren().add(button58);
        selectionlayout.getChildren().add(button59);
        selectionlayout.getChildren().add(button60);
        selectionlayout.getChildren().add(button61);
        selectionlayout.getChildren().add(button62);
        selectionlayout.getChildren().add(button63);
        selectionlayout.getChildren().add(button64);
        selectionlayout.getChildren().add(button65);
        selectionlayout.getChildren().add(button66);
        selectionlayout.getChildren().add(button67);
        selectionlayout.getChildren().add(button68);
        selectionlayout.getChildren().add(button69);
        selectionlayout.getChildren().add(button70);
        selectionlayout.getChildren().add(button71);
        selectionlayout.getChildren().add(button72);
        selectionlayout.getChildren().add(button73);
        selectionlayout.getChildren().add(button74);
        selectionlayout.getChildren().add(button75);
        selectionlayout.getChildren().add(button76);
        selectionlayout.getChildren().add(button77);
        selectionlayout.getChildren().add(button78);
        selectionlayout.getChildren().add(button79);
        selectionlayout.getChildren().add(button80);
        selectionlayout.getChildren().add(button81);
        selectionlayout.getChildren().add(button82);
        selectionlayout.getChildren().add(button83);
        selectionlayout.getChildren().add(button84);
        selectionlayout.getChildren().add(button85);
        selectionlayout.getChildren().add(button86);
        selectionlayout.getChildren().add(button87);
        selectionlayout.getChildren().add(button88);
        selectionlayout.getChildren().add(button89);
        selectionlayout.getChildren().add(button90);
        selectionlayout.getChildren().add(button91);
        selectionlayout.getChildren().add(button92);
        selectionlayout.getChildren().add(doneButton);
        selectionlayout.getChildren().add(label2);
        selectionlayout.getChildren().add(label3);
        selectionlayout.getChildren().add(imageView);
        selectionlayout.getChildren().add(backbutton1);



        selectionlayout.setStyle("-fx-background-color: Black");

        Scene selectionscene = new Scene(selectionlayout, 2000, 1000);

        backbutton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(showScene);
                primaryStage.show();
            }
        });


        doneButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(bookingCounter);
                System.out.println(arrSeatno);

                Receipt rbj = new Receipt(primaryStage,selectionscene,bookingCounter);
                rbj.start();

                Confirm cbj = new Confirm(arrSeatno);

            }
        });




        primaryStage.setScene(selectionscene);
        primaryStage.setMaximized(true);
        primaryStage.show();


    }




}