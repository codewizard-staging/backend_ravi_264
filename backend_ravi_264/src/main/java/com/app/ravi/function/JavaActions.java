package com.app.ravi.function;

import com.app.ravi.model.Manager;
import com.app.ravi.model.Pet;
import com.app.ravi.model.PetCareCenter;
import com.app.ravi.model.PetOwner;
import com.app.ravi.model.Document;
import com.app.ravi.model.PetService;




import com.app.ravi.enums.PetServiceType;
import com.app.ravi.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  