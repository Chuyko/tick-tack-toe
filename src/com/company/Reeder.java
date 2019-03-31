package com.company;

import java.util.Scanner;

class Reeder {

   // метод readeKey() читает введённые числа из клавиатуры  возвращает число от 1 до 9
      int readerKey(){
         Scanner keyboard = new Scanner(System.in);
         int myint = keyboard.nextInt();
         return myint;
     }

}
