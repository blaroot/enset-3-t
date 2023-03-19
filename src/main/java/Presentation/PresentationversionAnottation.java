package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationversionAnottation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","Metier","ext1");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.Calcul());
    }
}
