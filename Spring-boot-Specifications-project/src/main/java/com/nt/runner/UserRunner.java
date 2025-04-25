package com.nt.runner;

import com.nt.entity.User;
import com.nt.repository.UserRepository;
import com.nt.specifications.UserSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRunner implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
/*

        User user1 = new User( "Alice Smith", "alice.smith@example.com", 72000.0,true);
        User user2 = new User( "Bob Johnson", "bob.johnson@example.com", 65000.0,false);
        User user3 = new User( "Charlie Lee", "charlie.lee@example.com", 85000.0,true);
        User user4 = new User( "Diana Prince", "diana.prince@example.com", 91000.0,true);
        User user5 = new User( "Ethan Brown", "ethan.brown@example.com", 58000.0,true);
        User user6 = new User( "Fiona Green", "fiona.green@example.com", 99000.0,false);
        User user7 = new User( "George White", "george.white@example.com", 67000.0,false);
        User user8 = new User( "Hannah Scott", "hannah.scott@example.com", 76000.0,true);
        User user9 = new User( "Ian Black", "ian.black@example.com", 54000.0,false);
        User user10 = new User( "Julia Adams", "julia.adams@example.com", 88000.0,true);

*/

        //save all users
/*

       repository.saveAll(List.of(user1,user2,user3,user4,user5,user6,
                                    user7,user8,user9,user10));
*/

        System.out.println("records are saved");
/*

        Specification<User> spec=Specification.where(UserSpecifications.hasName("Bob Johnson"))
                                               .and(UserSpecifications.hasEmail("bob.johnson@example.com"));

        List<User> validUsers=repository.findAll(spec);
        validUsers.forEach(System.out::println);
*/

        //get active users

        Specification<User> spec2=Specification.where(UserSpecifications.hasUserActive(false));

        Sort sort= Sort.by(Sort.Direction.ASC,"salary");
        List<User> activeUsers=repository.findAll(spec2,sort);

        activeUsers.forEach(System.out::println);

    }
}
