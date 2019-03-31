package com.company;
// Класс Vinner определяет победителя с помощью метода vinDetect
public class Vinner {
    void vinDetect(int[][]pol){
for (int a = 0; a < 11; a+=10) {
           if
           ((pol[0][0] == a && pol[0][1] == a && pol[0][2] == a) ||

                   (pol[1][0] == a && pol[1][1] == a && pol[1][2] == a) ||
                   (pol[2][0] == a && pol[2][1] == a && pol[2][2] == a) ||
                   (pol[0][0] == a && pol[1][0] == a && pol[2][0] == a) ||
                   (pol[0][1] == a && pol[1][1] == a && pol[2][1] == a) ||
                   (pol[0][2] == a && pol[1][2] == a && pol[2][2] == a) ||
                   (pol[0][0] == a && pol[1][1] == a && pol[2][2] == a) ||
                   (pol[0][2] == a && pol[1][1] == a && pol[2][0] == a)){
               if (a==0){
                   System.out.println();
               System.out.println("ВЫИГРАЛИ НОЛИКИ");}
               else System.out.println("ВЫИГРАЛИ КРЕСТИКИ");
           }
       }
        }




    }

