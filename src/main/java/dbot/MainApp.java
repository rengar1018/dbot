package dbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = "NjI2NjA5NjU5MDU4NTg1NjIw.XYwnCA.TqmaCiYyLnJRbvzE4ST1TRbvc3s";
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new LunchListener());
			builder.build();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
