// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 4;
        System.out.println(a);
        byte b = 7;
        System.out.println(b);
        short sh = 189;
        System.out.println(sh);
        long l = 123456689L;
        System.out.println(l);
        float f = 12.3f;
        System.out.println(f);
        double d = 14.342356787;
        System.out.println(d);

        float fl= 27.12F;
        System.out.println(fl);
        long lo = 987678965549L;
        System.out.println(lo);
        float flo = 2.786F;
        System.out.println(flo);
        short sho = 569;
        System.out.println(sho);
        short ab = -159;
        System.out.println(ab);
        int abc = 27897;
        System.out.println(abc);
        byte bc = 67;
        System.out.println(bc);

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int totalStudents = lp + as + ea;
        short sheets = 480;
        int sheetsStudent = sheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");

        byte bottlesPerMinute = 16/2;
        byte time = 20;
        int bottlesPer20Minutes = bottlesPerMinute * time;
        System.out.println("За " + time + " минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        int minutesPerDay = 24 * 60;
        int bottlesPerDay = bottlesPerMinute * minutesPerDay;
        System.out.println("За сутки  машина произвела " + bottlesPerDay + " штук бутылок");
        int minutesPer3Days = minutesPerDay * 3;
        int bottlesPer3Days = bottlesPerMinute * minutesPer3Days;
        System.out.println("За 3 дня  машина произвела " + bottlesPer3Days + " штук бутылок");
        int minutesPerMonth = 10 * minutesPer3Days;
        int bottlesPerMonth = bottlesPerMinute * minutesPerMonth;
        System.out.println("За месяц  машина произвела " + bottlesPerMonth + " штук бутылок");

        byte totalPaint = 120;
        byte whitePaint = 2;
        byte paintBrown = 4;
        int totalClasses = totalPaint / (paintBrown + whitePaint);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalClasses * whitePaint + " банок белой краски и " + totalClasses * paintBrown + " банок коричневой краски");

        byte bananas = 5;
        short milk = 200 / 100;
        byte iceCream = 2;
        byte eggs = 4;

        byte mBananas = 80;
        byte mMilk = 105;
        byte mIceCream = 100;
        byte mEggs = 70;
        int breakfast = (mBananas * bananas) + (milk * mMilk) + (iceCream * mIceCream) + (eggs * mEggs);
        System.out.println(breakfast);

        float massKilograms = breakfast / 1000f;
        System.out.println(massKilograms);

        int mass = 7000;
        int gram250 = 250;
        int amountOfDays = mass / gram250;
        System.out.println(amountOfDays);

        mass = 7000;
        int gram500 = 500;
        int amountOfDays1 = mass / gram500;
        System.out.println(amountOfDays1);

        int averageDays = (amountOfDays + amountOfDays1) / 2;
        System.out.println(averageDays);

        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;

        float increaseMasha = masha * 0.1f;
        float increaseDenis = denis * 0.1f;
        float increaseCristina = cristina * 0.1f;

        float salaryMasha = masha + increaseMasha;
        float salaryDenis = denis + increaseDenis;
        float salaryCristina = cristina + increaseCristina;

        float differenceMasha = salaryMasha - masha;
        float differenceDenis = salaryDenis - denis;
        float differenceCristina = salaryCristina - cristina;

        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + differenceMasha);
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + differenceDenis);
        System.out.println("Кристина теперь получает " + salaryCristina + " рублей. Годовой доход вырос на " + differenceCristina);



















































    }
}