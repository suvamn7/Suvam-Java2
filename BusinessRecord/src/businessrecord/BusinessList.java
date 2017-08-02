/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Education Unlimited
 */
public class BusinessList {
    int numberOfBusinesses;
    BusinessRecord[] BusinessList;
    int numUnsuccessfulSearch;
    int numSearches;
    public BusinessList(String fileName) {
        

        int index = 0;
        String FILENAME = "BusinessList";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            numberOfBusinesses= Integer.parseInt(currentLine);
            BusinessList= new BusinessRecord[numberOfBusinesses];
            
            currentLine= reader.readLine();
            while (currentLine != null) {
               String[] r = currentLine.split(",");
               BusinessRecord b = new BusinessRecord(r[0], r[1]);
               BusinessList[index]= b;
                index++;
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    /**
     *
     */
            public void St mergeSort(){
                
            }
            
        }



        }

    

