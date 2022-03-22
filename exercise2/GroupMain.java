package com.tyss.exercise2;

public class GroupMain {
	public static void main(String[] args) {
		
		User user =new Admin("Mohan", 1234567890l);
		user.chat();
		user.videocall();
		user.share();
		
		
		
		Admin admin = (Admin) user;
		admin.AddUser("Mayil");
		admin.RemoveUser("Belloo");
	}

}
