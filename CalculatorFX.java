/**
Carmen Renwick, DPR212(Dsa)
/**
Carmen Renwick, DPR212(Dsa), CalculatorFXv3
The CalculatorFX program allows users to perform basic calculation functions such as addition, substration, multiplication and division.  It provides: digit buttons,  operation buttons, a clear button and a display to show results. 

Contributions: CalculatorFXv0, CalculatorFXv1, CalculatorFXv2, CalculatorFXv3 
 */

package calculatorfx;

import java.lang.*;
import java.lang.String;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class CalculatorFX extends Application {
    
    //variables used by multiple methods
    private String val1str = "0";
    private String val2str = "0";
    private String lastOp = "?";
    private String lastEq = "?";
    
    //variables used for effects on buttons
    InnerShadow innerShadowOp = new InnerShadow(20.0,  Color.GREEN);
    InnerShadow innerShadowDigit = new InnerShadow(20.0,  Color.BLUE);
    InnerShadow innerShadowEq = new InnerShadow(40.0,  Color.MAGENTA);
    InnerShadow innerShadowReset = new InnerShadow(30.0,  Color.ORANGE);

    @Override 
    public void start(Stage primaryStage) { 

        // Use a border pane as the root for scene

        BorderPane border = new BorderPane();
        
        //Add HBox and GridPane to the BorderPane via method calls
        border.setTop(addHBox());
        border.setCenter(addGridPane());
        border.setBottom(null);
        border.setLeft(null);
        border.setRight(null);
        
        Scene scene = new Scene(border, 250, 350);
        
        //Set the primaryStage and properties
        primaryStage.setScene(scene);
        primaryStage.setTitle("CalculatorFXv3");
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.show();

	}


        /**
	Create an HBox with text control for top region of border pane
	*/
    
        public HBox addHBox() {
 
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 25, 0, 25));
        hbox.setStyle("-fx-background-color:green;");
        
        Text titleTxt = new Text("CalculatorFX 3.0");
	titleTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
	titleTxt.setFill(Color.WHITE);
        
        hbox.getChildren().addAll(titleTxt);
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.setHgrow(titleTxt, Priority.ALWAYS);

        return hbox;
    }
    

        /**
	Create a GridPane with grid  for center region of border pane  
	*/

	public GridPane addGridPane() {

        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        grid.setStyle("-fx-background-color:Gray; -fx-font-family:Courier");
        
        TextField displaytf = new TextField("0");
        Label loglb = new Label("");
        Label msglb = new Label("Welcome!");
        	
   
        Image imageAddBtn = new Image(getClass().getResourceAsStream("imgaddbtn.jpg"));
        Image imageSubtractBtn = new Image(getClass().getResourceAsStream("imgsubtractbtn.jpg"));
        Image imageMultipleBtn = new Image(getClass().getResourceAsStream("imgmultiplebtn.jpg"));
        Image imageDivideBtn = new Image(getClass().getResourceAsStream("imgdividebtn.jpg"));
        
        Button btnDivideOp = new Button("/", new ImageView(imageDivideBtn));
        Button btnMultiplyOp = new Button("*", new ImageView(imageMultipleBtn));
        Button btnSubtractOp = new Button("-", new ImageView(imageSubtractBtn));
        Button btnAddOp = new Button("+", new ImageView(imageAddBtn));
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
        
        btnDivideOp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnMultiplyOp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnSubtractOp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnAddOp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnDigit0.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnPeriod.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnEqual.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

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
	grid.add(loglb, 0, 5, 4, 1);
        grid.add(msglb, 0, 6, 4, 1);
        grid.add(btnReset, 0, 7, 4, 1);

        btnPeriod.setEffect(innerShadowDigit);
        btnDigit0.setEffect(innerShadowDigit);
        btnDigit1.setEffect(innerShadowDigit);
        btnDigit2.setEffect(innerShadowDigit);
        btnDigit3.setEffect(innerShadowDigit);
        btnDigit4.setEffect(innerShadowDigit);
        btnDigit5.setEffect(innerShadowDigit);
        btnDigit6.setEffect(innerShadowDigit);
        btnDigit7.setEffect(innerShadowDigit);
        btnDigit8.setEffect(innerShadowDigit);
        btnDigit9.setEffect(innerShadowDigit);
        btnAddOp.setEffect(innerShadowOp);
        btnSubtractOp.setEffect(innerShadowOp);
        btnMultiplyOp.setEffect(innerShadowOp);
        btnDivideOp.setEffect(innerShadowOp);
        btnEqual.setEffect(innerShadowEq);
        btnReset.setEffect(innerShadowReset);
        
        displaytf.setPrefWidth(200); 
        displaytf.setEditable(false); 
        displaytf.setStyle("-fx-background-color:White; -fx-border-color:darkgray; -fx-alignment:BOTTOM-RIGHT;");

        btnReset.setPrefWidth(200);
        btnReset.setStyle("-fx-font-family:Tahoma");

        loglb.setPrefWidth(200);
        loglb.setStyle("-fx-background-color:yellow;-fx-alignment:CENTER; -fx-font-size:8pt");

        msglb.setPrefWidth(200);
        msglb.setStyle("-fx-background-color:lime; -fx-alignment:CENTER; -fx-font-size:8pt");
        

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
                
                val1str = displaystr;
                displaytf.setText("0");
                val1str = Double.toString(Double.parseDouble(val1str));
                loglb.setText(val1str + " " + lastOp );
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
                String lastValstr = "0";
                String displaystr = displaytf.getText();  

                if (lastOp.equals("?")) 
                {   
                    lastEq = "="; 
                    val2str = displaystr;
                    val2str = Double.toString(Double.parseDouble(val2str));
                    val1str = Double.toString(Double.parseDouble(val1str));
                    loglb.setText(val1str + " " + lastOp + " " + val2str + " " + lastEq );
                    msglb.setText("Operator Error!");
                    val1str = "0"; 
                    val2str = "0";
                    displaytf.setText("0");
                    lastOp = "?"; 
                    lastEq = "?"; 
                }
                else if (lastOp.equals("/") && displaystr.equals("0")) 
                    
                {   
                    lastEq = "=";
                    val2str = displaystr;
                    val2str = Double.toString(Double.parseDouble(val2str));
                    val1str = Double.toString(Double.parseDouble(val1str));
                    loglb.setText(val1str + " " + lastOp + " " + val2str + " " + lastEq );
                    msglb.setText("Div by 0 Error!");
                    val1str = "0"; 
                    val2str = "0"; 
                    displaytf.setText("0");
                    lastOp = "?"; 
                    lastEq = "?"; 
                }
                else 
                {   
                    lastEq = "=";
                    val2str = displaystr;
                    msglb.setText("Processing...");
                    val1 = Double.parseDouble(val1str); 
                    val2 = Double.parseDouble(val2str); 
                    lastVal = calculate(val1, val2, lastOp);
                    val1str = Double.toString(val1); 
                    val2str = Double.toString(val2); 
                    lastValstr = Double.toString(lastVal); 
                    displaytf.setText(lastValstr);
                    loglb.setText(val1str + " " + lastOp + " " + val2str + " " + lastEq + " " + lastValstr);
                    msglb.setText("Done!");
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
                val1str = "0";
                val2str = "0";
                lastOp = "?";
                lastEq = "?";
                loglb.setText("");
                msglb.setText("Reset Complete!");
                
            }
        };

        //Add reset button handler to button 
        btnReset.setOnAction(resetbtnhandler); 

        return grid;
                
    }


    /**
      Combines two values with an operator.
      @param value1 the first value
      @param value2 the second value
      @param op an operator (+, -, *, /)
    */
    public double calculate(double value1, double value2, String op)
    {  
	if (op.equals("+")) 
        {
            return value1 + value2;
        }
        else if (op.equals("-")) 
        {
            return value1 - value2;
        }
        else if (op.equals("*")) 
        {
            return value1 * value2;
	}
        else if (op.equals("/")) 
        {
            if (value2 == 0) 
            {   
                return 0;
            }
            else
            {
                return value1 / value2;
            }
        }
        else
        {
            return 0;
        }
    }

    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
