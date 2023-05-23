package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;


public class RestaurantController{

    @FXML
    ImageView Img1, Img2, Img3, Img4, Img5; 

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Chowking chowking = new Chowking();
    Jollibee jollibee = new Jollibee();
    KFC kfc = new KFC();
    MangInasal mangInasal = new MangInasal(); 
    Mcdo mcdo = new Mcdo(); 


    public void initialize() {

        chowking.setbestSeller("ChaoFan");
        chowking.setRatings("5 out of 5");

        jollibee.setbestSeller("Chicken Joy");
        jollibee.setRatings("5 out of 5");


        kfc.setbestSeller("Fun Shots");
        kfc.setRatings("5 out of 5");


        mangInasal.setbestSeller("Halo Halo");
        mangInasal.setRatings("5 out of 5");

        mcdo.setbestSeller("Chicken Ala king");
        mcdo.setRatings("5 out of 5");

        
    
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Jollibee's best seller is  " + jollibee.getbestSeller() + " and " + jollibee.getRatings());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mang Inasal best seller is " + mangInasal.getbestSeller() + " and " + mangInasal.getRatings());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Chowking best seller is " + chowking.getbestSeller() + " and " + chowking.getRatings());
        }
        if (sourceButton == btn4) {
            alert.setContentText("KFC best seller is " + kfc.getbestSeller() + " and " + kfc.getRatings());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Mcdo best seller is " + mcdo.getbestSeller() + " and " + mcdo.getRatings());
        }

        alert.showAndWait();

    }

}