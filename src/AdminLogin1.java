import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminLogin1 
{
    String key1="Java";
    @FXML
    private Label status1;
    @FXML
    private Button submit;
    @FXML
    private Button back;
    @FXML
    private PasswordField key;
    @FXML
    Stage stage;
    Parent root;

    @FXML
    public void adminlogin(ActionEvent event) throws Exception
    {
        if(event.getSource()==submit)
        {
            try{
                if(key.getText().equals(key1))
                {
                    stage = (Stage) submit.getScene().getWindow();
                    root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else
                {
                    status1.setText("Invalid Security Key");
                }
            }
            catch(Exception e){}
        }

    }
    @FXML
    public void adminback(ActionEvent event) throws Exception
    {
        if(event.getSource()==back)
        {
            
            stage = (Stage) back.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SystemFx.fxml"));
        
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
