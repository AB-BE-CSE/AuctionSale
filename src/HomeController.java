import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private VBox pnl_scroll;
    @FXML
    private ImageView ProdPhoto;

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {
        refreshNodes();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        refreshNodes();
    }
    private void refreshNodes()
    {
        pnl_scroll.getChildren().clear();

        Node[] nodes = new  Node[15];

        for(int i = 0; i<5; i++)
        {
            try {
                nodes[i] = (Node)FXMLLoader.load(getClass().getResource("item.fxml"));
                pnl_scroll.getChildren().add(nodes[i]);

            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public void login(ActionEvent actionEvent){
        try {
            //((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = null;
            root = fxmlLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            /*pnl_scroll.getChildren().clear();
            Node node = (Node)FXMLLoader.load(getClass().getResource("Login.fxml"));
            pnl_scroll.getChildren().add(node);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }public void signUp(ActionEvent actionEvent){
        try {
            //((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = null;
            root = fxmlLoader.load(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void exit(ActionEvent actionEvent){
        System.exit(1);
    }
    public void sellProduct(ActionEvent actionEvent){
        try {
            //((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = null;
            root = fxmlLoader.load(getClass().getResource("Add_Item.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
