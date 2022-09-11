public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int pen = 10;
        byte eraser = 5;
        short letter = 25;
        long brick = 534767456546L; //можно записать с подчеркиваниями 4_493_548_555L
        float volumeWeight1 = 1.12345678f;
        float volumeWeight2 = 2.12345678f; //Непонятно - почему получается 2.1234567, а не округляется до 2.1234568
        double volumeWeight3 = 2.12345678;
        System.out.println("Значение переменной pen с типом int равно " + pen);
        System.out.println("Значение переменной eraser с типом byte равно " + eraser);
        System.out.println("Значение переменной letter с типом short равно " + letter);
        System.out.println("Значение переменной brick с типом long равно " + brick);
        System.out.println("Значение переменной volumeWeight1 с типом float равно " + volumeWeight1);
        System.out.println("Значение переменной volumeWeight2 с типом float равно " + volumeWeight2);
        System.out.println("Значение переменной volumeWeight3 с типом double равно " + volumeWeight3);
        System.out.println();

        System.out.println("Задача 2");
        // 27.12 ,  987 678 965 549 , 2.786 , false, 569 , -159 , 27897 , 67
        // byte, short, int, long, float, double, char, boolean
        byte a = 67;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = -159;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 27897;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 987678965549L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 27.12f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 2.786;
        System.out.println("Значение переменной f с типом double равно " + f);
        char g = 569;
        System.out.println("Значение переменной g с типом char равно " + g);
        boolean h = false;
        System.out.println("Значение переменной h с типом boolean равно " + h);

        // byte aa = -128; // до 127
        // short bb = -32768; // до 32767
        // int cc = -2147483648; // до 2147483647
        // long dd = -9223372036854775808L; // до 9223372036854775807
        // float ee = 5.5f;
        // double ff = 6.6;
        // char gg = 7; // от 0 до 65536
        // boolean hh = false;

        System.out.println("Переменные всех типов инициализированы");
        System.out.println();

        System.out.println("Задача 3");
        // Три учительницы закупили все вместе 480 листов бумаги на все три класса
        // У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников
        // сколько достанется листов каждому ученику
        int lpStudent = 23;
        int asStudent = 27;
        int eaStudent = 30;
        int totalSheet = 480;
        int studentSheet = totalSheet / (lpStudent + asStudent + eaStudent);
        System.out.println("На каждого ученика рассчитано " + studentSheet + " листов бумаги");
        //или System.out.println("На каждого ученика рассчитано " + totalSheet / (lpStudent + asStudent + eaStudent) + " листов бумаги");
        System.out.println();

        System.out.println("Задача 4");
        // Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        // за 20 минут, в сутки, за 3 дня, за 1 месяц
        // "За … машины произвела бутылок … штук "
        int performance = 16; //производительность за 2 минуты
        int performanceTime = 2; //время производительности
        int performanceMinute = performance / performanceTime; //производительность за 1 минуту
        int time = 20; //время работы машины в минутах
        System.out.println("За " + time + " минут машина произвела бутылок " + time * performanceMinute + " штук");
        time = 60 * 24; //сутки
        System.out.println("За " + time + " минут (1 сутки) машина произвела бутылок " + time * performanceMinute + " штук");
        time *= 3; //3 суток
        System.out.println("За " + time + " минут (3 суток) машина произвела бутылок " + time * performanceMinute + " штук");
        time *= 10; //30 суток
        System.out.println("За " + time + " минут (1 месяц - 30 суток) машина произвела бутылок " + time * performanceMinute + " штук");
        System.out.println();

        System.out.println("Задача 5");
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой
        // На один класс уходит 2 банки белой и 4 банки коричневой краски
        // Сколько банок каждой краски было куплено? 2x + 4x = 120; x = 20; 2*20 белой и 4*20 коричневой
        int paintCans = 120;
        int classWhiteCan = 2;
        int classBrownCan = 4;
        int classes = paintCans / (classWhiteCan + classBrownCan); //всего классов
        System.out.println("В школе, где " + classes + " классов, нужно " + classWhiteCan * classes + " банок белой краски и " + classBrownCan * classes + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6");
        // Бананы – 5 штук (1 банан - 80 грамм);
        // Молоко – 200 мл (100 мл = 105 грамм);
        // Мороженое пломбир – 2 брикета по 100 грамм;
        // Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        // Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы
        // Bananas - 5 pieces (1 banana); Milk; Ice cream seal - 2 briquettes of 100 grams; Raw eggs - 4 eggs (1 egg - 70 grams).
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int totalWeightG = 5 * bananaWeight + 200 / 100 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        float totalWeightKg = (float)totalWeightG / 1000;
        System.out.println("Вес завтрака составляет " + totalWeightG + " граммов или " + totalWeightKg + " килограмм");
        System.out.println();

        System.out.println("Задача 7");
        // спортсмену нужно сбросить 7 кг
        // спортсмен может терять в весе от 250 до 500 грамм в день
        // сколько дней уйдёт, если спортсмен каждый день будет худеть на 250г и сколько, если на 500г
        // сколько может потребоваться дней в среднем, чтобы добиться результата похудения
        // 7/250 целых дней; 7/500 целых дней; (7/((250+500)/2) целых дней в среднем - округляем в большую сторону
        int lossWeightKg = 7;
        int lossWeightG = lossWeightKg * 1000;
        int lossWeightDayMin = 250;
        int lossWeightDayMax = 500;
        int lossWeightDayAverage = (lossWeightDayMin + lossWeightDayMax) / 2;
        int maxDay = lossWeightG / lossWeightDayMin;
        int minDay = lossWeightG / lossWeightDayMax;

        int averageDayInt = lossWeightG / lossWeightDayAverage; // 18 Целых дней для похудения в среднем
        System.out.println(averageDayInt);
        float averageDayF = (float)lossWeightG / lossWeightDayAverage; // 18,666666 Точных дней для похудения в среднем
        System.out.println(averageDayF);
        float averageDayRemainder = averageDayF % averageDayInt; // 0,66666603 Остаток от деления Точных и целых дней
        System.out.println(averageDayRemainder);
        int averageDayIncomplete = averageDayInt - (int)((float)averageDayInt - averageDayRemainder); // 1 неполный день
        System.out.println(averageDayIncomplete);
        int averageDay = averageDayInt + averageDayIncomplete; // 18 Целых и 1 неполный день для похудения в среднем, всего 19 дней
        System.out.println(averageDay);

        System.out.println("Если спортсмен каждый день будет худеть на " + lossWeightDayMin + " г, то он похудеет на 7 кг за " + maxDay + " дней");
        System.out.println("Если спортсмен каждый день будет худеть на " + lossWeightDayMax + " г, то он похудеет на 7 кг за " + minDay + " дней");
        System.out.println("В среднем, чтобы похудеть на 7 кг, спортсмену понадобится " + averageDay + " дней");
        System.out.println();

        System.out.println("Задача 8");
        // Маша получает 67 760 рублей в месяц
        // Денис получает 83 690 рублей в месяц
        // Кристина получает 76 230 рублей в месяц
        // Каждому нужно увеличить зарплату на 10% от текущей месячной
        // Маша теперь получает **** рублей. Годовой доход вырос на **** рублей
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int cristinaSalaryYear = cristinaSalary * 12;
        System.out.println("Маша теперь получает " + (mashaSalary + mashaSalary * 10 / 100) + " рублей. Годовой доход вырос на " + (int)(mashaSalaryYear * 0.1) + " рублей");
        System.out.println("Денис теперь получает " + (int)(denisSalary * 0.1) + " рублей. Годовой доход вырос на " + (int)(denisSalaryYear * 0.1) + " рублей");
        System.out.println("Кристина теперь получает " + (int)(cristinaSalary * 0.1) + " рублей. Годовой доход вырос на " + (int)(cristinaSalaryYear * 0.1) + " рублей");
        System.out.println();

    }
}