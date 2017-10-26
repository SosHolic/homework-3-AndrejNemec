package sk.holic.sos;

public class Test {

    public Test ref; //Premenna typu Test s identifikatorem ref
    public static Test sref; //Staticka premenna typu Test s identifikatorem sref
    public int val; //Premenna typu int s identifikatorem val


    public static int calc() {
        Test t1 = new Test(); //Vytvorenie novej instancie t1 typu Test
        Test t2 = new Test(); //Vytvorenie novej instancie t2 typu Test

        t1.ref = t2; //k premennej ref v instancii t1 sa priradi instancia t2
        t1.sref = t1; // k statickej premenne sref v classi Test sa priradi instancia t1
        t1.val = 10; //k premennej val v instancii t1 sa priradi cislo 10
        t2.ref = t1; //k premennej ref v instancii t2 sa priradi instancia t1
        t2.sref = t2; //k statickej premenne sref v classi Test sa priradi instancia t2
        t2.val = 1; //k premennej val v instancii t2 sa priradi cislo 1


        int cislo1 = t1.sref.ref.ref.val;
        //t1 -> sref -> ref -> ref -> val = 1
        // (Plati len sref.ref.ref.val - sref je t2 a t2 ma k premennej ref priradenu instanciu t1 a t1 ma k premennej ref priradenu instanciu t2 a t2 ma val hodnotu 1)


        int cislo2 = t2.ref.sref.ref.val;
        //t1 -> t2 -> ref -> sref -> ref -> val = 10
        // (Plati len sref.ref.val - sref je t2 a t2 ma k premennej ref priradenu instanciu t1 a t1 ma val hodnotu 10)


        int cislo3 = t1.ref.ref.sref.val;
        //t1 -> ref -> ref -> sref -> val = 1
        // (Plati len sref.val - sref.val sa bude stale rovnat 1 lebo sref je staticka premenna a ma priradenu instanciu t2. Instancia t2 ma val hodnotu 1)

        return cislo1 + cislo2 + cislo3;
    }
}
