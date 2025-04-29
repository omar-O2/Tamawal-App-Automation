package Utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Json_Data {

    private static final String Path_Json_File = "src/test/resources/Json_Data/" ;








    public static String Get_json_Data(String File_Name, String Field_Name) throws FileNotFoundException {
        FileReader reader = new FileReader(Path_Json_File+File_Name+".json");
        JsonElement jsonElement = JsonParser.parseReader(reader);
        return jsonElement.getAsJsonObject().get(Field_Name).getAsString();
    }

}
