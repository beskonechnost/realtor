package realtorPro.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import realtorPro.db.storege.Storages;

/**
 * Created by Андрей on 12.05.2017.
 */
public class Q {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Storages s = context.getBean(Storages.class);
        System.out.println(s.roleStorage.getList());
    }

}
