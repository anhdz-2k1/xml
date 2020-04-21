import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadJsonTest {
    public static void main(String[] args){
        //Json parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("employees.json")){
            //read json  file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            //Iterate over employee array
            employeeList.forEach(emp -> parseEmployeeObject( (JSONObject) emp ));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
    private static void parseEmployeeObject(JSONObject employee){
        //get  employee  object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        //get employee firtname
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);

        //get employee lastname
        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        //get website name
        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
