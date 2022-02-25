/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void appHas_Arrays_Averages() {
        App classUnderTest = new App();
        int[] testResult = classUnderTest.Arrays_Averages(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        });
        assertArrayEquals(new int[]{55, 54, 60, 53, 59, 57, 61}, testResult);
    }

    @Test
    void appHas_containsDuplicates() {
        App classUnderTest = new App();
        boolean testResult = classUnderTest.containsDuplicates(new int[]{1, 2, 6, 7, 6});
        assertEquals(true, testResult);
    }

    @Test
    void appHas_Calculating_Averages() {
        App classUnderTest = new App();
        double testResult = classUnderTest.Calculating_Averages(new int[]{1, 2, 6, 7, 6});
        assertEquals(4.4, testResult);
    }

//    @Test
//    void appHas_roll() {
//        App classUnderTest = new App();
////        int testResult = classUnderTest.roll(new int[]
////        assertArrayEquals(, testResult);
//    }
}