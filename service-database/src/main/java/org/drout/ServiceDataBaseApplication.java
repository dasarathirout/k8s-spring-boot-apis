package org.drout;

import org.drout.dao.UserDetailsRepository;
import org.drout.dao.UserDetailsRepositoryI;
import org.drout.dao.entities.TaskCardDetails;
import org.drout.dao.entities.UserDetails;
import org.drout.dao.entities.model.ActionDetails;
import org.drout.dao.entities.model.Cards;
import org.drout.dao.entities.model.Tag;
import org.drout.dao.service.UserDetailsService;
import org.drout.dao.service.operation.TaskCardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class ServiceDataBaseApplication  implements CommandLineRunner {

	@Autowired
	private UserDetailsRepository userDetailsRepositoryD1;

	@Autowired
	private UserDetailsRepositoryI userDetailsRepositoryD2;

	@Autowired
	TaskCardDetailsRepository taskCardDetailsRepository;

	@Autowired
	UserDetailsService userDetailsService;
	public static void main(String[] args) {
		SpringApplication.run(ServiceDataBaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("http://localhost:8183/portal-database/explorer/index.html#uri=/portal-database/management/actuator");
		//addUserDetails();
		addTaskCardDetails();
	}

	private void addUserDetails(){
		UserDetails userDetails1 = new UserDetails();
		userDetails1.setName("USER-"+System.currentTimeMillis());
		userDetails1.setRole("ADMIN");
		userDetailsRepositoryD1.insert(userDetails1);
		System.out.println(userDetails1);

		UserDetails userDetails2 = new UserDetails();
		userDetails2.setName("USER-"+System.currentTimeMillis());
		userDetails2.setRole("OPS");
		userDetailsRepositoryD2.save(userDetails2);
		Optional<UserDetails> searchUserDetails = userDetailsRepositoryD2.findById(1L);
		System.out.println(searchUserDetails);
		List<UserDetails> allUsers = userDetailsRepositoryD2.findAll();
		System.out.println(allUsers);


		UserDetails userDetails3 = new UserDetails();
		userDetails3.setName("USER-"+System.currentTimeMillis());
		userDetails3.setRole("GUEST");
		userDetailsService.createUserDetails(userDetails3);
		System.out.println(userDetailsService.getUserDetailsById(1L));
	}

	private void addTaskCardDetails(){

		ActionDetails actionDetails = new ActionDetails();
		actionDetails.setTime( LocalDateTime.now().toString());
		actionDetails.setActionDetails("Vegetable, Grocery Shopping");
		actionDetails.setActions(Arrays.asList("Online","Local Market","Super Market","Milk Collect"));

		Cards cards= new Cards();
		cards.setName("Weekend Shopping");
		cards.setStatus(false);
		cards.setTaskDetails(actionDetails);
		cards.setTags(Arrays.asList(Tag.HOUSE,Tag.SELF));

		TaskCardDetails taskCardDetails = new TaskCardDetails();
		taskCardDetails.setActionCards(cards);

		taskCardDetailsRepository.save(taskCardDetails);
	}
}
