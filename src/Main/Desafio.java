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
        Image image = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Modelo.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(30);
        imageView.setY(180);
        imageView.setFitHeight(225);
        imageView.setFitWidth(600);
        
        Label desc1 = new Label("Primero se tiene un modelo sobre\nel cual sera aplicado el Metodo de\nlos elementos finitos (MEF)."
                + "\nEste modelo tiene 2 incognitas A y\nB que seran encontradas al dar por\nterminado el proceso.");
        desc1.setLayoutX(650);
        desc1.setLayoutY(225);
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
        
        Image image2 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Dominio.png"));
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
        
        Label desc2 = new Label("Definir un Dominio es especificar la\nfigura sobre la que se aplicara el MEF,\npara este caso se decidió utilizar un\nparalelepipedo.");
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
        label4.setLayoutX(260);
        label4.setLayoutY(50);
        label4.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image3 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Condiciones.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setX(30);
        imageView3.setY(150);
        imageView3.setFitHeight(300);
        imageView3.setFitWidth(600);
        
        Label desc3 = new Label("Aplicamos condiciones de Neuman y\nDirichlet al dominio en la cara frontal\ny trasera para generar una alteracion\nen el sistema matricial final. Para asi\nlograr hacerlo mas pequeño.\n"
                + "Los valores son:\n\n-Neuman = 6\n\n-Dirichlet = 4");
        desc3.setLayoutX(650);
        desc3.setLayoutY(175);
        desc3.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn4 = new Button("Siguiente");
        btn4.setLayoutY(500);
        btn4.setLayoutX(850);
        btn4.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn4.setOnAction(e -> primaryStage.setScene(scene5));
        Pane layout4 = new Pane();
        layout4.getChildren().addAll(label4, btn4, imageView3, desc3);
        layout4.setStyle("-fx-background-color: #404A7C");
        scene4 = new Scene(layout4, 1000, 600);   
        
        //Scene 5
        Label label5 = new Label("Malla a utilizar");
        label5.setLayoutX(415);
        label5.setLayoutY(50);
        label5.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image4 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Mallado.png"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setX(30);
        imageView4.setY(150);
        imageView4.setFitHeight(300);
        imageView4.setFitWidth(600);
        
        Label desc4 = new Label("La malla define la cantidad de nodos y\nelementos que se tendran en la figura\nantes mencionada. Ayuda al desarrollo\ndel ensamblaje (Paso 7)."
                + "\nEsta malla tiene:\n\n-13 nodos\n\n-12 elementos.");
        desc4.setLayoutX(650);
        desc4.setLayoutY(190);
        desc4.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn5 = new Button("Siguiente");
        btn5.setLayoutY(500);
        btn5.setLayoutX(850);
        btn5.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn5.setOnAction(e -> primaryStage.setScene(scene6));
        Pane layout5 = new Pane();
        layout5.getChildren().addAll(label5, btn5, imageView4, desc4);
        layout5.setStyle("-fx-background-color: #404A7C");
        scene5 = new Scene(layout5, 1000, 600);        
        
        //Scene 6
        Label label6 = new Label("Tabla de conectividades");
        label6.setLayoutX(335);
        label6.setLayoutY(50);
        label6.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image5 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Tabla.JPG"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setX(50);
        imageView5.setY(150);
        imageView5.setFitHeight(350);
        imageView5.setFitWidth(550);
        
        Label desc5 = new Label("La tabla de conectividades es obtenida\nde la malla, ya que para obtenerla se\nnecesita un recorrido de cada nodo"
                + "y\nelemento.\nPara este caso que son 3 dimensiones\nse recorren 4 nodos por elemento sin que\nimporte el orden");
        desc5.setLayoutX(625);
        desc5.setLayoutY(200);
        desc5.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn6 = new Button("Paso 1");
        btn6.setLayoutY(500);
        btn6.setLayoutX(850);
        btn6.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        btn6.setOnAction(e -> primaryStage.setScene(scene7));
        Pane layout6 = new Pane();
        layout6.getChildren().addAll(label6, btn6, imageView5, desc5);
        layout6.setStyle("-fx-background-color: #404A7C");
        scene6 = new Scene(layout6, 1000, 600);
        
        //Scene 7
        Label label7 = new Label("Paso 1");
        label7.setLayoutX(450);
        label7.setLayoutY(50);
        label7.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image6 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\EcForma.png"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setX(60);
        imageView6.setY(200);
        imageView6.setFitHeight(200);
        imageView6.setFitWidth(500);
        
        Label desc6 = new Label("Se definieron 4 ecuaciones de forma debido\na que se asume que cada elemento es un\ntetraedro "
                + "en un mundo ideal donde phi = z,\nepsilon = x y eta = y.\n\n¿Por que se hace esto?\nPorque si se trabaja en el mundo "
                + "x,y,z las\nvariantes son demasiadas y esto afectaría\nsin dudar el resultado final.");
        desc6.setLayoutX(600);
        desc6.setLayoutY(190);
        desc6.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn7 = new Button("Paso 2");
        btn7.setLayoutY(500);
        btn7.setLayoutX(850);
        btn7.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn7.setOnAction(e -> primaryStage.setScene(scene8));
        Pane layout7 = new Pane();
        layout7.getChildren().addAll(label7, btn7, imageView6, desc6);
        layout7.setStyle("-fx-background-color: #404A7C");
        scene7 = new Scene(layout7, 1000, 600);
        
        //Scene 8
        Label label8 = new Label("Paso 2");
        Button btn8 = new Button("Paso 3");
        btn8.setLayoutY(500);
        btn8.setLayoutX(850);
        btn8.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn8.setOnAction(e -> primaryStage.setScene(scene9));
        Pane layout8 = new Pane();
        layout8.getChildren().addAll(label8, btn8);
        layout8.setStyle("-fx-background-color: #404A7C");
        scene8 = new Scene(layout8, 1000, 600);
        
        //Scene 9
        Label label9 = new Label("Paso 3");
        Button btn9 = new Button("Paso 4");
        btn9.setLayoutY(500);
        btn9.setLayoutX(850);
        btn9.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn9.setOnAction(e -> primaryStage.setScene(scene10));
        Pane layout9 = new Pane();
        layout9.getChildren().addAll(label9, btn9);
        layout9.setStyle("-fx-background-color: #404A7C");
        scene9 = new Scene(layout9, 1000, 600);

        //Scene 10
        Label label10 = new Label("Paso 4");
        Button btn10 = new Button("Paso 5");
        btn10.setLayoutY(500);
        btn10.setLayoutX(850);
        btn10.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn10.setOnAction(e -> primaryStage.setScene(scene11));
        Pane layout10 = new Pane();
        layout10.getChildren().addAll(label10, btn10);
        layout10.setStyle("-fx-background-color: #404A7C");
        scene10 = new Scene(layout10, 1000, 600);
        
        //Scene 11
        Label label11 = new Label("Paso 5");
        Button btn11 = new Button("Paso 6");
        btn11.setLayoutY(500);
        btn11.setLayoutX(850);
        btn11.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn11.setOnAction(e -> primaryStage.setScene(scene12));
        Pane layout11 = new Pane();
        layout11.getChildren().addAll(label11, btn11);
        layout11.setStyle("-fx-background-color: #404A7C");
        scene11 = new Scene(layout11, 1000, 600);
        
        //Scene 12
        Label label12 = new Label("Paso 6");
        Button btn12 = new Button("Siguiente");
        btn12.setLayoutY(500);
        btn12.setLayoutX(850);
        btn12.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn12.setOnAction(e -> primaryStage.setScene(scene13));
        Pane layout12 = new Pane();
        layout12.getChildren().addAll(label12, btn12);
        layout12.setStyle("-fx-background-color: #404A7C");
        scene12 = new Scene(layout12, 1000, 600);
        
        //Scene 13
        Label label13 = new Label("Definiendo componentes de matrices");
        Button btn13 = new Button("Siguiente");
        btn13.setLayoutY(500);
        btn13.setLayoutX(850);
        btn13.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn13.setOnAction(e -> primaryStage.setScene(scene14));
        Pane layout13 = new Pane();
        layout13.getChildren().addAll(label13, btn13);
        layout13.setStyle("-fx-background-color: #404A7C");
        scene13 = new Scene(layout13, 1000, 600);
        
        //Scene 14
        Label label14 = new Label("Matriz C");
        Button btn14 = new Button("Siguiente");
        btn14.setLayoutY(500);
        btn14.setLayoutX(850);
        btn14.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn14.setOnAction(e -> primaryStage.setScene(scene15));
        Pane layout14 = new Pane();
        layout14.getChildren().addAll(label14, btn14);
        layout14.setStyle("-fx-background-color: #404A7C");
        scene14 = new Scene(layout14, 1000, 600);
        
        //Scene 15
        Label label15 = new Label("Matriz -K");
        Button btn15 = new Button("Siguiente");
        btn15.setLayoutY(500);
        btn15.setLayoutX(850);
        btn15.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn15.setOnAction(e -> primaryStage.setScene(scene16));
        Pane layout15 = new Pane();
        layout15.getChildren().addAll(label15, btn15);
        layout15.setStyle("-fx-background-color: #404A7C");
        scene15 = new Scene(layout15, 1000, 600);

        //Scene 16
        Label label16 = new Label("Matriz -L");
        Button btn16 = new Button("Siguiente");
        btn16.setLayoutY(500);
        btn16.setLayoutX(850);
        btn16.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn16.setOnAction(e -> primaryStage.setScene(scene17));
        Pane layout16 = new Pane();
        layout16.getChildren().addAll(label16, btn16);
        layout16.setStyle("-fx-background-color: #404A7C");
        scene16 = new Scene(layout16, 1000, 600);
        
        //Scene 17
        Label label17 = new Label("Matriz F");
        Button btn17 = new Button("Siguiente");
        btn17.setLayoutY(500);
        btn17.setLayoutX(850);
        btn17.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn17.setOnAction(e -> primaryStage.setScene(scene18));
        Pane layout17 = new Pane();
        layout17.getChildren().addAll(label17, btn17);
        layout17.setStyle("-fx-background-color: #404A7C");
        scene17 = new Scene(layout17, 1000, 600);
        
        //Scene 18
        Label label18 = new Label("Matriz g");
        Button btn18 = new Button("Siguiente");
        btn18.setLayoutY(500);
        btn18.setLayoutX(850);
        btn18.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn18.setOnAction(e -> primaryStage.setScene(scene19));
        Pane layout18 = new Pane();
        layout18.getChildren().addAll(label18, btn18);
        layout18.setStyle("-fx-background-color: #404A7C");
        scene18 = new Scene(layout18, 1000, 600);
        
        //Scene 19
        Label label19 = new Label("Matriz h");
        Button btn19 = new Button("Siguiente");
        btn19.setLayoutY(500);
        btn19.setLayoutX(850);
        btn19.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn19.setOnAction(e -> primaryStage.setScene(scene20));
        Pane layout19 = new Pane();
        layout19.getChildren().addAll(label19, btn19);
        layout19.setStyle("-fx-background-color: #404A7C");
        scene19 = new Scene(layout19, 1000, 600);
        
        //Scene 20
        Label label20 = new Label("Ensamblaje");
        Button btn20 = new Button("Siguiente");
        btn20.setLayoutY(500);
        btn20.setLayoutX(850);
        btn20.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn20.setOnAction(e -> primaryStage.setScene(scene21));
        Pane layout20 = new Pane();
        layout20.getChildren().addAll(label20, btn20);
        layout20.setStyle("-fx-background-color: #404A7C");
        scene20 = new Scene(layout20, 1000, 600);
        
        //Scene 21
        Label label21 = new Label("Paso 8");
        Button btn21 = new Button("Siguiente");
        btn21.setLayoutY(500);
        btn21.setLayoutX(850);
        btn21.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn21.setOnAction(e -> primaryStage.setScene(scene22));
        Pane layout21 = new Pane();
        layout21.getChildren().addAll(label21, btn21);
        layout21.setStyle("-fx-background-color: #404A7C");
        scene21 = new Scene(layout21, 1000, 600);
        
        //Scene22
        Label label22 = new Label("Espero les haya gustado!");
        Button btn22 = new Button("Home");
        btn22.setLayoutY(500);
        btn22.setLayoutX(850);
        btn22.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn22.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout22 = new VBox(20);
        layout22.getChildren().addAll(label22, btn22);
        layout22.setStyle("-fx-background-color: #404A7C");
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
