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

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int totalStudents = LP + AS + EA;
        short sheets = 480;
        int sheetsStudent = sheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");

        byte Performance = 16/2;
        byte time = 20;
        int Performance20 = Performance * time;
        System.out.println("За " + time + " минут машина произвела " + Performance20 + " штук бутылок");
        int day = 24 * 60;
        int timeDay = Performance * day;
        System.out.println("За сутки  машина произвела " + timeDay + " штук бутылок");
        int t3Day = 24 * 60 * 3;
        int time3Day = Performance * t3Day;
        System.out.println("За 3 дня  машина произвела " + time3Day + " штук бутылок");
        int month = 24 * 60 * 30;
        int timeMonth = Performance * month;
        System.out.println("За месяц  машина произвела " + timeMonth + " штук бутылок");

        byte whitePaint = 2;
        byte paintBrown = 4;
        int totalClasses = 60 / paintBrown;
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
        int gram = 250;
        int amountOfDays = mass / gram;
        System.out.println(amountOfDays);

        int mass1 = 7000;
        int gram1 = 500;
        int amountOfDays1 = mass1 / gram1;
        System.out.println(amountOfDays1);

        int averageDays = (amountOfDays + amountOfDays1) / 2;
        System.out.println(averageDays);

        int Masha = 67760;
        int Denis = 83690;
        int Cristina = 76230;

        float increaseMasha = Masha * 0.1f;
        float increaseDenis = Denis * 0.1f;
        float increaseCristina = Cristina * 0.1f;

        float salaryMasha = Masha + increaseMasha;
        float salaryDenis = Denis + increaseDenis;
        float salaryCristina = Cristina + increaseCristina;

        float differenceMasha = salaryMasha % Masha;
        float differenceDenis = salaryDenis % Denis;
        float differenceCristina = salaryCristina % Cristina;

        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + differenceMasha);
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + differenceDenis);
        System.out.println("Кристина теперь получает " + salaryCristina + " рублей. Годовой доход вырос на " + differenceCristina);



















































    }
}