
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0774775
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        Random rand = new Random();
        
        for (int i = 0; i < rand.nextInt(500000); i++) {
             System.out.println(i);
        }
        
        
        /* File myFile = new File("C:\\Users\\0774775\\names.txt");

        Scanner fileScanner = new Scanner(myFile);

        while(fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }
        
        fileScanner.close(); */

    }

