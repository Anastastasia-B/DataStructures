package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.fill();

        Scanner scan = new Scanner(System.in);

        boolean escape = false;
        while(!escape){
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Меню:\nПоказать словарь  -  нажмите 1\nПоиск  -  нажмите 2\nВставить  -  нажмите 3\n" +
                    "Удалить  -  нажмите 4\nЗавершить работу  -  нажмите 5");
            System.out.println("-----------------------------------------------------------------------------");
            switch (scan.nextInt()){
                case 1:
                    dictionary.print();
                    break;
                case 2:
                    dictionary.search();
                    break;
                case 3:
                    dictionary.add();
                    break;
                case 4:
                    dictionary.remove();
                    break;
                case 5:
                    escape = true;
            }
        }

    }


}
