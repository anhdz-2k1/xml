
import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class test_mlj_08 {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("mlj_08_ex3.json"));
            JSONObject jsonObject = (JSONObject) object;
            String header = (String) jsonObject.get("header");
            System.out.println(header);
            JSONArray item = (JSONArray)jsonObject.get("item");
            Iterator iterator = item.iterator();
            while (iterator.hasNext()){

                System.out.println(iterator.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
