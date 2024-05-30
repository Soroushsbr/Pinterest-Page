package com.example.pinterest;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Page extends Application {

    @FXML
    TextField commentField;
    @FXML
    VBox vBox;
    @FXML
    Pane MainPane;


    public void addComment() throws IOException {
        String comment = commentField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Comment.fxml"));
        Pane pane = loader.load();
        ((Label) pane.getChildren().get(2)).setText(comment);
        vBox.getChildren().add(pane);
        commentField.clear();
    }
    @FXML
    Button followBtn;

    public void follow(){
        String x = followBtn.getText();
        if(x.equals("Follow")){
            followBtn.setText("Unfollow");
        }else{
            followBtn.setText("Follow");
        }
    }

    @FXML
    Button saveBtn;
    public void save(){
        String x = saveBtn.getText();
        if(x.equals("Save")){
            saveBtn.setText("Saved");
        }else{
            saveBtn.setText("Save");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        vBox.getChildren().add(MainPane);
    }
}
