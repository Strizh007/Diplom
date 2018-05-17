package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.FileChooser.ExtensionFilter;

import java.io.File;
import java.io.IOException;


public class Controller {
    @FXML
    private javafx.scene.control.Button btnCancl;
    @FXML
    private javafx.scene.control.Button btnOK;
    @FXML
    private Canvas canvs;
    @FXML
    private GraphicsContext gc;
    @FXML
    private ComboBox<String> combo;

    @FXML
    public void initialize() {
        combo.setItems(FXCollections.observableArrayList("B","G","N","AC"));
    }

    @FXML
    protected void seletPoint(ActionEvent event){
    System.out.println(combo.getSelectionModel().selectedItemProperty().getValue());
}
    @FXML
    protected void openWall(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("wall.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage secondStage = new Stage(StageStyle.UNDECORATED);
        secondStage.setResizable(false);
        secondStage.setScene(new Scene(root, 250, 200));
        secondStage.show();
    }

    @FXML
    protected void openDoor(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("door.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage secondStage = new Stage(StageStyle.UNDECORATED);
        secondStage.setResizable(false);
        secondStage.setScene(new Scene(root, 250, 200));
        secondStage.show();
    }

    @FXML
    protected void openWindow(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("window.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage secondStage = new Stage(StageStyle.UNDECORATED);
        secondStage.setResizable(false);
        secondStage.setScene(new Scene(root, 250, 200));
        secondStage.show();
    }

    @FXML
    protected void closeButtonExit(ActionEvent event) {
        try {
            FXMLLoader.load(getClass().getResource("wall.fxml"));
            FXMLLoader.load(getClass().getResource("door.fxml"));
            FXMLLoader.load(getClass().getResource("window.fxml"));
            Stage stage = (Stage) btnCancl.getScene().getWindow();
            stage.close();
        } catch (IOException ev) {
            ev.printStackTrace();
        }
    }

    @FXML
    protected void save(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Сохранение документа");
        ExtensionFilter extensionFilter = new ExtensionFilter("JPG file", "*jpg");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showSaveDialog(null);
        if (file != null) ;
        {
            System.out.println("Сохраненике документа");
        }
    }

    @FXML
    protected void open(ActionEvent event) {
        FileChooser fileChooser2 = new FileChooser();
        fileChooser2.setTitle("Открытие документа");
        ExtensionFilter extFilter = new ExtensionFilter("JPG file", "*.jpg");
        fileChooser2.getExtensionFilters().add(extFilter);
        File file = fileChooser2.showOpenDialog(null);
        if (file != null) {
            System.out.println("Откртыие файла");
        }
    }

    @FXML
    protected void painPoint(ActionEvent event) throws IOException {
        gc = canvs.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillOval(10, 10, 5, 5);



        //gc.strokeLine(100, 100, 500, 100);
    }

    @FXML
    protected void saveWall(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnOK.getScene().getWindow();
        stage.close();

       /* gc = canvs.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.strokeLine(100, 100, 500, 100);*/
    }

    @FXML
    protected void clean(ActionEvent event) {
        gc.clearRect(0, 0, 600, 288);
    }
}