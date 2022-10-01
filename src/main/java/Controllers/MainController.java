package Controllers;

import com.example.manejo_de_cuestionarios.Cuestionario;
import com.example.manejo_de_cuestionarios.Dataglobal;
import com.example.manejo_de_cuestionarios.HelloApplication;
import com.example.manejo_de_cuestionarios.Respuestas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

public class MainController {
    @FXML
    Button BNcuestionario;
    @FXML
    Button BEvaluacion;
    @FXML
    Button Bagregar;
    @FXML
    Button Bcontrol;
    @FXML
    Button Bingresar;
    @FXML
    Button Bclonar;
    @FXML
    Button Btop3;


    @FXML
    Pane Pcuestionario;
    @FXML
    Pane Pevaluacion;
    @FXML
    Pane Pcont;
    @FXML
    Pane Ppreguntas;
    @FXML
    Pane Ptop3;
    @FXML
    Pane Pprincipal;

    @FXML
    TextField Tpin;
    @FXML
    TextField Tname;
    @FXML
    TextField Tpregunta;
    @FXML
    TextField Tpregunta2;
    @FXML
    TextField Tpregunta3;
    @FXML
    TextField Tpuntos;
    @FXML
    TextField Tpuntos2;
    @FXML
    TextField Tpuntos3;
    @FXML
    TextField Ttitulo;
    @FXML
    TextField Tdescripcion;
    @FXML
    TextField TR1;
    @FXML
    TextField TR2;
    @FXML
    TextField TR3;
    @FXML
    TextField TRR1;
    @FXML
    TextField TRR2;
    @FXML
    TextField TRR3;
    @FXML
    TextField TRRR1;
    @FXML
    TextField TRRR2;
    @FXML
    TextField TRRR3;

    @FXML
    TableView Tabla;
    @FXML
    TableView Tabla2;
    @FXML
    TableColumn Tablan;
    @FXML
    TableColumn Tablat;
    @FXML
    TableColumn Tablad;
    @FXML
    TableColumn Tablapin;
    @FXML
    TableColumn Tablaname;
    @FXML
    TableColumn Tablapuntos;

    @FXML
    Label Ltitulo;
    @FXML
    Label Ldescripcion;
    @FXML
    Label Lpregunta;
    @FXML
    Label Lpregunta2;
    @FXML
    Label Lpregunta3;
    @FXML
    Label Rrespuesta;
    @FXML
    Label Rrespuesta2;
    @FXML
    Label Rrespuesta3;
    @FXML
    Label Rrespues;
    @FXML
    Label Rrespues2;
    @FXML
    Label Rrespues3;
    @FXML
    Label Rres;
    @FXML
    Label Rres2;
    @FXML
    Label Rres3;



    public MainController() {
    }

    public void initialize(){
Tablan.setCellValueFactory(new PropertyValueFactory<Cuestionario, Integer>("no"));
Tablat.setCellValueFactory(new PropertyValueFactory<Cuestionario,String>("titulo"));
Tablad.setCellValueFactory(new PropertyValueFactory<Cuestionario,String>("descripcion"));

        ObservableList<Cuestionario> info= FXCollections.observableArrayList(Dataglobal.Dcuestionarios);
        Tabla.setItems(info);


Tablapuntos.setCellValueFactory(new PropertyValueFactory<Respuestas, Integer>("punteo"));
        Tablaname.setCellValueFactory(new PropertyValueFactory<Respuestas, String>("nombre"));
        Tablapin.setCellValueFactory(new PropertyValueFactory<Respuestas, Integer>("pin"));

        ObservableList<Respuestas> info2= FXCollections.observableArrayList(Dataglobal.Drespuestas);
        Tabla2.setItems(info2);

    }

    public void Clickmenu(ActionEvent accion){
        if (accion.getSource()==BNcuestionario){
            Pcuestionario.toFront();
        }
        if (accion.getSource()==BEvaluacion){
            Pevaluacion.toFront();
        }
        if (accion.getSource()==Bcontrol){
            Pcont.toFront();
        }
    }


