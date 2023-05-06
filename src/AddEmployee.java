import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;      
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddEmployee 
{
    @FXML
    private TextField empname;
    @FXML
    private TextField empid;
    @FXML
    private TextField pass;
    @FXML
    private TextField basic;
    @FXML
    private  Button submit;
    @FXML
    private Button back;
    @FXML
    private Label status1;
    @FXML
    Parent root;
    Stage stage;
    @FXML
    public void handlesubmit(ActionEvent event) throws Exception
    {
        Employee emp1 = new Employee();
        if(event.getSource()==submit)
        {
            String name = empname.getText();
            String eid=empid.getText();
            int id = Integer.parseInt(eid);
            String epass=pass.getText();
            int pasw = Integer.parseInt(epass);
            Emp em = new Emp(id,name, pasw);
            em.basic=Integer.parseInt(basic.getText());

            //emp1.listemp.add(em);
            emp1.addEm(em);
            //Test1.details().add(em);
            status1.setText("Added Successfully...");

            System.out.println(emp1.listemp);
            System.out.println(emp1.listemp.size());
            //System.out.println(Test1.details());
            
        }

    }
    @FXML
    public void handleback(ActionEvent event1) throws Exception
    {
        if(event1.getSource()==back){
            stage = (Stage) back.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        }
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }
        
}
