package logic;

public class Main {

    public static void main(String[] args) {
        Atom f = new Atom("f");
        Atom f1 = new Atom ("f1");
        Atom f2 = new Atom("f2");


        Formula aRondF = new QopF(null, new ForAll(), new Ring(), f);
        f.setParent(aRondF);
        System.out.println(aRondF.toString() + " -----> " + aRondF.reWrite().toString());

        Formula eDiamondF = new QopF(null, new Every(), new Diamond(), f);
        f.setParent(eDiamondF);
        System.out.println(eDiamondF.toString() + " ------> " + eDiamondF.reWrite().toString());

        Formula aSqF = new QopF(null, new ForAll(), new Square(), f);
        f.setParent(aSqF);
        System.out.println(aSqF.toString() + " -----> " + aSqF.reWrite().toString());

        Formula eCarreF = new QopF(null, new Every(), new Square(), f);
        f.setParent(eCarreF);
        System.out.println(eCarreF.toString() + " ---->" + eCarreF.reWrite().toString());

        Formula aDiamondF = new QopF(null, new ForAll(), new Diamond(), eCarreF);
        eCarreF.setParent(aDiamondF);
        System.out.println(aDiamondF.toString() + " -----> " + aDiamondF.reWrite().toString());

        Formula e_u = new QF1opF2(new Every(), new Until(), aDiamondF, aSqF);
        System.out.println(e_u.toString() + " -----> " + e_u.reWrite().toString());

        //test de la recursivite
        ((QopF)aRondF).setF(eDiamondF);
        eDiamondF.setParent(aRondF);
        System.out.println(aRondF.toString() + " -----> " + aRondF.reWrite().toString());
        System.out.println(eDiamondF.toString()+ " parent -> "+ eDiamondF.getParent().toString());


    }

}
