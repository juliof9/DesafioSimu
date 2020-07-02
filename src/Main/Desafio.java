/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Julio Flores
 */
public class Desafio extends Application {
    //Pantallas
    Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10,
            scene11,scene12,scene13,scene14,scene15,scene16, scene17, scene18,scene19,scene20,
            scene21,scene22;
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        //Title
        primaryStage.setTitle("Desafío");    
        
        //Scene 1
        Label label1 = new Label("BIENVENIDO AL METODO DE LOS ELEMENTOS FINITOS EN 3D (MEF)");
        label1.setStyle("-fx-text-fill: #FFFFFF;"
                + "-fx-font:  normal bold 2em 'sans-serif'");
        Button btn1 = new Button("Comencemos");
        btn1.setStyle("-fx-background-color: #2DEB29; "
                + "-fx-font: bold 2em 'sans-serif'; "
                + "-fx-text-fill: #000000");
        btn1.setOnAction(e -> primaryStage.setScene(scene2));
        VBox layout1 = new VBox(45);
        layout1.setAlignment(Pos.CENTER);
        layout1.setStyle("-fx-background-color: #404A7C");
        layout1.getChildren().addAll(label1,btn1);
        label1.setLayoutY(250);
        scene1 = new Scene(layout1, 1000, 600);
        
