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
    static String str, command, toDO;
    static ArrayList<String> my_toDo = new ArrayList<String>();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        while (true) {
            str = sc.nextLine();
            String[] inputArray = str.split("\\s+");
            
            if (str != null) {
                command = inputArray[0];
                command = command.toLowerCase();
            }
            
            if(inputArray.length==1 && command.equals("list")){
               list_console();
            }
            
            if (command.equals("add") || command.equals("done") || command.equals("list")) {
                if (command.equals("add")) {
                    toDO = trim_add(str);
                    my_toDo.add(toDO);
//                    System.out.println(my_toDo.toString());
                    System.out.println("Created task " + my_toDo.size());
                }
//                if (command.equals("list")) {
//                    list_console();
//                }
            } else {
                System.out.println("Invalid command");
            }
        }
    }

    public static String trim_add(String str2) {
        str2 = (String) str2.subSequence(4, str2.length());
        return str2;
    }

    public static String list_console() {
        System.out.println("ID Description");
        System.out.println("_ _  _ _ _ _ _ "+"\n");
        for(int i=0; i<my_toDo.size();i++){
            System.out.println(my_toDo.indexOf(my_toDo.get(i))+1+" "+my_toDo.get(i));
        }
        return null;

    }
}
