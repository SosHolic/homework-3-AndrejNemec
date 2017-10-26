package sk.holic.sos;

public class GeneralTest {
    public int getCount() {return 1;}
}
class Test2 extends GeneralTest {

    public int getCount() {
        return 10;
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        int count = test.getCount(); //premenna count sa rovna 10

        GeneralTest generalTest = new Test2();
        count += generalTest.getCount(); //k premennej count sa pripocita 10

        generalTest = new GeneralTest();
        count += generalTest.getCount(); //k premennej count sa pripocita 1

        // PREMENNA getCount bola volana 3 krat , vypise 21, 2x z Test2 a 1x z GeneralTest
        System.out.println(count);
    }
}
