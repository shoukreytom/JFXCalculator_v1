/**
 * Simple mini calculator deals with addition,subtraction,multiplication,division.
 * Created by: Shoukrey Tom
 * it's advantages:-
 *  1- it deals with any number even millions or billions.
 *  2- it deals with negative and positive numbers.
 *  3- it's not mixing between double and integer for example:
 *          if you done operation on integer the result will be integer but division depends on result.
 *  4- it provides Num-pad keys for inserting numbers and making calculations.
 *  5- it provides types of clear screen tools:-
 *          1\ "X" this delete one number backwards
 *          2\ "C" this cleans screen
 *  6- nearly there is no bug in it that leads to unexpected result
 */
package mini.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MiniCalculator extends Application {

    @Override
    public void start(Stage window) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CalculatorView.fxml"));
        window.setTitle("mini-calc");
        window.setScene(new Scene(root, 481, 552));
        window.initStyle(StageStyle.UNIFIED);
        window.setResizable(false);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}