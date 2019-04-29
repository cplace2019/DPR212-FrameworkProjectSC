/**
Carmen Renwick, DPR212(Dsa), Week08, CalculatorFXv1
The CalculatorFX program allows users to perform basic calculation functions such as addition, substration, multiplication and division.  It provides: digit buttons,  operation buttons, a clear button and a display to show results.
 */

package calculatorfx;

import java.lang.*;
import java.lang.String;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class CalculatorFX extends Application {
    
	@Override 
	public void start(Stage primaryStage) { 

        primaryStage.setTitle("CalculatorFXv1");
        
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        TextField displaytf = new TextField("0");
        TextField value1tf = new TextField("0");
        TextField value2tf = new TextField("0");
        TextField optf = new TextField("+");
        TextField eqtf = new TextField("?");
        Label msglb = new Label("Welcome!");
        
        Button btnDivideOp = new Button("/");
        Button btnMultiplyOp = new Button("*");
        Button btnSubtractOp = new Button("-");
        Button btnAddOp = new Button("+");
        Button btnDigit9 = new Button("9");
        Button btnDigit8 = new Button("8");
        Button btnDigit7 = new Button("7");
        Button btnDigit6 = new Button("6");
        Button btnDigit5 = new Button("5");
        Button btnDigit4 = new Button("4");
        Button btnDigit3 = new Button("3");
        Button btnDigit2 = new Button("2");
        Button btnDigit1 = new Button("1");
        Button btnDigit0 = new Button("0");
        Button btnPeriod = new Button(".");
        Button btnEqual = new Button("=");
        Button btnReset = new Button("Reset");
        
        grid.add(displaytf, 0, 0, 4, 1);
        grid.add(btnDigit7, 0, 1);
        grid.add(btnDigit8, 1, 1);
        grid.add(btnDigit9, 2, 1);
        grid.add(btnDivideOp, 3, 1);
        grid.add(btnDigit4, 0, 2);
        grid.add(btnDigit5, 1, 2);
        grid.add(btnDigit6, 2, 2);
        grid.add(btnMultiplyOp, 3, 2);
        grid.add(btnDigit1, 0, 3);
        grid.add(btnDigit2, 1, 3);
        grid.add(btnDigit3, 2, 3);
        grid.add(btnSubtractOp, 3, 3);
        grid.add(btnDigit0, 0, 4);
        grid.add(btnPeriod, 1, 4);
        grid.add(btnEqual, 2, 4);
        grid.add(btnAddOp, 3, 4);
        grid.add(btnReset, 0, 5, 4, 1);
        grid.add(value1tf, 0, 6, 3, 1);
        grid.add(optf, 3, 6, 1, 1);
        grid.add(value2tf, 0, 7, 3, 1);
        grid.add(eqtf, 3, 7, 1, 1);
        grid.add(msglb, 0, 8, 4, 1);
        
        displaytf.setPrefWidth(150);   
        btnReset.setPrefWidth(150);
        value1tf.setPrefWidth(120);
        value2tf.setPrefWidth(120);
        optf.setPrefWidth(30);
        eqtf.setPrefWidth(30);
        msglb.setPrefWidth(150);
        
        displaytf.setEditable(false); 
        value1tf.setEditable(false); 
        value2tf.setEditable(false); 
        optf.setEditable(false); 
        eqtf.setEditable(false); 
  

        //Create digit button EventHandler 
        EventHandler<ActionEvent> digitbtnhandler = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent ae) {

		String displaystr = displaytf.getText();
                String digit = "0";
               
                if(ae.getSource()==btnDigit0)
                { 
                    digit = "0";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else 
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit1)
                { 
                    digit = "1";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit2)
                { 
                    digit = "2";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit3)
                { 
                    digit = "3";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit4)
                { 
                    digit = "4";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit5)
                { 
                    digit = "5";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit6)
                { 
                    digit = "6";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit7)
                { 
                    digit = "7";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit8)
                { 
                    digit = "8";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    }
                }
                else if(ae.getSource()==btnDigit9)
                { 
                    digit = "9";
                    if(displaystr.equals("0"))
                    {
                        displaytf.setText(digit);
                    }
                    else
                    {
                        displaytf.setText(displaystr + digit);
                    } 
                }
                else if(ae.getSource()==btnPeriod)
                { 
                    digit = ".";
                    if(displaystr.indexOf('.') == -1)
                    { 
                        displaytf.setText(displaystr + digit);
                    }
                }
            }
        };
        
        //Add digit button handler to button 
        btnDigit0.setOnAction(digitbtnhandler);  
        btnDigit1.setOnAction(digitbtnhandler);  
        btnDigit2.setOnAction(digitbtnhandler);  
        btnDigit3.setOnAction(digitbtnhandler);  
        btnDigit4.setOnAction(digitbtnhandler);  
        btnDigit5.setOnAction(digitbtnhandler);  
        btnDigit6.setOnAction(digitbtnhandler);  
        btnDigit7.setOnAction(digitbtnhandler);  
        btnDigit8.setOnAction(digitbtnhandler);  
        btnDigit9.setOnAction(digitbtnhandler);  
        btnPeriod.setOnAction(digitbtnhandler); 


		//Create op button EventHandler 
        EventHandler<ActionEvent> opbtnhandler = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent ae) {

                String lastOp = "+";
                String displaystr = displaytf.getText();

                if(ae.getSource()==btnAddOp)
                { 
                    lastOp = "+"; 
                }
                else if(ae.getSource()==btnSubtractOp)
                { 
                    lastOp = "-"; 
                }
                else if(ae.getSource()==btnMultiplyOp)
                { 
                    lastOp = "*"; 
                }
                else if(ae.getSource()==btnDivideOp)
                { 
                    lastOp = "/"; 
                }
                
                value1tf.setText(displaystr);
                displaytf.setText("0");
                optf.setText(lastOp);

            }
        };
   
        //Add op button handler to button 
        btnAddOp.setOnAction(opbtnhandler);
        btnSubtractOp.setOnAction(opbtnhandler);  
        btnMultiplyOp.setOnAction(opbtnhandler);  
        btnDivideOp.setOnAction(opbtnhandler);  
        

        //Create equal button EventHandler 
        EventHandler<ActionEvent> eqbtnhandler = new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent ae) {

                double val1 = 0;
                double val2 = 0;
                double lastVal = 0;
                String eq = "="; 
                String opStr = optf.getText(); 
                String displayStr = displaytf.getText();  

                value2tf.setText(displayStr);
                displaytf.setText("0");
                eqtf.setText(eq);
               
                val1 = Double.parseDouble(value1tf.getText()); 
                val2 = Double.parseDouble(value2tf.getText()); 
            
                if (opStr.equals("+")) 
                {
                    lastVal = val1 + val2;
                    displaytf.setText("" + lastVal);
                }           
                else if (opStr.equals("-")) 
                {
                    lastVal = val1 - val2;
                    displaytf.setText("" + lastVal);
                }
                else if (opStr.equals("*")) 
                {
                    lastVal = val1 * val2;
                    displaytf.setText("" + lastVal);
                }
                else if (opStr.equals("-")) 
                {
                    lastVal = val1 - val2;
                    displaytf.setText("" + lastVal);
                }
                else if (opStr.equals("*")) 
                {
                    lastVal = val1 * val2;
                    displaytf.setText("" + lastVal);
                }
                else if (opStr.equals("/")) 
                {
                    if (val2 == 0) 
                    {
                        lastVal = val1;
                        displaytf.setText("" + lastVal);
                        msglb.setText("Dividing by 0!");
                    }
                    lastVal = val1 / val2;
                    displaytf.setText("" + lastVal);
                }
            }
        };   

        //Add equal button handler to button 
        btnEqual.setOnAction(eqbtnhandler); 


        //Create reset button EventHandler 
        EventHandler<ActionEvent> resetbtnhandler = new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent ae) {

                displaytf.setText("0");
                value1tf.setText("0");
                value2tf.setText("0");
                optf.setText("+");
                eqtf.setText("?");
                msglb.setText("Welcome!");
                
            }
        };

        //Add reset button handler to button 
        btnReset.setOnAction(resetbtnhandler); 

        Scene scene = new Scene(grid, 250, 400);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
                
    }

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
