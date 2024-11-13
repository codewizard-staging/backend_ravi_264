package com.app.ravi.function;

import com.app.ravi.model.Manager;
import com.app.ravi.model.Pet;
import com.app.ravi.model.PetCareCenter;
import com.app.ravi.model.PetOwner;
import com.app.ravi.model.Document;
import com.app.ravi.model.PetService;
import com.app.ravi.enums.PetServiceType;
import com.app.ravi.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.ravi.repository.PetServiceRepository;
import com.app.ravi.repository.PetOwnerRepository;
import com.app.ravi.repository.PetCareCenterRepository;
import com.app.ravi.repository.ManagerRepository;
import com.app.ravi.repository.DocumentRepository;
import com.app.ravi.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
