import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class calcGUI extends Application
{
    public static void main(String[] args)
    {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Button buttonOne = new Button(); //Creates a button
        buttonOne.setText("Hello World"); //Gives the button the Hello World text

        StackPane layout = new StackPane();
        layout.getChildren().add(buttonOne);
    }
}
