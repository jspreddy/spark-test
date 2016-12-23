
import static spark.Spark.*;

public class HelloSpark {
	public static void main(String[] args) {
		port(9090);

		get("/", (request, response) -> "Root GET");
		post("/", (request, response) -> {
			return "Root POST";
		});

		get("/hello/:name", (request, response) -> {
			return "Hello Mr." + request.params(":name");
		});

	}
}
