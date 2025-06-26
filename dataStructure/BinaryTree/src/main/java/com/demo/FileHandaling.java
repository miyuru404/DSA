package com.demo;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class FileHandaling {

    String filePath = "src/inputs " ;

    public static void createFile(String filePath , String content){

        File file = new File(filePath);

        if(file.exists()){

            System.out.println("file is already been created.Any data will be add to the next line");

            try(FileWriter writer = new FileWriter(filePath,true)){
                writer.write(content +  System.lineSeparator());
                System.out.println("content : " + content);
            }
            catch(IOException e){

                System.err.println("something went wrong file couldn't created " + e );}
        }
        else {

            try(FileWriter writer = new FileWriter(filePath)){

                writer.write(content +  System.lineSeparator());
                System.out.println("file is created and content is added");
                System.out.println("content: " + content);

            }
            catch(IOException e){

                System.err.println("something went wrong file couldn't created " + e );}
        }


    }

    public static void readFileUsingBufferedReader(String filePath){

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            List<String> list = new ArrayList<String>();
            String line;
            while((line = reader.readLine()) != null){
                list.add(line);
                System.out.println(line);
            }
            System.out.println(list);
        }
        catch(IOException e){
            System.out.println("coudn't read the file " + e);
        }

    }

    public static void readNumbers(String filePath){

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){

                String[] tokens = line.trim().split("\\s+");
                HashSet<Integer> valuesSet = new HashSet<>();
                boolean duplicate = false;

                for (String token : tokens) {

                    int number = Integer.parseInt(token);

                    if (valuesSet.contains(number)) {
                        duplicate = true;
                        System.out.println("Duplicate value found: " + number);
                        break; // stop processing further

                    } else {
                        valuesSet.add(number); // add to set
                    }


                }
                if(duplicate){
                    System.out.println("Can't process due to a duplicate value");
                }
                else {
                System.out.println(valuesSet);
                }
            }

        }
        catch (IOException e){
            System.err.println("cannot read the file");
        }
        catch (NumberFormatException e){
            System.out.println("file contain non-integer values");
        }

    }

    public static void readFileUsingScanner(String filePath){

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(  line);
            }

        } catch (FileNotFoundException e) {
            System.err.println(" File not found: " + e.getMessage());
        }

    }






    public static void main(){

        //createFile("src/inputs/text2"," new data ");
        //readFileUsingBufferedReader( "src/inputs/text2" );
        //readFileUsingScanner( "src/inputs/text2" );
        readNumbers("src/inputs/text2");

    }
}
