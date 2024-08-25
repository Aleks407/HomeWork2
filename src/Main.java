public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println(dog+4);
        System.out.println(cat+4);
        System.out.println(paper+4);

        System.out.println(dog-3.5);
        System.out.println(cat-1.6);
        System.out.println(paper-7639);

        System.out.println(friend);
        System.out.println(friend+2);
        System.out.println((friend+2)/7);
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog*10);
        System.out.println((frog*10)/3.5);
        System.out.println(((frog*10)/3.5)+4);
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var resultSumm = weightFirstBoxer+weightSecondBoxer;
        var resultDifference = weightSecondBoxer-weightFirstBoxer;
        var resultOfweight= weightSecondBoxer%weightFirstBoxer;

        System.out.println("Общий вес бойцов "+resultSumm);
        System.out.println("Разница в весе "+ resultDifference);
        System.out.println("Отстаток от деления "+ resultOfweight);

        var hours = 640 ;
        var employees = 640/8;
        var moreEmployees = employees+94;
        var newHours = hours/moreEmployees;
        System.out.println("Всего работников в компании " + employees+ " человек");
        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего "
                + newHours + " часов работы может быть поделено между сотрудниками.");



    }
}



