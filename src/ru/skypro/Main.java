package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 1
       int dog = 7;
       byte cat = 1;
       short mouse = 3;
       long elephant = 110L;
       double sugarWeight = 4.5;
       float saltWeight = 1.5f;
       boolean dogIsAdult = dog > 10;
       char bar = 35;

       //Задание 2
       double boxer1 = 78.2;
       double boxer2 = 82.7;
       double weightOfAllBoxers = boxer1 + boxer2;
       double weightDifference = boxer2 - boxer1;
       System.out.println("Общий вес боксеров " + weightOfAllBoxers);
       System.out.println("Разница в весе боксеров " + weightDifference);

       //Задание 3
       int bananas = 5;
       int milk = 2;
       int iceСream = 2;
       int eggs = 4;
       int bananasWeight = 80;
       int milkWeight = 105;
       int iceCreamWeight = 100;
       int eggsWeight = 70;
       int bananasInGrams = bananas * bananasWeight;
       int milkInGrams = milk * milkWeight;
       int iceCreamInGrams = iceСream * iceCreamWeight;
       int eggsInGrams = eggs * eggsWeight;
       System.out.println("Вес бананов в граммах " + bananasInGrams);
       System.out.println("Вес молока в граммах " + milkInGrams);
       System.out.println("Вес мороженного в граммах " + iceCreamInGrams);
       System.out.println("Вес яиц в граммах " + eggsInGrams);
       int allWeightInGrams = bananasInGrams + milkInGrams + iceCreamInGrams + eggsInGrams;
       System.out.println("Общий вес в граммах " + allWeightInGrams);
       float allWeightInKg = allWeightInGrams / 1000f;
       System.out.println("Общий вес в кг " + allWeightInKg);

       //Задание 4
       byte boxer = 80;
       byte desiredWeight = 73;
       byte needToLoseWeight = 7;
       byte daysToLooseWeight250 = 4 * 7;
       byte daysToLooseWeight500 = 2 * 7;
       System.out.println("Всего дней при 250 " + daysToLooseWeight250);
       System.out.println("Всего дней при 500 " + daysToLooseWeight500);
       int daysOnAverage = (daysToLooseWeight250 + daysToLooseWeight500) / 2;
       System.out.println("В среднем дней " + daysOnAverage);

       //Задание 5
       int masha = 67_760;
       int denis = 83_690;
       int kristina = 76_230;
       float masha1percent = 67_760f / 100f;
       float denis1percent = 83_760f / 100f;
       float kristina1percent = 76_230f / 100f;
       System.out.println("1 процент Маши " + masha1percent);
       System.out.println("1 процент Дениса " + denis1percent);
       System.out.println("1 процент Кристины " + kristina1percent);
       float masha10percents = 677.7f * 10f;
       float denis10percents = 837.6f * 10f;
       float kristina10percents = 762.3f * 10f;
       System.out.println("10 процентов Маши " + masha10percents);
       System.out.println("10 процентов Дениса " + denis10percents);
       System.out.println("10 процентов Кримтины " + kristina10percents);
       float masha110percent = masha + masha10percents;
       float denis110percent = denis + denis10percents;
       float kristina110percent = kristina + kristina10percents;
       System.out.println("Теперь получает Маша " + masha110percent);
       System.out.println("Теперь получает Денис " + denis110percent);
       System.out.println("Теперь получает Кристина " + kristina110percent);
       float mashaNowInMonth = 74_537.0f;
       float denisNowInMonth = 92_066.0f;
       float kristinaNowInMonth = 83_853.0f;
       float mashaNowInYear = 74_537.0f * 12;
       float denisNowInYear = 92_066.0f * 12;
       float kristinaNowInYear = 83_853.0f * 12;
       System.out.println("В год Маша получает " + mashaNowInYear);
       System.out.println("В год Денис получает " + denisNowInYear);
       System.out.println("В год Кристина получает " + kristinaNowInYear);
       float mashaLastYear = 67_760 * 12;
       float denisLastYear = 83_690 * 12;
       float kristinaLastYear = 76_230 * 12;
       System.out.println("Маша получала в прошлом году " + mashaLastYear);
       System.out.println("Денис получал в прошлом году " + denisLastYear);
       System.out.println("Кристина получала в прошлом году " + kristinaLastYear);
       int mashaDifference = 89_4444 - 81_3120;
       int denisDifference = 110_4792 - 100_4280;
       int kristinaDifference = 100_6236 - 91_4760;
       System.out.println("Разница зарплаты Маши " + mashaDifference);
       System.out.println("Разница зарплаты Дениса " + denisDifference);
       System.out.println("Разница зарплаты Кристины " + kristinaDifference);






    }
}
