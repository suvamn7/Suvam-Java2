/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Education Unlimited
 */
public class Market {
    Queue q;
    double gains;
    public Market(){
        q= new Queue(); 
        gains=0;
    }
    public void buyShares(int shares, double price){
      for (int i= 0; i< shares; i++){
          q.insert(price);
      }
       
    }
    public void sellShares(int shares, double price){
        for(int i=0; i> shares; i++){
             double buyPrice =q.remove(); 
             gains+= price - buyPrice;  
        }
        
        
        

        
    }


    
          
}
    

