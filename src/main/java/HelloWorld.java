import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
	
	
		get("/hello", (req, res) -> "Hello World this git");
		get("/", (req, res) -> "racine modif");
		get("/ho", (req, res) -> "Hello World xxx git");
		get("/imane", (req, res) -> "Hello imane");
		get("/salam", (req, res) -> "Hello");
		get("/test", res) -> "test");

	}
}
