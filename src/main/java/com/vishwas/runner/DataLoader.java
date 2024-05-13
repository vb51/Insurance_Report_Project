package com.vishwas.runner;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vishwas.entity.CitizenPlan;
import com.vishwas.repo.Citizenplanrepo;

@Component
public class DataLoader implements ApplicationRunner {
	
 @Autowired
 private Citizenplanrepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
	
		
		repo.deleteAll();
		
	CitizenPlan p1= new CitizenPlan("Vishwas", "john@gmail.com",753685L ,75757834L, "Male","Cash", "Approved", LocalDate.now(), LocalDate.now().plusMonths(6));
	CitizenPlan p2= new CitizenPlan("gaurav", "gaurav@gmail.com",989685L ,222327834L,"Male", "Cash", "Rejected",null,null);
	CitizenPlan p3= new CitizenPlan("Prateek", "prateek55@gmail.com",2556685L ,598237834L,"Male", "Food", "Approved", LocalDate.now(), LocalDate.now().plusDays(88));
	CitizenPlan p4= new CitizenPlan("Himanshu", "himasnhu64@gmail.com",767753685L ,2234257834L,"Male", "Cash", "Approved", LocalDate.now(), LocalDate.now().plusMonths(3));
	CitizenPlan p5= new CitizenPlan("Vikas", "vbyti7@gmail.com",7734685L ,77642834L,"Male", "Cash", "Approved", LocalDate.now(), LocalDate.now());
	CitizenPlan p6= new CitizenPlan("Arjun", "arrjun23@gmail.com",321483685L ,7656834L, "Female", "Cash", "Approved", LocalDate.now(), LocalDate.now().plusDays(44));
	CitizenPlan p7= new CitizenPlan("Siddharth", "sif84@gmail.com",41313185L ,787857834L, "Male", "Cash", "Approved", LocalDate.now(), LocalDate.now().plusWeeks(13));
	CitizenPlan p8 = new CitizenPlan("John", "john@example.com", 123456789L, 987654321L, "Male", "Medical", "Approved", LocalDate.now(), LocalDate.now().plusYears(1));
	CitizenPlan p9 = new CitizenPlan("Alice", "alice@example.com", 987654321L, 123456789L, "Female", "Two-wheeler", "Approved", LocalDate.now(), LocalDate.now().plusMonths(4));
	CitizenPlan p10 = new CitizenPlan("Bob", "bob@example.com", 56575555L, 111111111L, "Male", "Medical", "Pending", LocalDate.now(), LocalDate.now().plusDays(51));
	CitizenPlan p11= new CitizenPlan("Emily", "emily@example.com", 999999999L, 222222222L, "Female", "Medical", "Approved", LocalDate.now(), LocalDate.now().plusMonths(2));
	CitizenPlan p12= new CitizenPlan("David", "david@example.com", 76867581111L, 555555555L, "Male", "Two-wheeler", "Rejected", null, null);
	CitizenPlan p13= new CitizenPlan("Sophia", "sophia@example.com", 5436548888L, 444444444L, "Female", "Medical", "Pending", LocalDate.now(), LocalDate.now().plusWeeks(19));
	CitizenPlan p14= new CitizenPlan("Michael", "michael@example.com", 1146522222L, 999999999L, "Male", "Medical", "Approved", LocalDate.now(), LocalDate.now());
	CitizenPlan p15= new CitizenPlan("Emma", "emma@example.com", 36574533333L, 666666666L, "Female", "Two-wheeler", "Pending", LocalDate.now(), LocalDate.now().plusDays(77));
	CitizenPlan p16= new CitizenPlan("William", "william@example.com", 444444444L, 888888888L, "Male", "Medical", "Rejected", LocalDate.now(), LocalDate.now());
	CitizenPlan p17 = new CitizenPlan("Olivia", "olivia@example.com", 666666666L, 333333333L, "Female", "Medical", "Approved", LocalDate.now(), LocalDate.now());

	List<CitizenPlan> records= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17);
	repo.saveAll(records);
	}

	
	
}
