import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticeListArray {
    public static void main(String[] args){

        ArrayList<String> customerNames = new ArrayList<String>();


        boolean quit = true;

        while(quit){
            String name = JOptionPane.showInputDialog(null, "Enter the customers name");
            if(name.equals("quit")){
                quit = false;
            }
            customerNames.add(name);

        }
        //for(int i = 0; i<= customerNames.size(); i++){
            //System.out.println(customerNames.get(i));
        //}
        System.out.println("Customer names are" + customerNames);

        Collections.sort(customerNames);
        System.out.println("Customer names are" + customerNames);


    }
}
