import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminMenu
{
    
    @FXML
    private Button backad;
    @FXML
    private PasswordField key;
    @FXML
    private Button viewemp;
    @FXML
    private Button addemp;
    @FXML
    Stage stage;
    Parent root;

    @FXML
    public void adminlogin12(ActionEvent event) throws Exception
    {
        if(event.getSource()==backad)
        {

            stage = (Stage) backad.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SystemFx.fxml"));
            
        }
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void viewEmp(ActionEvent event2) throws Exception
    {
        if(event2.getSource()==viewemp)
        {
            
            stage = (Stage) viewemp.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UserSec.fxml"));
        
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void addEmp(ActionEvent event3) throws Exception
    {
        if(event3.getSource()==addemp)
        {
            
            stage = (Stage) viewemp.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Admin2.fxml"));
        
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}