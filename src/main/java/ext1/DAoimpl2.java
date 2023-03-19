package ext1;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DAoimpl2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("version2");
        double temp= 30;
        return temp;
}}
