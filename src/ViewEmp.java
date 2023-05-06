import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewEmp 
{
    @FXML
    private Button submit;
    @FXML
    private TextField emid;
    @FXML
    private Button userback;
    @FXML
    private Label name;
    @FXML
    private Label bassal;
    @FXML
    private Label gross12;
    @FXML
    private Label bonus;
    @FXML
    private Label dahra;
    @FXML
    Stage stage;
    Parent root;
    
    @FXML
    public void handlebackBtn (ActionEvent event1) throws Exception {
        
       
        if(event1.getSource()==userback){
            stage = (Stage) userback.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        }
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    } 
    @FXML
    public void handleSubmit(ActionEvent event) throws Exception
    {
        if(event.getSource()==submit)
        {
            Employee emp1 = new Employee();
            List<Emp>  array=emp1.listemp;
            for(int i=0;i<array.size();i++)
            {
                
                int id2 = array.get(i).id;
                String id3=""+id2;
                if(emid.getText().equals(id3))
                {
                    name.setText(array.get(i).name);
                    gross12.setText(""+array.get(i).gross);
                    bassal.setText(""+array.get(i).basic);
                    bonus.setText(""+array.get(i).bonus);
                    dahra.setText(""+array.get(i).dA_hra);
                }
            }
            System.out.println(array);
        }
    }
}