        //Scene 2
        Label texto = new Label("Definicion del modelo");
        texto.setLayoutX(350);
        texto.setLayoutY(65);
        texto.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        //Cambiar a la ruta de tu compu por favor
        Image image = new Image(new FileInputStream("C:\\Users\\giron\\OneDrive\\Documentos\\NetBeansProjects\\Desafio\\src\\images\\Modelo.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(30);
        imageView.setY(180);
        imageView.setFitHeight(225);
        imageView.setFitWidth(600);
        
        Label desc1 = new Label("Primero se tiene un modelo sobre\nel cual sera aplicado el Metodo de\nlos elementos finitos (MEF).");
        desc1.setLayoutX(650);
        desc1.setLayoutY(250);
        desc1.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn2 = new Button("Siguiente");
        btn2.setLayoutY(500);
        btn2.setLayoutX(850);
        btn2.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn2.setOnAction(e -> primaryStage.setScene(scene3));
        Pane layout2 = new Pane();
        layout2.getChildren().addAll(texto,btn2,imageView, desc1);
        layout2.setStyle("-fx-background-color: #404A7C");
        scene2 = new Scene(layout2, 1000, 600);
        
        //Scene 3
        Label label3 = new Label("Definicion del Dominio");
        label3.setLayoutX(350);
        label3.setLayoutY(65);
        label3.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image2 = new Image(new FileInputStream("C:\\Users\\giron\\OneDrive\\Documentos\\NetBeansProjects\\Desafio\\src\\images\\Dominio.png"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setX(30);
        imageView2.setY(150);
        imageView2.setFitHeight(300);
        imageView2.setFitWidth(600);
        
        Button btn3 = new Button("Siguiente");
        btn3.setLayoutY(500);
        btn3.setLayoutX(850);
        btn3.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Label desc2 = new Label("Definir un Dominio es especificar\nla figura sobre la que se aplicara el MEF,\npara este caso se tomara como ejemplo\nun paralelepipedo.");
        desc2.setLayoutX(650);
        desc2.setLayoutY(250);
        desc2.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        btn3.setOnAction(e -> primaryStage.setScene(scene4));
        Pane layout3 = new Pane();
        layout3.getChildren().addAll(label3, btn3, imageView2, desc2);
        layout3.setStyle("-fx-background-color: #404A7C");
        scene3 = new Scene(layout3, 1000, 600);

        //Scene 4
        Label label4 = new Label("Condiciones de contorno a aplicar");
        label4.setLayoutX(350);
        label4.setLayoutY(65);
        label4.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image3 = new Image(new FileInputStream("C:\\Users\\giron\\OneDrive\\Documentos\\NetBeansProjects\\Desafio\\src\\images\\Condiciones.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setX(30);
        imageView3.setY(150);
        imageView3.setFitHeight(300);
        imageView3.setFitWidth(600);
        
        Button btn4 = new Button("Siguiente");
        btn4.setOnAction(e -> primaryStage.setScene(scene5));
        Pane layout4 = new Pane();
        layout4.getChildren().addAll(label4, btn4, imageView3);
        layout4.setStyle("-fx-background-color: #404A7C");
        scene4 = new Scene(layout4, 1000, 600);   
        
        Label desc3 = new Label("");
        desc3.setLayoutX(650);
        desc3.setLayoutY(250);
        desc3.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        //Scene 5
        Label label5 = new Label("Malla a utilizar");
        Button btn5 = new Button("Siguiente");
        btn5.setOnAction(e -> primaryStage.setScene(scene6));
        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll(label5, btn5);
        scene5 = new Scene(layout5, 1000, 600);        
        
        //Scene 6
        Label label6 = new Label("Tabla de conectividades");
        Button btn6 = new Button("Siguiente");
        btn6.setOnAction(e -> primaryStage.setScene(scene7));
        VBox layout6 = new VBox(20);
        layout6.getChildren().addAll(label6, btn6);
        scene6 = new Scene(layout6, 1000, 600);
        
        //Scene 7
        Label label7 = new Label("Paso 1");
        Button btn7 = new Button("Siguiente");
        btn7.setOnAction(e -> primaryStage.setScene(scene8));
        VBox layout7 = new VBox(20);
        layout7.getChildren().addAll(label7, btn7);
        scene7 = new Scene(layout7, 1000, 600);
        
        //Scene 8
        Label label8 = new Label("Paso 2");
        Button btn8 = new Button("Siguiente");
        btn8.setOnAction(e -> primaryStage.setScene(scene9));
        VBox layout8 = new VBox(20);
        layout8.getChildren().addAll(label8, btn8);
        scene8 = new Scene(layout8, 1000, 600);
        
        //Scene 9
        Label label9 = new Label("Paso 3");
        Button btn9 = new Button("Siguiente");
        btn9.setOnAction(e -> primaryStage.setScene(scene10));
        VBox layout9 = new VBox(20);
        layout9.getChildren().addAll(label9, btn9);
        scene9 = new Scene(layout9, 1000, 600);

        //Scene 10
        Label label10 = new Label("Paso 4");
        Button btn10 = new Button("Siguiente");
        btn10.setOnAction(e -> primaryStage.setScene(scene11));
        VBox layout10 = new VBox(20);
        layout10.getChildren().addAll(label10, btn10);
        scene10 = new Scene(layout10, 1000, 600);
        
        //Scene 11
        Label label11 = new Label("Paso 5");
        Button btn11 = new Button("Siguiente");
        btn11.setOnAction(e -> primaryStage.setScene(scene12));
        VBox layout11 = new VBox(20);
        layout11.getChildren().addAll(label11, btn11);
        scene11 = new Scene(layout11, 1000, 600);
        
        //Scene 12
        Label label12 = new Label("Paso 6");
        Button btn12 = new Button("Siguiente");
        btn12.setOnAction(e -> primaryStage.setScene(scene13));
        VBox layout12 = new VBox(20);
        layout12.getChildren().addAll(label12, btn12);
        scene12 = new Scene(layout12, 1000, 600);
        
        //Scene 13
        Label label13 = new Label("Definiendo componentes de matrices");
        Button btn13 = new Button("Siguiente");
        btn13.setOnAction(e -> primaryStage.setScene(scene14));
        VBox layout13 = new VBox(20);
        layout13.getChildren().addAll(label13, btn13);
        scene13 = new Scene(layout13, 1000, 600);
        
        //Scene 14
        Label label14 = new Label("Matriz C");
        Button btn14 = new Button("Siguiente");
        btn14.setOnAction(e -> primaryStage.setScene(scene15));
        VBox layout14 = new VBox(20);
        layout14.getChildren().addAll(label14, btn14);
        scene14 = new Scene(layout14, 1000, 600);
        
        //Scene 15
        Label label15 = new Label("Matriz -K");
        Button btn15 = new Button("Siguiente");
        btn15.setOnAction(e -> primaryStage.setScene(scene16));
        VBox layout15 = new VBox(20);
        layout15.getChildren().addAll(label15, btn15);
        scene15 = new Scene(layout15, 1000, 600);

        //Scene 16
        Label label16 = new Label("Matriz -L");
        Button btn16 = new Button("Siguiente");
        btn16.setOnAction(e -> primaryStage.setScene(scene17));
        VBox layout16 = new VBox(20);
        layout16.getChildren().addAll(label16, btn16);
        scene16 = new Scene(layout16, 1000, 600);
        
        //Scene 17
        Label label17 = new Label("Matriz F");
        Button btn17 = new Button("Siguiente");
        btn16.setOnAction(e -> primaryStage.setScene(scene18));
        VBox layout17 = new VBox(20);
        layout17.getChildren().addAll(label17, btn17);
        scene17 = new Scene(layout17, 1000, 600);
        
        //Scene 18
        Label label18 = new Label("Matriz g");
        Button btn18 = new Button("Siguiente");
        btn18.setOnAction(e -> primaryStage.setScene(scene19));
        VBox layout18 = new VBox(20);
        layout18.getChildren().addAll(label18, btn18);
        scene18 = new Scene(layout18, 1000, 600);
        
        //Scene 19
        Label label19 = new Label("Matriz h");
        Button btn19 = new Button("Siguiente");
        btn16.setOnAction(e -> primaryStage.setScene(scene20));
        VBox layout19 = new VBox(20);
        layout19.getChildren().addAll(label19, btn19);
        scene19 = new Scene(layout19, 1000, 600);
        
        //Scene 20
        Label label20 = new Label("Ensamblaje");
        Button btn20 = new Button("Siguiente");
        btn20.setOnAction(e -> primaryStage.setScene(scene21));
        VBox layout20 = new VBox(20);
        layout20.getChildren().addAll(label20, btn20);
        scene20 = new Scene(layout20, 1000, 600);
        
        //Scene 21
        Label label21 = new Label("Paso 8");
        Button btn21 = new Button("Siguiente");
        btn21.setOnAction(e -> primaryStage.setScene(scene22));
        VBox layout21 = new VBox(20);
        layout21.getChildren().addAll(label21, btn21);
        scene21 = new Scene(layout21, 1000, 600);
        
        //Scene22
        Label label22 = new Label("Espero les haya gustado!");
        Button btn22 = new Button("Home");
        btn22.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout22 = new VBox(20);
        layout22.getChildren().addAll(label22, btn22);
        scene22 = new Scene(layout22, 1000, 600);
        
        primaryStage.setResizable(false);
        primaryStage.setScene(scene1);;
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
