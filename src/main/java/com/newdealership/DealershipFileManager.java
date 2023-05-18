package com.newdealership;

import java.io.FileWriter;
import java.io.IOException;
import java.util.IllegalFormatConversionException;

public class DealershipFileManager {

  public static void writeDealershipFile(Dealership dealership){
      try{
          FileWriter fileWriter = new FileWriter("DealershipFile.csv", true);

          fileWriter.write(String.format("%s| %s| %s %s", dealership.getName(), dealership.getAddress(), dealership.getPhoneNumber(), dealership.getInventory()));
          fileWriter.close();
      }
      catch(IOException ioException){
          System.out.println("Could not write to transactions.csv file. There was an error.");
          ioException.printStackTrace();
      }
       catch(IllegalFormatConversionException formatException){
           System.out.println("Sorry, be sure to input your information in the correct format.");
           formatException.printStackTrace();
       }
  }
    public Dealership getDealership(){
        return null;
    }

    public Dealership saveDealership(){
        return null;
    }
       }

