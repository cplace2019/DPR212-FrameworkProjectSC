Readme

0FD: FRAMEWORK DEVELOPMENT PHASE

For the initial phase of my  Framework Development,  I read how to get started with JavaFX to begin the development for my 
CalculatorFX application.   The source code, the freedcamp file  and a screenshot of the JavaFX application for this phase is included in this phase's branch on Github.  The following sections provides instructions to get started.


THE FRAMEWORK PROJECT OVERVIEW

For this framework project, I used one of Java's client technologies: JavaFX to create a calculator program.  

JavaFX is Java's next-generation client platform and GUI framework that provides a powerful, streamlined, flexible framework which simplifies the creation of modern, visually exciting GUIs.

The CalculatorFX program allows users to perform basic calculation functions such as addition, substration, multiplication and division.  It provides the following:  digit buttons,  operation buttons, a clear button and a display to show results.  

GETTING UP AND RUNNING 
 
To get the CalculatorFX program up and running first you need to set up the JavaFX application environment (see P1 below).   then you need to create a CalculatorFX project in the NetBean IDE (see P2 below).   Afterward, you can compile and run the CalculatorFX program (see P3 below). 


P1: SETTING UP THE JAVAFX APPLICATION ENVIRONMENT

Before you can run the CalculatorFX program, you need to have the JavaFX runtime libraries on your machine.   

To get the JavaFX runtime libraries install the latest version of JDK8 on your machine.

https://www.oracle.com/technetwork/java/javase/downloads/index.html

Next, you need a Java development IDE to compile and run the CalculatorFX source code.    The integrated development environment (IDE) I used which has support for JavaFX applications is NetBean.   So, you will need to download and install   NetBean 8.2.  

https://www.oracle.com/technetwork/java/javase/downloads/index.html

For help, check the oracle documents online for assistance.

https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html


P2: CREATING A CALCULATORFX PROJECT IN THE NETBEAN IDE.

To run the CalculatorFX program  in an IDE, i have provided the CalculatorFX source code which needs to be compiled from within a NetBean JavaFX Application project.

1. Download the CalculatorFX source code to your machine inside the following windows folder structure created in the NetBean document folder:
CalculatorFX/src/calculatorfx.

Go to the NetBean document folder on your machine.
FIRST:  create a folder called CalculatorFX in the NetBean document folder.
SECOND, create a folder called src inside the CalculatorFX folder.
THIRD: create a folder called calculatorfx inside the src folder.
The calculatorfx is the package folder declared in the source code.  Place the CalculatorFX source code in the calculatorfx package folder.

2. Launch the NetBean IDE on your machine.
3. From the file menu, choose new project.
4. In the JavaFX application category, choose JavaFX Application from existing source code.
5. Name the project CalculatorFX and click Next.
6. When you get to step asking for your existing source code, select Browse to locate the CalculatorFX folder created in step 1 above, and click Next.  
7.  Verify that the existing source code was found in the src folder.  If correct, click Next.  If not correct, fix your folder structure to match the folder structure  created in Step 1.  Go back to the step asking for your existing source code.  Browse to the  CalculatorFX folder, reselect it and click Next to get back to this step.
7.  Accept the defaults for all other steps and click Next until you get to step with the Finish.
8. Click Finish to create the project.


P3: COMPILING AND RUNNING THE CALCULATORFX PROGRAM

1. Once the project is created, right-click on the CalculatorFX project in the File view, and select Compile.
2. Wait for the CalculatorFX project to finish compiling, and 
right-click on the CalculatorFX project in the File view, and select Run.
3. Wait for the CalculatorFX program to launch in a Java runtime window, and select the Java runtime window for the CalculatorFX program.
4. Enter the first number by clicking on the digit buttons (for instance 100).
5. Enter the operation by clicking on a operator button (for instance the * for multiplication).
6. Enter the second number by clicking on the digit buttons (for instance 5).
7. Select the equal button by clicking on a = button.
8.  Wait for the display to update to show the answer.
9.  Click on the Reset button to enter new numbers, wait for reset to finish, repeat steps 4 through 8 above.


 -Carmen