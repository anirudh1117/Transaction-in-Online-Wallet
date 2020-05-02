package org.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WalletRunning {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WalletRunning.class,args);
		System.out.println("sprint boot server running...");
		/*WalletRepository dao = ctx.getBean(WalletRepository.class);
		WalletUser user[] = new WalletUser[3];
		String name[]= {"ram","sam","kam"};
		String pass[]= {"am","sa","km"};
		long no[]= {123,456,789};
		String lname[]= {"r","s","k"};
		WalletAccount acc;
		for(int i=0;i<user.length;i++) {
			user[i] = new WalletUser();
			//user[i].setAadhaarNo(no[i]);
			user[i].setUserName(name[i]);
			user[i].setLoginName(lname[i]);
			user[i].setPassword(pass[i]); 
			user[i].setPhoneNumber(no[i]);
			//user[i].setAadhaarNo(no[i]);
			acc = new WalletAccount();
			acc.setAccountBalance(100);
			acc.setStatus("true hhai");
			acc.setWalletUser(user[i]);
			//dao.save(acc);
			user[i].setWalletAccount(acc);
			dao.save(user[i]);
		}
		dao.findAll().forEach(System.out::println);
		//ctx.close();  */
		}
}
