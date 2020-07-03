/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
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
    
    public static void main(String[] args) {
        launch(args);
    }
    
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
        Button atras = new Button("Anterior");
        atras.setLayoutY(500);
        atras.setLayoutX(650);
        atras.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras.setOnAction(e -> primaryStage.setScene(scene1));
        btn2.setOnAction(e -> primaryStage.setScene(scene3));
        Pane layout2 = new Pane();
        layout2.getChildren().addAll(texto,btn2,imageView, desc1, atras);
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
        
        Button atras1 = new Button("Anterior");
        atras1.setLayoutY(500);
        atras1.setLayoutX(650);
        atras1.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Label desc2 = new Label("Definir un Dominio es especificar la\nfigura sobre la que se aplicara el MEF,\npara este caso se decidió utilizar un\nparalelepipedo.");
        desc2.setLayoutX(650);
        desc2.setLayoutY(250);
        desc2.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        atras1.setOnAction(e -> primaryStage.setScene(scene2));
        btn3.setOnAction(e -> primaryStage.setScene(scene4));
        Pane layout3 = new Pane();
        layout3.getChildren().addAll(label3, btn3, imageView2, desc2,atras1);
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
        
        Button atras2 = new Button("Anterior");
        atras2.setLayoutY(500);
        atras2.setLayoutX(650);
        atras2.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        atras2.setOnAction(e -> primaryStage.setScene(scene3));
        btn4.setOnAction(e -> primaryStage.setScene(scene5));
        Pane layout4 = new Pane();
        layout4.getChildren().addAll(label4, btn4, imageView3, desc3,atras2);
        layout4.setStyle("-fx-background-color: #404A7C");
        scene4 = new Scene(layout4, 1000, 600);   
        
        //Scene 5
        Label label5 = new Label("Malla a utilizar");
        label5.setLayoutX(400);
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
        
        Button atras3 = new Button("Anterior");
        atras3.setLayoutY(500);
        atras3.setLayoutX(650);
        atras3.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras3.setOnAction(e -> primaryStage.setScene(scene4));
        btn5.setOnAction(e -> primaryStage.setScene(scene6));
        Pane layout5 = new Pane();
        layout5.getChildren().addAll(label5, btn5, imageView4, desc4, atras3);
        layout5.setStyle("-fx-background-color: #404A7C");
        scene5 = new Scene(layout5, 1000, 600);        
        
        //Scene 6
        Label label6 = new Label("Tabla de conectividades");
        label6.setLayoutX(325);
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
        
        Button atras4 = new Button("Anterior");
        atras4.setLayoutY(500);
        atras4.setLayoutX(650);
        atras4.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras4.setOnAction(e -> primaryStage.setScene(scene5));
        btn6.setOnAction(e -> primaryStage.setScene(scene7));
        Pane layout6 = new Pane();
        layout6.getChildren().addAll(label6, btn6, imageView5, desc5, atras4);
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
        
        Button atras5 = new Button("Anterior");
        atras5.setLayoutY(500);
        atras5.setLayoutX(650);
        atras5.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras5.setOnAction(e -> primaryStage.setScene(scene6));
        btn7.setOnAction(e -> primaryStage.setScene(scene8));
        Pane layout7 = new Pane();
        layout7.getChildren().addAll(label7, btn7, imageView6, desc6,atras5);
        layout7.setStyle("-fx-background-color: #404A7C");
        scene7 = new Scene(layout7, 1000, 600);
        
        //Scene 8
        Label label8 = new Label("Paso 2");
        label8.setLayoutX(450);
        label8.setLayoutY(50);
        label8.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image7 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso2.png"));
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(50);
        imageView7.setY(200);
        imageView7.setFitHeight(275);
        imageView7.setFitWidth(550);
        
        Button btn8 = new Button("Paso 3");
        btn8.setLayoutY(500);
        btn8.setLayoutX(850);
        btn8.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Label desc7 = new Label("Lo unico que se necesito hacer en este paso\nfue la interpolacion de cada incognita.\n"
                + "Lo cual como resultado final obtenemos 2\nvectores 4x1 uno que contiene las funciones\nde forma y el otro las incognitas.");
        desc7.setLayoutX(600);
        desc7.setLayoutY(250);
        desc7.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button atras6 = new Button("Anterior");
        atras6.setLayoutY(500);
        atras6.setLayoutX(650);
        atras6.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras6.setOnAction(e -> primaryStage.setScene(scene7));
        btn8.setOnAction(e -> primaryStage.setScene(scene9));
        Pane layout8 = new Pane();
        layout8.getChildren().addAll(label8, btn8, imageView7,desc7,atras6);
        layout8.setStyle("-fx-background-color: #404A7C");
        scene8 = new Scene(layout8, 1000, 600);
        
        //Scene 9
        Label label9 = new Label("Paso 3");
        label9.setLayoutX(450);
        label9.setLayoutY(50);
        label9.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image8 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso3.png"));
        ImageView imageView8 = new ImageView(image8);
        imageView8.setX(50);
        imageView8.setY(180);
        imageView8.setFitHeight(150);
        imageView8.setFitWidth(900);
        
        Label desc8 = new Label("En este paso solo se despeja toda la ecuacion para el lado izquierdo e aplicar ha ambas ecuaciones la\n"
                + "definicion del residual a cada una.");
        desc8.setLayoutX(25);
        desc8.setLayoutY(420);
        desc8.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn9 = new Button("Paso 4");
        btn9.setLayoutY(500);
        btn9.setLayoutX(850);
        btn9.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras7 = new Button("Anterior");
        atras7.setLayoutY(500);
        atras7.setLayoutX(650);
        atras7.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras7.setOnAction(e -> primaryStage.setScene(scene8));
        btn9.setOnAction(e -> primaryStage.setScene(scene10));
        Pane layout9 = new Pane();
        layout9.getChildren().addAll(label9, btn9, imageView8, desc8, atras7);
        layout9.setStyle("-fx-background-color: #404A7C");
        scene9 = new Scene(layout9, 1000, 600);

        //Scene 10
        Label label10 = new Label("Paso 4");
        label10.setLayoutX(450);
        label10.setLayoutY(50);
        label10.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image9 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso4.png"));
        ImageView imageView9 = new ImageView(image9);
        imageView9.setX(45);
        imageView9.setY(170);
        imageView9.setFitHeight(275);
        imageView9.setFitWidth(550);
        
        Button btn10 = new Button("Paso 5");
        btn10.setLayoutY(500);
        btn10.setLayoutX(850);
        btn10.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Label desc9 = new Label("Lo que se busca en este paso es multiplicar\nel residual por un peso y despues integrarlo\na lo largo de todo un dominio\n"
                + "Pero ojo, ahora el dominio es un volumen,\npor lo tanto, debe ser una integral triple.");
        desc9.setLayoutX(600);
        desc9.setLayoutY(250);
        desc9.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button atras8 = new Button("Anterior");
        atras8.setLayoutY(500);
        atras8.setLayoutX(650);
        atras8.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras8.setOnAction(e -> primaryStage.setScene(scene9));
        
        btn10.setOnAction(e -> primaryStage.setScene(scene11));
        Pane layout10 = new Pane();
        layout10.getChildren().addAll(label10, btn10, imageView9, desc9,atras8);
        layout10.setStyle("-fx-background-color: #404A7C");
        scene10 = new Scene(layout10, 1000, 600);
        
        //Scene 11
        Label label11 = new Label("Paso 5");
        label11.setLayoutX(450);
        label11.setLayoutY(50);
        label11.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image10 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso5.jpg"));
        ImageView imageView10 = new ImageView(image10);
        imageView10.setX(20);
        imageView10.setY(100);
        imageView10.setFitHeight(500);
        imageView10.setFitWidth(550);
        
        Label desc10 = new Label("Ahora bien, procederemos a usar el metodo\nde Galerkin para no complicarse al momento\nde integrar.\n"
                + "Separamos y desarrollamos cada integral para\ntener un mejor control de ellas y poder resolver.\n"
                + "Y así, poder llegar a la forma fuerte.");
        desc10.setLayoutX(580);
        desc10.setLayoutY(250);
        desc10.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn11 = new Button("Paso 6");
        btn11.setLayoutY(500);
        btn11.setLayoutX(850);
        btn11.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras9 = new Button("Anterior");
        atras9.setLayoutY(500);
        atras9.setLayoutX(650);
        atras9.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras9.setOnAction(e -> primaryStage.setScene(scene10));
        
        btn11.setOnAction(e -> primaryStage.setScene(scene12));
        Pane layout11 = new Pane();
        layout11.getChildren().addAll(label11, btn11, imageView10, desc10,atras9);
        layout11.setStyle("-fx-background-color: #404A7C");
        scene11 = new Scene(layout11, 1000, 600);
        
        //Scene 12
        Label label12 = new Label("Paso 6");
        label12.setLayoutX(450);
        label12.setLayoutY(50);
        label12.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image11 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso6.jpg"));
        ImageView imageView11 = new ImageView(image11);
        imageView11.setX(15);
        imageView11.setY(100);
        imageView11.setFitHeight(500);
        imageView11.setFitWidth(550);
        
        Label desc11 = new Label("Debido a la situacion de que en cada integral E\ny F existe una doble derivacion "
                + "se procedera\na usar la formula de la vaca o mejor conocida\ncomo integracion por partes.\n"
                + "Haciendo esto, se llega a un nuevo sistema de\necuaciones lineales llamado Weak Form");
        desc11.setLayoutX(570);
        desc11.setLayoutY(250);
        desc11.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn12 = new Button("Siguiente");
        btn12.setLayoutY(500);
        btn12.setLayoutX(850);
        btn12.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras10 = new Button("Anterior");
        atras10.setLayoutY(500);
        atras10.setLayoutX(650);
        atras10.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras10.setOnAction(e -> primaryStage.setScene(scene11));
        
        btn12.setOnAction(e -> primaryStage.setScene(scene13));
        Pane layout12 = new Pane();
        layout12.getChildren().addAll(label12, btn12, imageView11, desc11, atras10);
        layout12.setStyle("-fx-background-color: #404A7C");
        scene12 = new Scene(layout12, 1000, 600);
        
        //Scene 13
        Label label13 = new Label("Definiendo componentes de matrices");
        label13.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        Button btn13 = new Button("Sigamos");
        btn13.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras11 = new Button("Anterior");
        atras11.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras11.setOnAction(e -> primaryStage.setScene(scene12));
        
        btn13.setOnAction(e -> primaryStage.setScene(scene14));
        VBox layout13 = new VBox(20);
        layout13.getChildren().addAll(label13, btn13,atras11);
        layout13.setAlignment(Pos.CENTER);
        layout13.setStyle("-fx-background-color: #404A7C");
        scene13 = new Scene(layout13, 1000, 600);
        
        //Scene 14
        Label label14 = new Label("Matriz C");
        label14.setLayoutX(450);
        label14.setLayoutY(30);
        label14.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image12 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\MatrizC.jpg"));
        ImageView imageView12 = new ImageView(image12);
        imageView12.setX(20);
        imageView12.setY(100);
        imageView12.setFitHeight(500);
        imageView12.setFitWidth(550);
        
        Label desc12 = new Label("Esta matriz se desarrolla casi de inmediato\ndebido a que la N^T ya se encuentra definida,\n"
                + "cabe mencionar que se uso un metodo de\n'Galerkin Modificado' para que no hubiera pro-\nblema con las dimensiones de las matrices.\n\n"
                + "Por cierto, se necesito realizar un cambio de\nvariable e interpolar las variables x y y para\nque se pudiera realizar la integral.");
        desc12.setLayoutX(580);
        desc12.setLayoutY(215);
        desc12.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn14 = new Button("Siguiente");
        btn14.setLayoutY(500);
        btn14.setLayoutX(850);
        btn14.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras12 = new Button("Anterior");
        atras12.setLayoutY(500);
        atras12.setLayoutX(650);
        atras12.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras12.setOnAction(e -> primaryStage.setScene(scene13));
        
        btn14.setOnAction(e -> primaryStage.setScene(scene15));
        Pane layout14 = new Pane();
        layout14.getChildren().addAll(label14, btn14, imageView12, desc12,atras12);
        layout14.setStyle("-fx-background-color: #404A7C");
        scene14 = new Scene(layout14, 1000, 600);
        
        //Scene 15
        Label label15 = new Label("Matriz -K y -L");
        label15.setLayoutX(400);
        label15.setLayoutY(30);
        label15.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image13 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\MatrizKyL.jpg"));
        ImageView imageView13 = new ImageView(image13);
        imageView13.setX(20);
        imageView13.setY(100);
        imageView13.setFitHeight(500);
        imageView13.setFitWidth(550);
        
        Label desc13 = new Label("Estas matrices se pusieron juntas debido a que\nes exactamente el mismo proceso para ambas, se realiza\n"
                + "casi de inmediato porque esas matrices ya se\nencuentran definidas por un mismo valor.\n\n"
                + "Al igual que en la matriz se realizó un cambio\nde variable e interpolacion.");
        desc13.setLayoutX(580);
        desc13.setLayoutY(225);
        desc13.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn15 = new Button("Siguiente");
        btn15.setLayoutY(500);
        btn15.setLayoutX(850);
        btn15.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras13 = new Button("Anterior");
        atras13.setLayoutY(500);
        atras13.setLayoutX(650);
        atras13.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras13.setOnAction(e -> primaryStage.setScene(scene15));
        
        btn15.setOnAction(e -> primaryStage.setScene(scene17));
        Pane layout15 = new Pane();
        layout15.getChildren().addAll(label15, btn15,imageView13, desc13,atras13);
        layout15.setStyle("-fx-background-color: #404A7C");
        scene15 = new Scene(layout15, 1000, 600);
        
        
        //Scene 17
        Label label17 = new Label("Matriz F");
        label17.setLayoutX(450);
        label17.setLayoutY(30);
        label17.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image14 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\MatrizF.jpg"));
        ImageView imageView14 = new ImageView(image14);
        imageView14.setX(20);
        imageView14.setY(100);
        imageView14.setFitHeight(500);
        imageView14.setFitWidth(550);
        
        Label desc14 = new Label("Esta matriz es exactamente igual a la matriz C,\npor lo que, es el mismo proceso para resolverla.\n\n"
                + "La unica variante es que en esta integral la va-\nriable que multiplica no es solo 'x' sino '(x+y)'");
        desc14.setLayoutX(580);
        desc14.setLayoutY(250);
        desc14.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn17 = new Button("Siguiente");
        btn17.setLayoutY(500);
        btn17.setLayoutX(850);
        btn17.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras14 = new Button("Anterior");
        atras14.setLayoutY(500);
        atras14.setLayoutX(650);
        atras14.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras14.setOnAction(e -> primaryStage.setScene(scene16));
        
        btn17.setOnAction(e -> primaryStage.setScene(scene18));
        Pane layout17 = new Pane();
        layout17.getChildren().addAll(label17, btn17, imageView14, desc14,atras14);
        layout17.setStyle("-fx-background-color: #404A7C");
        scene17 = new Scene(layout17, 1000, 600);
        
        //Scene 18
        Label label18 = new Label("Matriz g");
        label18.setLayoutX(450);
        label18.setLayoutY(30);
        label18.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image15 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Matrizg.jpg"));
        ImageView imageView15 = new ImageView(image15);
        imageView15.setX(20);
        imageView15.setY(100);
        imageView15.setFitHeight(500);
        imageView15.setFitWidth(550);
        
        Label desc15 = new Label("Esta matriz es sencilla debido a que ya tiene\nvalores definidos dentro de ella y porque el\nproceso "
                + "ya se encuentra definido, por lo que,\nsolo se necesita sustituir valores e integrar.");
        desc15.setLayoutX(580);
        desc15.setLayoutY(250);
        desc15.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn18 = new Button("Siguiente");
        btn18.setLayoutY(500);
        btn18.setLayoutX(850);
        btn18.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras15 = new Button("Anterior");
        atras15.setLayoutY(500);
        atras15.setLayoutX(650);
        atras15.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras15.setOnAction(e -> primaryStage.setScene(scene17));
        
        btn18.setOnAction(e -> primaryStage.setScene(scene19));
        Pane layout18 = new Pane();
        layout18.getChildren().addAll(label18, btn18, imageView15, desc15, atras15);
        layout18.setStyle("-fx-background-color: #404A7C");
        scene18 = new Scene(layout18, 1000, 600);
        
        //Scene 19
        Label label19 = new Label("Matriz h");
        label19.setLayoutX(450);
        label19.setLayoutY(30);
        label19.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image16 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Matrizh.jpg"));
        ImageView imageView16 = new ImageView(image16);
        imageView16.setX(20);
        imageView16.setY(100);
        imageView16.setFitHeight(500);
        imageView16.setFitWidth(550);
        
        Label desc16 = new Label("Al igual que la matriz anterior es sencilla y se\nresuelve casi de golpe.\n"
                + "Los unicos valores que cambian son los nume-\nros que multiplican a las matrices.");
        desc16.setLayoutX(580);
        desc16.setLayoutY(250);
        desc16.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn19 = new Button("Siguiente");
        btn19.setLayoutY(500);
        btn19.setLayoutX(850);
        btn19.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras16 = new Button("Anterior");
        atras16.setLayoutY(500);
        atras16.setLayoutX(650);
        atras16.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras16.setOnAction(e -> primaryStage.setScene(scene18));
        
        btn19.setOnAction(e -> primaryStage.setScene(scene20));
        Pane layout19 = new Pane();
        layout19.getChildren().addAll(label19, btn19, imageView16,desc16,atras16);
        layout19.setStyle("-fx-background-color: #404A7C");
        scene19 = new Scene(layout19, 1000, 600);
        
        //Scene 20
        Label label20 = new Label("Ensamblaje");
        label20.setLayoutX(770);
        label20.setLayoutY(220);
        label20.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        String path = "C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Ensamblaje.mp4";
        
        Media media = new Media(new File(path).toURI().toString());
        
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        
        MediaView mediaView = new MediaView(mediaPlayer);
        
        Label desc = new Label("Debido a que el proceso de ensamblaje es muy largo,\nsolo se muestra una pequeña simulacion de como "
                + "se\nva realizando en el ensamblaje.\n\nPara esta caso solo se realiza la primera linea del sistema local.");
        desc.setLayoutX(25);
        desc.setLayoutY(450);
        desc.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn20 = new Button("Paso 8");
        btn20.setLayoutY(500);
        btn20.setLayoutX(850);
        btn20.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras17 = new Button("Anterior");
        atras17.setLayoutY(500);
        atras17.setLayoutX(650);
        atras17.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras17.setOnAction(e -> primaryStage.setScene(scene19));
        
        btn20.setOnAction(e -> primaryStage.setScene(scene21));
        Pane layout20 = new Pane();
        layout20.getChildren().addAll(label20, btn20, atras17,mediaView,desc);
        layout20.setStyle("-fx-background-color: #404A7C");
        scene20 = new Scene(layout20, 1000, 600);
        
        //Scene 21
        Label label21 = new Label("Paso 8");
        label21.setLayoutX(450);
        label21.setLayoutY(50);
        label21.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Image image17 = new Image(new FileInputStream("C:\\Users\\giron\\NetBeansProjects\\Desafio\\src\\images\\Paso8.jpg"));
        ImageView imageView17 = new ImageView(image17);
        imageView17.setX(160);
        imageView17.setY(150);
        imageView17.setFitHeight(250);
        imageView17.setFitWidth(250);
        
        Label descp = new Label("Aca es donde se aplican las condiciones Neuman\ny Dirichlet tomadndo como referencia, los nodos\nen ndonde son"
                + " aplicadas ambas condiciones.\n"
                + "Pues esto logra modificar el sistema matricial final\nque obtuvimos del ensamblaje haciendolo mucho\nmas pequeño"
                + " y facil de manejar.\n\n"
                + "Por lo que en las condiciones de Neuman solo se\nagrega un vector que suma al vector 'b' que contiene\nlas matrices g y"
                + " h, y en las condiciones de Dirichlet\ntoman valor de incognitas A y B que provocan que\ndesaparezcan las filas solo donde fue "
                + "aplicada esta\ncondicion.");
        descp.setLayoutX(500);
        descp.setLayoutY(150);
        descp.setStyle("-fx-text-fill: #FFFFFF; -fx-font: normal 20px 'sans-serif'; ");
        
        Button btn21 = new Button("Finish");
        btn21.setLayoutY(500);
        btn21.setLayoutX(850);
        btn21.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        Button atras18 = new Button("Anterior");
        atras18.setLayoutY(500);
        atras18.setLayoutX(650);
        atras18.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        
        atras18.setOnAction(e -> primaryStage.setScene(scene20));
        
        btn21.setOnAction(e -> primaryStage.setScene(scene22));
        Pane layout21 = new Pane();
        layout21.getChildren().addAll(label21, btn21,atras18, imageView17,descp);
        layout21.setStyle("-fx-background-color: #404A7C");
        scene21 = new Scene(layout21, 1000, 600);
        
        //Scene22
        Label label22 = new Label("Espero les haya gustado!");
        label22.setLayoutX(450);
        label22.setLayoutY(50);
        label22.setStyle("-fx-font: normal bold 2em 'sans-serif'; "
                + "-fx-text-fill: #FFFFFF;");
        
        Button btn22 = new Button("Home");
        btn22.setStyle("-fx-background-color: #CFCFBC; "
                + "-fx-font: 2em 'sans-serif'; "
                + "-fx-text-fill: #000000;");
        btn22.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout22 = new VBox(20);
        layout22.getChildren().addAll(label22, btn22);
        layout22.setAlignment(Pos.CENTER);
        layout22.setStyle("-fx-background-color: #404A7C");
        scene22 = new Scene(layout22, 1000, 600);
        
        primaryStage.setResizable(false);
        primaryStage.setScene(scene1);;
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
}