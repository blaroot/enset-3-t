package Presentation;

import Metier.IMetier;
import dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
      Scanner scanner=new Scanner(new File("config.txt"));
      String nameDao=scanner.nextLine();
      Class cDao=Class.forName(nameDao);
      IDao dao=(IDao) cDao.newInstance();
      String nameMetier=scanner.nextLine();
      Class cMetier=Class.forName(nameMetier);
      IMetier metier= (IMetier) cMetier.newInstance();
      Method method=cMetier.getMethod("setDao",IDao.class);
      method.invoke(metier,dao);
        System.out.println(metier.getClass());
}}
