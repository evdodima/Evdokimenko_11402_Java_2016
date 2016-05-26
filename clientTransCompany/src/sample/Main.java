package sample;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.stage.Stage;
import sample.controllers.AbstractController;

import java.io.IOException;


public class Main extends Application {

   // private Scene mainScene;
    private Stage currentStage;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        currentStage = primaryStage;
        currentStage.setTitle("TransCompany");
        changeScene("LoginPage");
    }




    public void changeScene(String sceneName){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scenes/"+sceneName+".fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AbstractController controller = loader.getController();
        controller.setApp(this);

        currentStage.setScene(new Scene(root));
        currentStage.show();
    }

}