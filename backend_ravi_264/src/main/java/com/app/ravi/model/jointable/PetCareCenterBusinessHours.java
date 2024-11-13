package com.app.ravi.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.ravi.model.Manager;
import com.app.ravi.model.Pet;
import com.app.ravi.model.PetCareCenter;
import com.app.ravi.model.PetOwner;
import com.app.ravi.model.Document;
import com.app.ravi.model.PetService;
import com.app.ravi.enums.PetServiceType;
import com.app.ravi.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"ravi_783\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}