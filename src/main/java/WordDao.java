import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class WordDao extends EntityDao<Words>{

    public WordDao(SessionFactory sessionFactory) {
        super(sessionFactory, Words.class);
    }

    public List<Words> getAllWords(){
        Session session = sessionFactory.openSession();
        List<Words> resoult = session.createQuery("From Words", Words.class).getResultList();
        session.close();
        return(resoult);
    }
}
