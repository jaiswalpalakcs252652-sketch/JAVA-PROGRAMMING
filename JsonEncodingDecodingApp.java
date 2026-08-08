package jsonencodingdecodingapp;
import org.json.JSONObject;

public class JsonEncodingDecodingApp {
    static class person{
        String name;
        int age;
        String email;
       
        person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }
    public static void main(String[] args) {
        person person = new person("Palak Jaiswal", 19, "jaiswalpalakcs252652@gmail.com");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", person.name);
        jsonObject.put("age", person.age);
        jsonObject.put("email", person.email);
        System.out.println("Encoded JSON:");
        System.out.println(jsonObject.toString(2));
        String jsonString = jsonObject.toString();
        JSONObject parsed = new JSONObject(jsonString);
        String name = parsed.getString("name");
        int age = parsed.getInt("age");
        String email = parsed.getString("email");
        person decodedPerson = new person(name, age, email);
        System.out.println("\nDecoded Person Object:");
        System.out.println("Name: " + decodedPerson.name);
        System.out.println("Age: " + decodedPerson.age);
        System.out.println("Email: " + decodedPerson.email);
    }
}