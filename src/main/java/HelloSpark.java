
import static spark.Spark.*;

public class HelloSpark {
	public static void main(String[] args) {
		port(9090);
		get("/hello", (req, res) -> "Hello World");
	}
}
