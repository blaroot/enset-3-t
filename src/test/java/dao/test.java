package dao;

import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
     public void testDao(){
         DAoimple dao=new DAoimple();
         double a= dao.getDate();
        System.out.println(a);
         double exepted=10000;
        Assert.assertNotEquals(exepted,a);
          }
     }
