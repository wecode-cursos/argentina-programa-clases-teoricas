package apis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PruebaGson {

	public static void main(String[] args) {

		String json = "{username: 'leonardo', password: 'blau'}";

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		User yael = gson.fromJson(json, User.class);
		
		System.out.println(json);
		System.out.println(yael);
		
		String x = gson.toJson(yael);
		System.out.println(x);
		
		
	}

}

class User {
	String username, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=****]";
	}

}
