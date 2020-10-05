/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import static java.lang.System.exit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author shabi
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ImageView Image_1;
    @FXML
    private ImageView Image_2;
    @FXML
    private TextField Name_Tf;
    @FXML
    private RadioMenuItem Soun_Rb;
    @FXML
    private MenuItem Close_Rb;
    @FXML
    private RadioMenuItem Order_Rb;
    @FXML
    private RadioMenuItem Name_Rb;
    @FXML
    private RadioMenuItem Photo_Rb;
    @FXML
    private TextField ID_Tf;
    
    private int x;
    private String pathToResources = "C:\\Users\\Doth55\\Documents\\NetBeansProjects\\Potus\\Resources\\";
    private String DataFile = pathToResources + "DataFile.dat";
    private static ArrayList<President> Presidents = new ArrayList<President>();
    @FXML
    private RadioMenuItem Date_Rb;
    @FXML
    private RadioMenuItem Free_Rb;
    @FXML
    private Button vote_Bt;
    @FXML
    private ToggleGroup Mode;
    @FXML
    private ToggleGroup Setting;
    @FXML
    private ToggleGroup Setting_;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        x = 0;
        RetrieveData();
        //updateImageViews("", "");
        
        try {
            File file = new File(pathToResources + Presidents.get(x).getFlag_1());
            File file_2 = new File(pathToResources + Presidents.get(x).getFlag_2());
            String localUrl = file.toURI().toURL().toString();
            String localUrl_2 = file_2.toURI().toURL().toString();
            Image_1.setImage(new Image(localUrl));
            Image_2.setImage(new Image(localUrl_2));
        } catch(Exception ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    // Read data
    private void ReadData() {
        try {
            // Read Data
            FileInputStream fileIn = new FileInputStream(DataFile);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Presidents = (ArrayList<President>) objIn.readObject();
            fileIn.close();
            objIn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void RetrieveData() {

        String line;
        President TempPresident;
        Presidents.clear();
        try {
            //File file = new File(Potus.class.getResource("/" + Presidents.get(x).getFlag_1()).getFile());
            //File file_2 = new File(Potus.class.getResource("/" + Presidents.get(x).getFlag_2()).getFile());
            File file = new File(pathToResources + "Potus.txt");
            BufferedReader input = new BufferedReader(new FileReader(file));

            while ((line = input.readLine()) != null) {
                //line = line.replaceAll("_", " ");
                String[] word = line.split(" ");
                /*System.out.println(word[0] + " " + word[1].replace("_", " ") + " "
                 + word[2].replace("_", " ") + " " + word[3].replace("_", " ")
                 + " " + word[4].replace("_", " ") + " " + word[5].replace("_", " ")
                 + " " + word[6].replace("_", " ") + " " + word[7].replace("_", " ") + " "
                 + word[8].replace("_", " ") + " " + word[9].replace("_", " ") + " "
                 + word[10].replace("_", " ") + " " + word[11].replace("_", " ") + " "
                 + word[12].replace("_", " ") + " " + word[13].replace("_", " ") + " "
                 + word[14].replace("_", " ") + " " + word[15].replace("_", " ") + " "
                 + word[16].replace("_", " ") + " " + word[17].replace("_", " ") + " "
                 + word[18].replace("_", " ") + " ");*/

                TempPresident = new President();
                TempPresident.setID(word[0].replace("_", " "));
                TempPresident.setName(word[1].replace("_", " "));
                TempPresident.setSymbol(word[2].replace("_", " "));
                TempPresident.setName_Full(word[3].replace("_", " "));
                TempPresident.setFrom(word[4].replace("_", " "));
                TempPresident.setTo(word[5].replace("_", " "));

                TempPresident.setVicePresident_Name_1(word[6].replace("_", " "));
                TempPresident.setVicePresident_Symbal_1(word[7].replace("_", " "));
                TempPresident.setVicePresident_Name_Full_1(word[8].replace("_", " "));
                TempPresident.setVicePresident_From_1(word[9].replace("_", " "));
                TempPresident.setVicePresident_To_1(word[10].replace("_", " "));

                TempPresident.setVicePresident_Name_2(word[11].replace("_", " "));
                TempPresident.setVicePresident_Symbal_2(word[12].replace("_", " "));
                TempPresident.setVicePresident_Name_Full_2(word[13].replace("_", " "));
                TempPresident.setVicePresident_From_2(word[14].replace("_", " "));
                TempPresident.setVicePresident_To_2(word[15].replace("_", " "));

                //TempPresident.setVicePresident_Name_3(word[16].replace("_", " "));
                //TempPresident.setVicePresident_Symbal_3(word[17].replace("_", " "));
                //TempPresident.setVicePresident_Name_Full_3(word[18].replace("_", " "));
                //TempPresident.setVicePresident_From_3(word[19].replace("_", " "));
                //TempPresident.setVicePresident_To_3(word[20].replace("_", " "));
                //System.out.println(TempPresident.getID() + ". " + TempPresident.getName() + " " + TempPresident.getFrom() + " " + TempPresident.getTo());
                Presidents.add(TempPresident);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    

    private void UpdateGui() {

        ID_Tf.setDisable(true);
        Name_Tf.setDisable(true);
        
        if (Order_Rb.isSelected()) {
            Name_Tf.setDisable(false);
            Name_Tf.setText("");
            ID_Tf.setText(Presidents.get(x).getID());

        }else if(Name_Rb.isSelected()) {
            ID_Tf.setDisable(false);
            ID_Tf.setText("");
            Name_Tf.setText(Presidents.get(x).getEntry(Date_Rb.isSelected()));

        } else if (Photo_Rb.isSelected()) {          
            ID_Tf.setDisable(false);
            Name_Tf.setDisable(false);
            ID_Tf.setText("");
            Name_Tf.setText("");

        } else if (Free_Rb.isSelected()) {  
            ID_Tf.setDisable(false);
            Name_Tf.setDisable(false);
            ID_Tf.setText(Presidents.get(x).getID());
            Name_Tf.setText(Presidents.get(x).getEntry(Date_Rb.isSelected()));           
        }
        
        updateImageViews(Presidents.get(x).getFlag_1(), Presidents.get(x).getFlag_2());      
        
        
    }
    
    private void updateImageViews(String image_1, String image_2){
        
        File file;
        File file_2;
        
        if(image_1.isEmpty()){           
            file = new File(pathToResources + "44_1.jpg");
            file_2 = new File(pathToResources + "44_2.jpg");
        }else{
            file = new File(pathToResources + image_1);
            file_2 = new File(pathToResources + image_2);
            System.out.println("Image 1: " + pathToResources + Presidents.get(x).getFlag_1() + " Image 2: " + pathToResources + Presidents.get(x).getFlag_2());
        }
        try {
            String localUrl = file.toURI().toURL().toString();
            String localUrl_2 = file_2.toURI().toURL().toString();
            Image_1.setImage(new Image(localUrl));
            Image_2.setImage(new Image(localUrl_2));
        } catch (MalformedURLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void Image_1_Function(MouseEvent event) {
        ID_Tf.setText(Presidents.get(x).getID());
        Name_Tf.setText(Presidents.get(x).getEntry(Date_Rb.isSelected()));
    }

    @FXML
    private void Image_2_Function(MouseEvent event) {
    }

    @FXML
    private void vote(ActionEvent event) {
        
        //for(int i = 0; i < Presidents.size(); i++){
            //System.out.println("ID: " + Presidents.get(i).getID() + " Name: " + Presidents.get(i).getName_Full() + " Date: " + Presidents.get(i).getFrom() + " " + Presidents.get(i).getTo());
        //}
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^x > 45");
        if(ID_Tf.getText().equals(Presidents.get(x).getID())){
            System.out.println("X_ID: " + Presidents.get(x).getID() + " " + ID_Tf.getText());
            if(Presidents.get(x).Verify(Name_Tf.getText().toUpperCase().split(" "), Date_Rb.isSelected())){
                x++;
                try{
                    UpdateGui();
                }catch(Exception ex){
                    x = 0;
                    UpdateGui();
                }
            }
        }
    }
    
    private void Reset(ActionEvent event) {
        x = 0;
        Collections.shuffle(Presidents);
        UpdateGui();
    }

    @FXML
    private void TerminateApp(ActionEvent event) {
        exit(0);
    }

    @FXML
    private void Order(ActionEvent event) {
        Reset(event);
    }

    @FXML
    private void Name(ActionEvent event) {
        Reset(event);
    }

    @FXML
    private void Photo(ActionEvent event) {
        Reset(event);
    }

    @FXML
    private void Date(ActionEvent event) {
        Reset(event);
    }

    @FXML
    private void Free(ActionEvent event) {
        x = 0;
        RetrieveData();
        UpdateGui();
        
    }

    @FXML
    private void Sound(ActionEvent event) {
    }

    
}
