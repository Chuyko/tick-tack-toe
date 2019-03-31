package com.company;
 class Desk {
    // служебная переменная для работы метода xo()
     private int x = 0;
     // поле pole[][] используется для записи значений на игровом поле
     public int[][] pole = new int[3][3];
// метод inizialization() инициализирует цифрами от 1 до 9 поле. Повторяя цифровую клаву.
     public void inizialization() {
         int count =  -1;
         for (int i = 0; i < 3; i++) {
             count += 2;
             for (int j = 0; j < 3; j++) {
                 pole[i][j] =  i + j + count;
             }
         }
     }
// Метод deskDrawPole() выводит в консоль содержимое массива pole[][]
    public void deskDrawPole() {
         for (int i = 2; i > -1; i--) {
             System.out.println();
             for (int j = 0; j < 3; j++) {
                 switch (pole[i][j]){
                     case 10:
                         System.out.print("X ");
                         break;
                     case 0:
                         System.out.print("O ");
                         break;
                         default:
                             System.out.print(pole[i][j] + " ");
                             break;
                 }

             }
         }
     }
     // метод writer() записывает в ячейки массива числа по указанным кординатам
     public void writer(int pozition, int number){
         switch (pozition){
             case 1: pole[0][0] = number;
                 break;
             case 2: pole[0][1] = number;
                 break;
             case 3: pole[0][2] = number;
                 break;
             case 4: pole[1][0] = number;
                 break;
             case 5: pole[1][1] = number;
                 break;
             case 6: pole[1][2] = number;
                 break;
             case 7: pole[2][0] = number;
                 break;
             case 8: pole[2][1] = number;
                 break;
             case 9: pole[2][2] = number;
                 break;
              default:
                  System.out.println("Неправильный ввод, нажмите на цифру от 1 до 9");
         }
     }
     // метод xo возвращает или 0 или 10 при обращении к нему, начинает с 10
      int xo (){
         if (x == 0)
             x = 10;
         else
             x = 0;
         return x;
     }
 }