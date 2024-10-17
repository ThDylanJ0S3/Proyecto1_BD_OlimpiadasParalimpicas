/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import java.awt.geom.Rectangle2D;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author dilan
 */
public class OlimpiadasParalimicas extends Application {



    /**
     * se declara el contructor del metodo main para poder hacer ejecutable el
     * proyecto
     *
     * @param args se envian los argumentos y comandos de linea
     */
    public static void main(String[] args) {
        launch(args);
    }
    

    public void start(Stage stage) throws Exception {

        Parent rootMenu = FXMLLoader.load(getClass().getResource("/view/IniciarSesion.fxml"));
        Scene sceneMenu = new Scene(rootMenu);
        Stage stageMenu = new Stage();
        stageMenu.setTitle("Menú principal");
        stageMenu.setScene(sceneMenu);

        stageMenu.show();

    }
    
}
