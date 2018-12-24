import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.prism.impl.QueuedPixelSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Queue;

public class LoginController {

    @FXML
    private StackPane stackPane;

    @FXML
    private AnchorPane root;

    @FXML
    private Label loginText;

    @FXML
    private JFXTextField user_name_input;

    @FXML
    private JFXPasswordField password_input;

    @FXML
    private JFXButton fermer;

    @FXML
    private JFXButton connecter;

    @FXML
    private Pane imagePanel;

    @FXML
    void Fermer(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();
    }
    @FXML
    void Connecter(ActionEvent event){
            try {
                if(user_name_input.getText().equals("Hacene")&& password_input.getText().equals("12345")) {
                    ((Node)event.getSource()).getScene().getWindow().hide();
                    Stage primaryStage = new Stage();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    Pane root = fxmlLoader.load(getClass().getResource("SignUp.fxml"));
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }
                else{
                    user_name_input.setText("inputs incorrect");
                    password_input.setText("inputs incorrect");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


