package Presentation;

import Metier.IMetierImpl;
import ext1.DAoimpl2;

public class Presentation {
    public static void main(String[] args) {
        // injection des dependances par instanciation statique >>new
        DAoimpl2 dao=new DAoimpl2();
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(dao);
        System.out.println(metier.Calcul());

    }
}
