public class NextDay {

//    public static int LASTOFMONTH = 31;
    static int FIRSTOFMONTH = 1;

    public static String nextDay(int dayTest, int monthTest, int yearTest) {
//        int FIRSTOFMONTH = 0;
        int LASTOFMONTH = getLastofmonth(monthTest,yearTest);



        if (dayTest == LASTOFMONTH) {
            if (monthTest==12){
                dayTest = FIRSTOFMONTH;
                monthTest = 1;
                yearTest++;
            }else {
                dayTest = FIRSTOFMONTH;
                monthTest++;
            }

        } else
            dayTest++;
        String result = dayTest + "-" + monthTest + "-" + yearTest;
        return result;
    }

    private static int getLastofmonth(int monthTest, int yearTest) {
        int LASTOFMONTH = 0;
        switch (monthTest) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LASTOFMONTH = 31;
                break;
            case 2:
                if (chekYear(yearTest)){
                    LASTOFMONTH = 29;
                }else LASTOFMONTH = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFMONTH = 30;
                break;
        }
        return LASTOFMONTH;
    }
    public static boolean chekYear(int year) {
        if (year%4 == 0){
            return year % 100 != 0 || year % 400 == 0;

        }else return false;
    }
}
