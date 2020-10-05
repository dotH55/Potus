/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class President {

    private String ID;
    private String Name;
    private String Name_Full;
    private String Symbol;
    private String VicePresident_Name_1;
    private String VicePresident_Name_2;
    private String VicePresident_Name_3;
    private String VicePresident_Name_Full_1;
    private String VicePresident_Name_Full_2;
    private String VicePresident_Name_Full_3;
    private String VicePresident_Symbal_1;
    private String VicePresident_Symbal_2;
    private String VicePresident_Symbal_3;
    private String VicePresident_From_1;
    private String VicePresident_From_2;
    private String VicePresident_From_3;
    private String VicePresident_To_1;
    private String VicePresident_To_2;
    private String VicePresident_To_3;
    private String From;
    private String To;

    public President() {

        ID = "N/A";
        Name = "N/A";
        Name_Full = "N/A";
        Symbol = "N/A";
        VicePresident_Name_1 = "N/A";
        VicePresident_Name_2 = "N/A";
        VicePresident_Name_3 = "N/A";
        VicePresident_Name_Full_1 = "N/A";
        VicePresident_Name_Full_2 = "N/A";
        VicePresident_Name_Full_3 = "N/A";
        VicePresident_Symbal_1 = "N/A";
        VicePresident_Symbal_2 = "N/A";
        VicePresident_Symbal_3 = "N/A";
        VicePresident_From_1 = "N/A";
        VicePresident_From_2 = "N/A";
        VicePresident_From_3 = "N/A";
        VicePresident_To_1 = "N/A";
        VicePresident_To_2 = "N/A";
        VicePresident_To_3 = "N/A";
        From = "N/A";
        To = "N/A";
    }
    
    public boolean hasVicePresident_1(){
        return !getVicePresident_Name_1().equals("N/A");
    }
    
    public boolean hasVicePresident_2(){
        return !getVicePresident_Name_2().equals("N/A");
    }
    
    public boolean hasVicePresident_3(){
        return !getVicePresident_Name_2().equals("N/A");
    }
    
    public boolean verifyEntry(String entry){
        
        boolean bool = true;
        
        return bool;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getFlag_1() {
        return getID() + "_1.jpg";
    }

    public String getFlag_2() {
        return getID() + "_2.jpg";
    }

    public String getName_Full() {
        return Name_Full;
    }

    public void setName_Full(String Name_Full) {
        this.Name_Full = Name_Full;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getVicePresident_Name_1() {
        return VicePresident_Name_1;
    }

    public void setVicePresident_Name_1(String VicePresident_Name_1) {
        this.VicePresident_Name_1 = VicePresident_Name_1;
    }

    public String getVicePresident_Name_2() {
        return VicePresident_Name_2;
    }

    public void setVicePresident_Name_2(String VicePresident_Name_2) {
        this.VicePresident_Name_2 = VicePresident_Name_2;
    }

    public String getVicePresident_Name_3() {
        return VicePresident_Name_3;
    }

    public void setVicePresident_Name_3(String VicePresident_Name_3) {
        this.VicePresident_Name_3 = VicePresident_Name_3;
    }

    public String getVicePresident_Name_Full_1() {
        return VicePresident_Name_Full_1;
    }

    public void setVicePresident_Name_Full_1(String VicePresident_Name_Full_1) {
        this.VicePresident_Name_Full_1 = VicePresident_Name_Full_1;
    }

    public String getVicePresident_Name_Full_2() {
        return VicePresident_Name_Full_2;
    }

    public void setVicePresident_Name_Full_2(String VicePresident_Name_Full_2) {
        this.VicePresident_Name_Full_2 = VicePresident_Name_Full_2;
    }

    public String getVicePresident_Name_Full_3() {
        return VicePresident_Name_Full_3;
    }

    public void setVicePresident_Name_Full_3(String VicePresident_Name_Full_3) {
        this.VicePresident_Name_Full_3 = VicePresident_Name_Full_3;
    }

    public String getVicePresident_Symbal_1() {
        return VicePresident_Symbal_1;
    }

    public void setVicePresident_Symbal_1(String VicePresident_Symbal_1) {
        this.VicePresident_Symbal_1 = VicePresident_Symbal_1;
    }

    public String getVicePresident_Symbal_2() {
        return VicePresident_Symbal_2;
    }

    public void setVicePresident_Symbal_2(String VicePresident_Symbal_2) {
        this.VicePresident_Symbal_2 = VicePresident_Symbal_2;
    }

    public String getVicePresident_Symbal_3() {
        return VicePresident_Symbal_3;
    }

    public void setVicePresident_Symbal_3(String VicePresident_Symbal_3) {
        this.VicePresident_Symbal_3 = VicePresident_Symbal_3;
    }

    public String getVicePresident_From_1() {
        return VicePresident_From_1;
    }

    public void setVicePresident_From_1(String VicePresident_From_1) {
        this.VicePresident_From_1 = VicePresident_From_1;
    }

    public String getVicePresident_From_2() {
        return VicePresident_From_2;
    }

    public void setVicePresident_From_2(String VicePresident_From_2) {
        this.VicePresident_From_2 = VicePresident_From_2;
    }

    public String getVicePresident_From_3() {
        return VicePresident_From_3;
    }

    public void setVicePresident_From_3(String VicePresident_From_3) {
        this.VicePresident_From_3 = VicePresident_From_3;
    }

    public String getVicePresident_To_1() {
        return VicePresident_To_1;
    }

    public void setVicePresident_To_1(String VicePresident_To_1) {
        this.VicePresident_To_1 = VicePresident_To_1;
    }

    public String getVicePresident_To_2() {
        return VicePresident_To_2;
    }

    public void setVicePresident_To_2(String VicePresident_To_2) {
        this.VicePresident_To_2 = VicePresident_To_2;
    }

    public String getVicePresident_To_3() {
        return VicePresident_To_3;
    }

    public void setVicePresident_To_3(String VicePresident_To_3) {
        this.VicePresident_To_3 = VicePresident_To_3;
    }

    public String GetCompareTo_PresidentName() {
        return getName() + getFrom() + getTo();
    }

    public String GetCompareTo_PresidentFullName() {
        return getName_Full() + getFrom() + getTo();
    }

    public String GetCompareTo_VicePresidentName_1() {
        return getVicePresident_Name_1() + " " + getVicePresident_From_1() + " " + getVicePresident_To_1();
    }
    
    public String getEntry(boolean date){
        if(date){
            return getName_Full() + " " + getFrom() + " " + getTo(); 
        }else{
            return getName_Full();
        }
        
    }
    
    public ArrayList<String> getStringEntries(boolean date){
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(getName_Full().toUpperCase().split(" ")));
        temp.addAll(Arrays.asList(getName().toUpperCase().split(" ")));
        if(date){
            temp.add(getFrom());
            temp.add(getTo());
            temp.add(getFrom() + "-" + getTo().substring(2));
        }
        
        return temp;
    }
    
    public String getNameFullDate(){
        return getName() + " " + getFrom() + " " +  getTo();
    }
    
    //Keep
    public String getNameDate(){
        return getName() + " " + getFrom() + "-" + getTo().substring(2, 4);
    }
    
    public String getFullNameDate(){
        return getName_Full() + getFrom() + "-" + getTo().substring(2, 4);
    }
    
    public boolean Verify(String[] entry, boolean date){
        
        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, entry);
        System.out.println("Entry: " + wordList);
        System.out.println("T: " + getStringEntries(true));
        boolean tempBool = true;
        if(date){
            if(!(wordList.contains(getFrom()) && wordList.contains(getTo())) || wordList.contains("-" + getTo().substring(2, 4))){
                tempBool = false;
            }
        }
        
        for(int i = 0; i < entry.length; i++){
            if(getStringEntries(date).contains(entry[i])){
                System.out.println("x: " + entry[i]);
                continue;
            }else{
                System.out.println("Error: " + entry[i]);
                tempBool = false;
            }
        }
        return tempBool;
    }

    /*public String GetCompareTo_VicePresidentName_2(){
        
     }
    
     public String GetCompareTo_VicePresidentName_3(){
        
     }
    
     public String GetCompareTo_VicePresidentFullName_1(){
     return 
     }
    
     public String GetCompareTo_VicePresidentFullName_2(){
        
     }
    
     public String GetCompareTo_VicePresidentFullName_3(){
        
     }*/
}