    public void Clickagregarcuestionario(ActionEvent actionevent){
        String Titulo=Ttitulo.getText();
        String Descripcion=Tdescripcion.getText();
String pregunta=Tpregunta.getText();
int puntos= Integer.parseInt(Tpuntos.getText());
        String pregunta2=Tpregunta2.getText();
        int puntos2= Integer.parseInt(Tpuntos2.getText());
        String pregunta3=Tpregunta3.getText();
        int puntos3= Integer.parseInt(Tpuntos3.getText());
        String respuesta=TR1.getText();
        String respuesta1=TR2.getText();
        String respuesta2=TR3.getText();
        String respuesta3=TRR1.getText();
        String respuesta4=TRR2.getText();
        String respuesta5=TRR3.getText();
        String respuesta6=TRRR1.getText();
        String respuesta7=TRRR2.getText();
        String respuesta8=TRRR3.getText();

        Ltitulo.setText(Ttitulo.getText());
        Ldescripcion.setText(Tdescripcion.getText());
        Lpregunta.setText(Tpregunta.getText());
        Lpregunta2.setText(Tpregunta2.getText());
        Lpregunta3.setText(Tpregunta3.getText());
        Rrespuesta.setText(TR1.getText());
        Rrespuesta2.setText(TR2.getText());
        Rrespuesta3.setText(TR3.getText());
        Rrespues.setText(TRR1.getText());
        Rrespues2.setText(TRR2.getText());
        Rrespues3.setText(TRR3.getText());
        Rres.setText(TRRR1.getText());
        Rres2.setText(TRRR2.getText());
        Rres3.setText(TRRR3.getText());

Cuestionario cuestionario=new Cuestionario(Titulo,Descripcion,pregunta,pregunta2,pregunta3,respuesta,respuesta1,respuesta2,respuesta3,respuesta4,respuesta5,respuesta6,respuesta7,respuesta8,puntos,puntos2,puntos3);

Dataglobal.Dcuestionarios.add(cuestionario);

        Tpregunta.setText("");
        Tpuntos.setText("");
        Ttitulo.setText("");
        Tdescripcion.setText("");
        Tpregunta2.setText("");
        Tpuntos2.setText("");
        Tpregunta3.setText("");
        Tpuntos3.setText("");
        TR1.setText("");
        TR2.setText("");
        TR3.setText("");
        TRR1.setText("");
        TRR2.setText("");
        TRR3.setText("");
        TRRR1.setText("");
        TRRR2.setText("");
        TRRR3.setText("");

        ObservableList<Cuestionario> info= FXCollections.observableArrayList(Dataglobal.Dcuestionarios);
        Tabla.setItems(info);





    }



    public void Clickcontrol() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Evaluacion.fxml"));
        AnchorPane root = (AnchorPane) fxmlLoader.load();
        Scene scene = new Scene(root, 663, 480);
        Stage stage=new Stage();
        stage.setTitle("Control de los cuestionarios");
        stage.setScene(scene);
        stage.show();

    }

    public void Clickevaluacion(ActionEvent acion){

        int pin= Integer.parseInt(Tpin.getText());
        String nombre=Tname.getText();

        Respuestas respuesta=new Respuestas(nombre,pin);
        Dataglobal.Drespuestas.add(respuesta);

        Tpin.setText("");
        Tname.setText("");



        if (acion.getSource()==Bingresar){
            Ppreguntas.toFront();

        }
    }








    public void generar(String nom) throws FileNotFoundException{
if(!(Tname.getText().isEmpty() || Tpin.getText().isEmpty())){
            FileOutputStream archivo=new FileOutputStream(nom+".pdf");
            Document documento=new Document(Tname.getText());
}
    }

    public void clonar(ActionEvent evnt){

JOptionPane.showMessageDialog(null,"se a clonado el ultimo cuestionario");



    }
public void top3(ActionEvent avnt){

        JOptionPane.showMessageDialog(null,"Se a creado un pdf de la lista de encuestados");

    ObservableList<Respuestas> info2= FXCollections.observableArrayList(Dataglobal.Drespuestas);
    Tabla2.setItems(info2);

    if (avnt.getSource()==Btop3){
        Ptop3.toFront();

    }


}

public void finalizar(ActionEvent evnt){

        Ltitulo.setText("");
    Ldescripcion.setText("");
    Lpregunta.setText("");
    Lpregunta2.setText("");
    Lpregunta3.setText("");
    Rrespuesta.setText("");
    Rrespuesta2.setText("");
    Rrespuesta3.setText("");
    Rrespues.setText("");
    Rrespues2.setText("");
    Rrespues3.setText("");
    Rres.setText("");
    Rres2.setText("");
    Rres3.setText("");


        int i=JOptionPane.showConfirmDialog(null,"deseas salir del programa?");

        if (i==0){
System.exit(0);
        }else if (i==1){
            Pprincipal.toFront();
        }
}


}