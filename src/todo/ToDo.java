/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.ArrayList;
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
        String str, command, toDO;
        ArrayList<String> my_toDo = new ArrayList<String>();
        while (true) {
            str = sc.nextLine();
            String[] inputArray = str.split("\\s+");
            command = inputArray[0];
            toDO = inputArray[1];
            command = command.toLowerCase();
            if (command.equals("add") || command.equals("list") || command.equals("done")) {
                if(command.equals("add")){
                    toDO=trim_add(str);
                    System.out.println(toDO);
                }
            } else {
                System.out.println("Invalid command");
            }
        }
    }

    public static String trim_add(String str2) {
        str2=(String) str2.subSequence(4, str2.length());
        return str2;

    }
}
