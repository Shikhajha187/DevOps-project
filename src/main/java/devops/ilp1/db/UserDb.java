package devops.ilp1.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import devops.ilp1.model.User;

public class UserDb {
	
	public static String[][] users;
	public static List<User>  usersData;
	
	public static Map<String, User> userProfile=new HashMap<String,User>();
	
	public UserDb(){
		
		User u1=new User("A","B","1234","abc@xyz.com");
		User u2=new User("C","D","abcd","abcd@xyz.com");
		User u3=new User("E","F","pqrs","abcde@xyz.com");
	
		
		userProfile.put(u1.getEmail(), u1);
		userProfile.put(u2.getEmail(), u2);
		userProfile.put(u3.getEmail(), u3);
		
//		String[] user1 ={"A","B","1234","abc@xyz.com"};
//		String[] user2 ={"C","D","abcd","abcd@xyz.com");};
//		String[] user3 ={"E","F","pqrs","abcde@xyz.com"};
//		
//		users[0]=user1;
//		users[1]=user2;
//		users[2]=user3;
//		
//		usersData=new ArrayList<User>();
	
//		usersData.add(u1);
//		usersData.add(u2);
//		usersData.add(u3);
	}
	


}
