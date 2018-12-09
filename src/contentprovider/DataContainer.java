/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentprovider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Artur
 */
public class DataContainer {

    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        String filePath = "C:\\csv\\country.csv";
        
        System.out.println("starting write country.csv file: " + filePath);
        writeCsv(filePath);
        
        System.out.println("starting read country.csv");
        readCsv(filePath);  // printing all data
    }    
    
    
    public static void writeCsv(String filePath){ // adding data
        List<DataProvider> countries = new ArrayList<DataProvider>();
        
        // create countries
        DataProvider country = new DataProvider();
        country.setId(1);
        country.setState("France");
        country.setCapital("Paris");
        countries.add(country);
        
        country = new DataProvider();
        country.setId(2);
        country.setState("Poland");
        country.setCapital("Warsaw");
        countries.add(country);
        
        country = new DataProvider();
        country.setId(3);
        country.setState("UK");
        country.setCapital("London");
        countries.add(country);
        
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath); // update
            // fileWriter = new FileWriter(filePath, false); // remove delete content
            
            //fileWriter.append("Id, State, Capital");
            for(DataProvider c: countries) {
                fileWriter.append(String.valueOf(c.getId()));
                fileWriter.append(";");
                fileWriter.append(c.getState());
                fileWriter.append(";");
                fileWriter.append(c.getCapital());
                fileWriter.append("\n");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    }  
    
    public static void readCsv(String filePath) { // loading data
        BufferedReader reader = null;
        
        try {
            List<DataProvider> countries = new ArrayList<DataProvider>();
            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();
            
            while((line = reader.readLine()) != null){
                //while((line = reader.readLine()) <= 20){
                String[] fields = line.split(";");
             
            /*    
            for(int i=0; i<=20; i++) {
                while (file.hasNextLine()) {
                        count++;
                        file.nextLine();
                }
            }
            */  
                if(fields.length > 0) {
                    DataProvider country = new DataProvider();
                    country.setId(Integer.parseInt(fields[0]));
                    country.setState(fields[1]);
                    country.setCapital(fields[2]);
                    countries.add(country);
                }
            }
            
            for(DataProvider c: countries) {
                System.out.printf("%s;%s;%s\n", c.getId(), c.getState(), c.getCapital()); // printing all elements on the console
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
