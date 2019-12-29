import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LspBazelTest {
	public static void main(String[] args) {
		String t = "{\"Hello\":\"World\"}";
		JsonObject o = new JsonParser().parse(t).getAsJsonObject();
		System.out.println(o);
	}
}