package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AuthClientDemoApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create("https://the-one-api.dev/v2/quote?limit=5&offset=2385"))
				.GET()
				.setHeader("Authorization", "Bearer ipqdyPZJnaVTTsUCXIJV")			
				.build();

		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		System.out.println(json);
		
	}
	
	
}
