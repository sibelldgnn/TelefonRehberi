
package com.mycompany.sibelproje;

import org.hibernate.Session;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class İslemler {

 
     public void Ekle(String ad,String soyad,String numara)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Telefonrehberi.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Telefonrehberi telefonrehberi = new Telefonrehberi(1,ad, soyad, numara);
			session.beginTransaction();
			session.save(telefonrehberi);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
                
                
    }
     
      

}
