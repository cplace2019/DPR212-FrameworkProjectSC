/**
Carmen Renwick, DPR212(Dsa)
CalculatorFXv0
The CalculatorFX program allows users to perform basic calculation functions such as addition, substration, multiplication and division.  It provides: digit buttons,  operation buttons, a clear button and a display to show results.  
 */

package calculatorfx;

import java.util.*;
import java.lang.*;
//import java.lang.String;
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

        primaryStage.setTitle("CalculatorFXv0");
        
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        TextField display = new TextField("");
        TextField value1 = new TextField("");
        TextField value2 = new TextField("");
        TextField opSelNotEq = new TextField("");
        TextField opSelEq = new TextField("");
        TextField msg = new TextField("");
        
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
        Button btnEqualOp = new Button("=");
        Button btnClear = new Button("Clear");
        
        grid.add(display, 0, 0, 4, 1);
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
        grid.add(btnEqualOp, 2, 4);
        grid.add(btnAddOp, 3, 4);
        grid.add(btnClear, 0, 5, 4, 1);
        grid.add(value1, 0, 6, 3, 1);
        grid.add(opSelNotEq, 3, 6, 1, 1);
        grid.add(value2, 0, 7, 3, 1);
        grid.add(opSelEq, 3, 7, 1, 1);
        grid.add(msg, 0, 8, 4, 1);
        
        display.setPrefWidth(150);   
        btnClear.setPrefWidth(150);
        value1.setPrefWidth(120);
        value2.setPrefWidth(120);
        opSelNotEq.setPrefWidth(30);
        opSelEq.setPrefWidth(30);
        msg.setPrefWidth(150);
        
        display.setEditable(false); 
        value1.setEditable(false); 
        value2.setEditable(false); 
        opSelNotEq.setEditable(false); 
        opSelEq.setEditable(false); 
        msg.setEditable(false);
        
        //Create EventHandler 
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent ae) {

                double val1 = 0;
                double val2 = 0;
                double lastValue = 0;
                String lastOp = "+";
                String op = "+";
                String btnGrp = "clBtn";
                String digit = "0";
               
                if(ae.getSource()==btnDigit0)
                { 
                        digit = "0"; 
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit1)
                { 
                        digit = "1";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit2)
                { 
                        digit = "2";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit3)
                { 
                        digit = "3";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit4)
                { 
                        digit = "4";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit5)
                { 
                        digit = "5";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit6)
                { 
                        digit = "6";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit7)
                { 
                        digit = "7";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit8)
                { 
                        digit = "8";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnDigit9)
                { 
                        digit = "9";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnPeriod)
                { 
                        digit = ".";
                        btnGrp  = "dgBtn";
                }
                else if(ae.getSource()==btnAddOp)
                { 
                        lastOp = "+"; 
                        btnGrp  = "opBtn";
                }
                else if(ae.getSource()==btnSubtractOp)
                { 
                        lastOp = "-"; 
                        btnGrp  = "opBtn";
                }
                else if(ae.getSource()==btnMultiplyOp)
                { 
                        lastOp = "*"; 
                        btnGrp  = "opBtn";
                }
                else if(ae.getSource()==btnDivideOp)
                { 
                        lastOp = "/"; 
                        btnGrp  = "opBtn";
                }
                else if(ae.getSource()==btnEqualOp)
                { 
                        lastOp = "="; 
                        btnGrp  = "opBtn";
                }
                else if(ae.getSource()==btnClear)
                { 
                        btnGrp  = "clBtn";
                }
                

                if(btnGrp  == "dgBtn")
                {
                   display.setText(display.getText() + digit);
                }
                else if (btnGrp  == "opBtn")
                {
                    
                    if (display.getText() != "" && lastOp != "=")
                    {  
                        value1.setText(display.getText());
                        opSelNotEq.setText(lastOp); 
                        display.setText("");
                    }
                    else if (display.getText() != "" && lastOp == "=")
                    {  
                        value2.setText(display.getText());
                        opSelEq.setText(lastOp);
                        display.setText("");
                        
                        if (value2.getText() == "" || value2.getText() == "" || opSelNotEq.getText() == "")
                        {
                            msg.setText("ERROR: Missing Information!");
                            
                        }
                        else if (value1.getText() != "" && value2.getText() != "" && opSelNotEq.getText() != "" )
                        {
                            op = opSelNotEq.getText();
                            val1 = Double.parseDouble(value1.getText()); 
                            val2 = Double.parseDouble(value2.getText()); 
                        
                            if (op.equals("+")) 
                            {
                                lastValue = val1 + val2;
                                display.setText("" + lastValue);
                            }
                            else if (op.equals("-")) 
                            {
                                lastValue = val1 - val2;
                                display.setText("" + lastValue);
                            }
                            else if (op.equals("*")) 
                            {
                                lastValue = val1 * val2;
                                display.setText("" + lastValue);
                            }
                            else if (op.equals("/")) 
                            {
                                 if (val2 == 0) 
                                {
                                    lastValue = val1;
                                    display.setText("" + lastValue);
                                }
                                lastValue = val1 / val2;
                                display.setText("" + lastValue);
                            }
                        }
                        
                    }
                    
                }
                else if(btnGrp  == "clBtn" )
                { 
                    val1= 0;
                    val2= 0;
                    lastValue = 0;
                    lastOp = "+";
                    op = "+";
                    digit = "0";
                    display.setText("");
                    value1.setText("");
                    value2.setText("");
                    opSelNotEq.setText("");
                    opSelEq.setText("");

                }
            }   
        };
        
        //Add handler to button 
        btnDigit0.setOnAction(handler);  
        btnDigit1.setOnAction(handler);  
        btnDigit2.setOnAction(handler);  
        btnDigit3.setOnAction(handler);  
        btnDigit4.setOnAction(handler);  
        btnDigit5.setOnAction(handler);  
        btnDigit6.setOnAction(handler);  
        btnDigit7.setOnAction(handler);  
        btnDigit8.setOnAction(handler);  
        btnDigit9.setOnAction(handler);  
        btnPeriod.setOnAction(handler); 
        btnAddOp.setOnAction(handler);
        btnSubtractOp.setOnAction(handler);  
        btnMultiplyOp.setOnAction(handler);  
        btnDivideOp.setOnAction(handler);  
        btnEqualOp.setOnAction(handler);  
        btnClear.setOnAction(handler); 

        Scene scene = new Scene(grid, 250, 400);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
