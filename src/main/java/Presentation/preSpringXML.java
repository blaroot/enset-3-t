package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class preSpringXML  {
    public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      IMetier metier= (IMetier) context.getBean("metier");
        System.out.println(metier.Calcul());



}}
