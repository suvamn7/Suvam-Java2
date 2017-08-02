/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessrecord;

/**
 *
 * @author Education Unlimited
 */
public class BusinessRecord {
    String name= "Bob" ;
    String phoneNumber= "404-244-1345"; 
 
    public BusinessRecord(String n, String pn)
    {
        n= name;
        pn= phoneNumber;
          String record= name + phoneNumber;
          
        }
    public void setName(String setName){
        if (setName != null)
          setName= name;  
    }
    public String getName()
    {
        return name;  
    }
    public String stringOut(){
        String output= name + "," + phoneNumber; 
        return output;
              
    }
    public void printOut(){
        System.out.println(stringOut());
    }
   
    }
