
import static spark.Spark.*;

public class HelloSpark {

	private HelloSpark(){}

	public static class Test{
		public String request_data="";
		public Test(String data){
			this.request_data = data;
		}
	}

	public static void main(String[] args) {
		port(9090);

		get("/", (request, response) -> {
			return new Test("Root GET");
		}, new JsonTransformer());

		post("/", (request, response) -> {
			return new Test("Root POST");
		}, new JsonTransformer());

		get("/hello/:name", (request, response) -> {
			return new Test("Hello Mr." + request.params(":name"));
		}, new JsonTransformer());

		post("/hello/:name", (request, response) -> {
			return new Test("Hello Mr." + request.params(":name"));
		}, new JsonTransformer());

	}
}
