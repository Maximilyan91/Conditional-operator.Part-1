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

        // Задача 3

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




    }

}