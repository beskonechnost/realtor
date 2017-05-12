package realtorPro.db.storege;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Андрей on 12.05.2017.
 */
@Service
public class Storages {

    public  final RoleDAO roleStorage;

    @Autowired
    public Storages(RoleDAO roleStorage) {
        this.roleStorage = roleStorage;
    }
}
