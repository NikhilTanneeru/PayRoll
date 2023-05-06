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


public class User
{
    int id;
    int pass;
    int temp;
    boolean u=false;
    @FXML
    private Label status;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button loginbtn;
    @FXML
    private Button userback;

    
    @FXML
    Stage stage;
    Parent root;
    @FXML
    public void Login(ActionEvent event) throws Exception
    {
        List<Emp>  array=Test1.details();
        for(int i=0;i<array.size();i++)
        {
            
            int id2 = array.get(i).id;
            String id3=""+id2;

            int pass1 = array.get(i).pass;
            String pass2 = ""+pass1;
            if(event.getSource()==loginbtn)
            {
                try
                {
                    if(username.getText().equals(id3) && password.getText().equals(pass2))
                    {   

                        status.setText("Login Success");
                        
                        id=id2;
                        pass=pass1;
                        u=true;
                        System.out.println(Test1.details());
                        temp=i;
                        stage = (Stage) loginbtn.getScene().getWindow();
                        root = FXMLLoader.load(getClass().getResource("UserLast.fxml"));
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                    else
                    {
                        status.setText("Login Failed");
                    }

                }
               catch(Exception e)
                {
                    status.setText("Login Failed");
                }
            }
        }

    }


    @FXML
    public void handleUserMain (ActionEvent event) throws Exception
    {
        boolean x=false;
        List<Emp> ar=Test1.details();
        for(int j=0;j<ar.size();j++)
        {
            if(ar.get(j).id==id)
            {
                if(ar.get(j).pass==pass)
                {
                    //String gross1=""+ar.get(j).gross;
                    //gross12.setText("Gross");
                    // System.out.println(ar.get(j));
                    // System.out.println("Net Salary:"+ar.get(j).gross);
                    // x=true;
                }
                else
                {
                    System.out.println("Wrong Password...Try Again");
                    x=true;
                }
            }
    
        }
        if(!x)
        {
            status.setText("Enter Valid Credentials");
        }
    }
    @FXML
    private Button back1;
    @FXML
    public void handleButtonAction3 (ActionEvent event) throws Exception {
        
       
        if(event.getSource()==back1){
            stage = (Stage) back1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SystemFx.fxml"));
        }
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }   
}
