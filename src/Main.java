public class Main {
    public static void main(String[] args) {
        // Задача 4

        int age = 20;
        if(age >= 18)
        {
            System.out.println("Поздравляем! Вам 18 или больше!");}
        else {
                System.out.println(" Вам еще нет 18, нужно немного подождать.");
            }



        // Задача 5

        int babyAge = 25;
        if (babyAge >= 7) {
            System.out.println("Ребенок ходит в школу");}
        else if(babyAge >= 18) {
        System.out.println("человек уже закончил школу и может отправляться в университет");}
        else if (babyAge >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");}

        // Задача 6

        int passenger = 80;

        if(passenger <= 60){
            System.out.println("В Вагоне имеются сидячие места");
        }
        else if(passenger < 102){
            System.out.println("В вагоне имеются стоячие места");
        }
         else if (passenger >= 102 ){
            System.out.println("В Вагоне мест нет");
        }

        // Задача 7

        int age2 = 20;
        if(age2 > 2 && age2 < 6){
            System.out.println("Человеку нужно ходить в детский сад");
        }
        else if(age2 > 7 && age2 < 18){
            System.out.println("Человеку нужно ходить в школу");
        }
        else if(age2 > 18 && age2 < 24){
            System.out.println("Человеку нужно ходить в университет");
        }
        else if(age2 < 24){
            System.out.println("Пора ходить на работу");
        }

        // Задание 8

        int attractionAge = 14;
        if(attractionAge < 5){
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if (attractionAge >= 5 && attractionAge < 14){
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }
        else if (attractionAge >= 14){
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        // Задача 9

        int one = 5;
        int two = 8;
        int three = 3;

        if(one > two && one > three){
            System.out.println("Большее число " + one);
        }
        else if(two > one && two > three){
            System.out.println("Большее число " + two);
        }
        else if(three > one && three > two){
            System.out.println("Большее число " + three);
        }





    }


}