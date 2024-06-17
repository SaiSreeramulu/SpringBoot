package com.example.mappings.one2onedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mappings.one2onedemo.dao.UserDao;
import com.example.mappings.one2onedemo.dao.UserProfileDao;
import com.example.mappings.one2onedemo.model.Tuser;
import com.example.mappings.one2onedemo.model.User;
import com.example.mappings.one2onedemo.model.UserProfile;

@SpringBootApplication
public class One2onedemoApplication implements CommandLineRunner {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserProfileDao userProfileDao;

	public static void main(String[] args) {
		SpringApplication.run(One2onedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Below code will implement one to one bidirectional 
		 * 
		 */
		UserProfile userProfile = new UserProfile();
        userProfile.setAddress("123 Main St");
        
       

        User user = new User();
        user.setName("John Doe");
        user.setUserProfile(userProfile);
       

        userProfile.setUser(user);
        

        userDao.save(user);
        userProfileDao.save(userProfile);
       
        System.out.println("one2one mapping done..");

		/*
		
		// below code will implement one to one unidirectional
		
		TUserProfile tprofile1 = new TUserProfile(900003L,"praveen@gmail.com");
		Tuser tuser1 = new Tuser(100001L,"praveen",tprofile1);
		
		TUserProfile tprofile2 = new TUserProfile(900004L,"anil@gmail.com");
		Tuser tuser2 = new Tuser(100002L,"anil",tprofile2);
		
		userDao.save(tuser1);
		userDao.save(tuser2);
		System.out.println("one2one mapping done..");
		*/
		//Iterable<User> users = userDao.findAll();
        //users.forEach(System.out::println);
        /*
        // Update a UserD
        Tuser existingUser = userDao.findById(2L).orElse(null);
        if (existingUser != null) {
            existingUser.setName("Jane Doe");
            userDao.save(existingUser);
        }

        //Delete a User
        userDao.deleteById(1L);
*/

	
	}

}