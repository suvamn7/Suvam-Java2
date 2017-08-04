/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalProject {
    private ArrayList<room> rooms= new ArrayList();
 Scanner sc=new Scanner(System.in);
    String input= sc.next();

    class Option {
        String description;
        String tag;
        
    }
    class room{ 
    public ArrayList<String> description;
    public ArrayList <Option> options;
    String name;
    
       room(){
           description= new ArrayList();
           options = new ArrayList();
          

       } 
       public void print() {
   }

       
      
    }
    public void readFile(String fileName){
 
	try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
           
            String currentLine = reader.readLine();
            
            room r=new room();
            while (currentLine != null) {
		if (currentLine.charAt(0)== 'r'){
                    r= new room();
                    r.name= currentLine.substring(1,currentLine.length());
                    
                }
                else if(currentLine.charAt(0)== 'd'){
                    r.description.add(currentLine.substring(1,currentLine.length()));
                }
                else if(currentLine.charAt(0)== 'o'){
                    Option o= new Option();
                    o.description=currentLine.substring(1,currentLine.length());
                    currentLine=reader.readLine();
                    o.tag= currentLine.substring(1,currentLine.length());
                    r.options.add(o);
                }
                else{
                    rooms.add(r);
                }
                currentLine = reader.readLine();
            }
            rooms.add(r);
	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
        
        
               
           
           
       
    

   public void quit(){
       while (input== "q"){
           room()=null;
           break; 
   }
}
   public double restart(){
        if (input== "r"){
           return room[r]; 
        } else {
            System.out.println("Error");
        }
        return room[0];
   }

  class input {

        public input() {
        if (input != "q"){

}
        }
    }
    
    //memory for the rooms visited
    //ability to revisit other rooms 
    class stack {
        private Double[] stack; 
        private int size;
        
        stack(){
            stack= new Double [100];
        }
        public void push(Double d) {
            stack[size++]=d;
        }
        public Double pop() {
            Double temp= stack[size-1];
            stack[size-1]= null;
            size--;
            return temp;       
        }
        public Double peel() {
            return stack[size-1];
        }
        public int size() {
            return size;
        }
        
    }
}
    




