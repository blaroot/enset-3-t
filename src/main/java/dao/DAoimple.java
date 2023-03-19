package dao;

import org.springframework.stereotype.Component;

@Component("dao1")
public class DAoimple  implements  IDao{

    @Override
    public double getDate() {
        double temp= 40;
        System.out.println("version1");
        return temp;
    }
}
