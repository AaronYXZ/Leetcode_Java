package C20_Json;

import java.io.IOException;
import java.net.URL;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.json.JSONArray;
import org.json.JSONObject;

public class orgjsonDemo {

    public static void main(String[] args) throws IOException {
        // read from resources
        URL url = Resources.getResource("sample.json");
        String text = Resources.toString(url, Charsets.UTF_8);

        JSONObject object = new JSONObject(text);
        String pageName = object.getJSONObject("pageInfo").getString("pageName");
        JSONArray jsonArray = object.getJSONArray("posts");
        int id = jsonArray.getJSONObject(0).getInt("actor_id");
//        Object actorId = Iterables.get(jsonArray, 1);
        System.out.println(id);
    }
}
