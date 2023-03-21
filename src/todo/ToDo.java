/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.Scanner;

/**
 *
 * @author SKLAD
 */
public class ToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str, command, item;

        while (true) {
            str = sc.nextLine();
            String[] inputArray = str.split("\\s+");
            command = inputArray[0];
            item = inputArray[1];
            if(command.equals("add") || command.equals("list") || command.equals("done")){
                System.out.println("sdfsdf");
          
            }
            else{
                System.out.println("Invalid");
            }
        }

    }

}
