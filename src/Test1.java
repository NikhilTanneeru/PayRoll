import java.util.ArrayList;
import java.util.List;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Test1 extends Application
{
    double basic=0;

    double Bonus=0;

    double hr;

    //List<Emp> li=details();

    public double calc(double basic)
    {
        double dA=(10*basic)/100;
        double Hra=(7*basic)/100;
        double gross=basic+dA+Hra;
        this.hr=dA+Hra;
        return(gross);
    }
    public static List<Emp> details()
    {
        Test1 obj = new Test1();

        Emp em = new Emp(100, "Nikhil", 1234 );
        
        em.basic=100000;
        double x=em.basic;
        double gross1=obj.calc(x);
        em.bonus=10000;
        em.gross=gross1+em.bonus;
        em.dA_hra=gross1-em.basic;
        
        Emp em2= new Emp(101, "Rahul", 1734);

        em2.basic=50000;
        double y=em2.basic;
        double gross2=obj.calc(y);
        em2.bonus=5000;
        em2.gross=gross2+em2.bonus;
        em2.dA_hra=gross1-em.basic;

        Emp em3 = new Emp(102, "Ram", 1534);

        em3.basic=40000;
        double z=em3.basic;
        double gross3=obj.calc(z);
        em3.bonus=3500;
        em3.gross=gross3+em3.bonus;
        em3.dA_hra=gross1-em.basic;


        List<Emp> li = new ArrayList<Emp>();
        li.add(em);
        li.add(em2);
        li.add(em3);
        
        
        return(li);
    }
    public static void main(String[] args) 
    {
        launch(args);
                
    }   
    @Override
    public void start(Stage arg0) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("SystemFx.fxml"));
        //root.getChildren().addAll(btn,exit);
        Scene scene = new Scene(root,400,400); //width,height
        arg0.setTitle("PayRoll Management System");
        arg0.setScene(scene);
        arg0.show();
    }
    
    //private boolean start=true; 
    
    @FXML
    private Label lbl1,lbl2;
    
    @FXML
    private Button btn1,btn2,close;
    @FXML
    Stage stage;
    Parent root;
    @FXML
    public void handleButtonAction (ActionEvent event) throws Exception {
        
       
        if(event.getSource()==btn1){
            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void handleButtonAction1 (ActionEvent event) throws Exception {
        
       
        if(event.getSource()==btn2){
            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void stop()
    {
        Platform.exit();
    }

    
    
}
