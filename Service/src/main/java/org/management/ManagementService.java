package org.management;
import org.management.Entity.ManagementEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ManagementService {


    public ManagementEntity addUser(AddUserDTO adduser);

    public ManagementEntity ManageById(Integer ID);

    public List<ManagementEntity> ManageDetails();

}



