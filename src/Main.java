import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task2() {
        System.out.println("Задание 2");
        var dog = 8.0 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task3() {
        System.out.println("Задание 3");
        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task4() {
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        var friendWithMultiply = friend * 2;
        System.out.println("Multiply = " + friendWithMultiply);
        var friendWithDivision = friendWithMultiply / 7;
        System.out.println("Division = " + friendWithDivision);
    }
    public static void task5() {
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        var frogWithMultiply = frog * 10;
        System.out.println("Multiply = " + frogWithMultiply);
        var frogWithDivision = frogWithMultiply / 3.5;
        System.out.println("Division = " + frogWithDivision);
        var frogWithSumm = frogWithDivision + 4;
        System.out.println("Summ = " + frogWithSumm);

    }
    public static void task6() {
        System.out.println("Задача 6");
        var firstWeightFighter = 78.2;
        var secondWeightFigheter = 82.7;
        var totalWeightFighters = firstWeightFighter+secondWeightFigheter;
        var differenceBetweenWeight = secondWeightFigheter - firstWeightFighter;
        System.out.println("Общий вес бойцов " + totalWeightFighters);
        System.out.println("Разница в весе между юойцами " + differenceBetweenWeight);
    }
    public static void task7() {
        System.out.println("Задача 7");
        var firstWeightFighter = 78.2;
        var secondWeightFigheter = 82.7;
        var firstWay = secondWeightFigheter - firstWeightFighter;
        var secondWay = secondWeightFigheter % firstWeightFighter;
        System.out.println("Разница веса между бойцами расчитанная первым способом равна " + firstWay);
        System.out.println("Разница веса между бойцами расчиттаная вторым способом равна " + secondWay);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var workingTimePerson = 8;
        var numberOfPersons = totalWorkingTime / workingTimePerson;
        System.out.println("Всего работников в компании - " + numberOfPersons + " человек");
        var newNumberOfPerson = numberOfPersons + 94;
        var newTotalWorkingTime = newNumberOfPerson * workingTimePerson;
        System.out.println("Если в компании работает " +newNumberOfPerson+ " человек, то всего " +newTotalWorkingTime+
                " часов может быть поделено между сотрудниками" );

    }



}