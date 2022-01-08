package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import orm.UserRegistation;
import utill.HibernateUtil;

/**
 *
 * @author Dhanusha
 */
public class SignupModel {

    SessionFactory sf;
    Session ses;

    public SignupModel() {
        sf = HibernateUtil.getSessionFactory();
        ses = sf.openSession();
    }

    public void signup(String userName, String userEmail, String userPassword) {

        Transaction tr = ses.beginTransaction();

        UserRegistation ur = new UserRegistation();
        ur.setName(userName);
        ur.setEmail(userEmail);
        ur.setPassword(userPassword);

        ses.save(ur);
        tr.commit();

    }

}
