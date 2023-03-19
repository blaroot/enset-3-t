package Metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao2")
    private IDao dao ;//couplage FAIBLE



    @Override
    public double Calcul() {
        double tmp= dao.getDate();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
     //injecter dans la variable dao un objet d'une classe qui implement l'interface DAO
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
