package sk.holic.sos;

public class Main {


    public static void main(String[] args) {
        System.out.println(Test.calc() + "\n"); //Vypisanie statickej metody calc s vratnou hodnotou (12)

        int i = 0;
        while(true) {
            if (++i > 5) {
                break;
            }
        }

        //++i zvisi hodnotu a potom priraduje
        //i++ najprv priradi a potom zvysuje hodnotu


        //ked dam do kodu i++ tak to bude 7 cyklus sa bude opakovat 7x pretoze sa cislo zacina od 0
        //ked dam do kodu ++i tak to bude 6 cyklus sa bude opakovat 6x pretoze sa cislo zacina od 1

        System.out.println(i + "\n");

    }
}
