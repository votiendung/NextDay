import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    @DisplayName("case 1/1/2018")
    void testNextDay1() {
        int FirstOfDay = 1;
        int FirstOfMonth = 1;
        int YEAR = 2018;

        String expected = "2-1-2018";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/1/2018 ")
    void TestNextDay2() {
        int FirstOfDay = 31;
        int FirstOfMonth = 1;
        int YEAR = 2018;
        String expected = "1-2-2018";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 30/4/2018 ")
    void TestNextDay3() {
        int FirstOfDay = 30;
        int FirstOfMonth = 4;
        int YEAR = 2018;
        String expected = "1-5-2018";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 28/2/2018 ")
    void TestNextDay4() {
        int FirstOfDay = 28;
        int FirstOfMonth = 2;
        int YEAR = 2018;
        String expected = "1-3-2018";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 29/2/2020 ")
    void TestNextDay5() {
        int FirstOfDay = 29;
        int FirstOfMonth = 2;
        int YEAR = 2020;
        String expected = "1-3-2020";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/12/2018 ")
    void TestNextDay6() {
        int FirstOfDay = 31;
        int FirstOfMonth = 12;
        int YEAR = 2018;
        String expected = "1-1-2019";
        String result = NextDay.nextDay(FirstOfDay, FirstOfMonth, YEAR);
        assertEquals(expected, result);
    }


}