/**
 * Author: Jude Kallista-Fitzpatrick
 * @author jsk2319@email.vccs.edu
 * The correct username and password are set.
 * The application will prompt the user to input the username and password.
 * The application will then read the user's input.
 * If the input is correct, the application will say "Welcome, Jude."
 * If the input is wrong, the application will say "You entered the wrong username or password!"
 */


import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Login extends Application {

    public void start(Stage primaryStage) {

        final String username = "Jude";
        final String password = "NOVA";

        TextInputDialog firstInput = new TextInputDialog("username");
        firstInput.setTitle("Login");
        firstInput.setContentText("Enter your username");
        Optional<String> uInput = firstInput.showAndWait();
        String userInput = uInput.get();

        TextInputDialog secondInput = new TextInputDialog("password");
        secondInput.setTitle("Login");
        secondInput.setContentText("Enter your password");
        Optional<String> pInput = secondInput.showAndWait();
        String passInput = pInput.get();

        if (userInput.equals(username) && passInput.equals(password)) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setContentText("Welcome, Jude.");
        alert.showAndWait();


        } else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setContentText("You entered the wrong username or password!");
            alert.showAndWait();
        }

        }

    }
