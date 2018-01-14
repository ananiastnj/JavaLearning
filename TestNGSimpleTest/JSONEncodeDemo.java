package TestNGSimpleTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEncodeDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
//		JSONObject obj = new JSONObject();
//		obj.put("name", "foo");
//		obj.put("num", new Integer(100));
//		obj.put("balance", new Double(1000.21));
//		obj.put("is_vip", new Boolean(true));
//		System.out.print(obj);
//		
		JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("C:\\Users\\ajesuraj\\21_nov_Luna_workspace\\TestNG_Learning\\src\\TestNGSimpleTest\\file.json"));
        System.out.println();
        JSONObject jsonObject =  (JSONObject) obj;
        String name = (String) jsonObject.get("name");
        System.out.println(name);
        
//        Scanner scan=new Scanner(file);
	}

}
