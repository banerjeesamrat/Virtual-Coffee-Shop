package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;


import javax.swing.text.View;
//import javax.swing.text.html.ListView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    @FXML
    public TextArea lview;
    public ArrayList<Coffee> details = new ArrayList<Coffee>();
    @FXML
    Button caramel_btn;
    @FXML
    Button instant_btn;
    @FXML
    Button filter_btn;
    @FXML
    Button cream_btn;
    @FXML
    Button milk_btn;
    @FXML
    Button next_btn;
    Coffee test;
    StringBuffer random = new StringBuffer();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        lview.setEditable(false);


        //caramel_btn.setOnAction(e-> System.out.println("HeLLO!"));

        instant_btn.setOnAction(event -> test = new Instant());


        caramel_btn.setOnAction(event -> {

            test = new Caramel(test);
            System.out.println(test.getDescription() + " " + test.cost());

        });


        filter_btn.setOnAction(event -> test = new Filter());


        cream_btn.setOnAction(event -> test = new Cream(test));


        milk_btn.setOnAction(event -> test = new Milk(test));


        next_btn.setOnAction(event -> {

            details.add(test);


            ArrayList<Coffee> dummy = new ArrayList<Coffee>();
            dummy.add(test);

            for (Coffee sample : dummy) {

                lview.appendText("\n" + sample.getDescription() + "  " + sample.cost());
            }


        });
    }
}








