import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
/**
 * Created by xuekang on 6/3/17.
 */
public class Caller {
    public void getHDflag() throws Exception{
        int page = 1;
        Boolean hasNext = true;
        int totalhdTrue = 0;
        int totalhdFalse = 0;
        while(hasNext){
            HttpResponse<JsonNode> jsonResponse = Unirest.get("http://api.viki.io/v4/videos.json")
                    .queryString("app", "100250a")
                    .queryString("per_page", 10)
                    .queryString("page", page)
                    .asJson();
            JSONObject jsonObject = jsonResponse.getBody().getObject();
            hasNext = jsonObject.getBoolean("more");
            int hdtrue = 0;
            int hdfalse = 0;
            JSONArray jsonArray = jsonObject.getJSONArray("response");
            int index;
            for(index = 0; index < jsonArray.length(); index++){
                JSONObject jsonObj = jsonArray.getJSONObject(index);
                JSONObject flags = jsonObj.getJSONObject("flags");
                Boolean hd = flags.getBoolean("hd");
                if(hd){
                    hdtrue++;
                }
                else {
                    hdfalse++;
                }
            }
            page++;
            totalhdFalse+= hdfalse;
            totalhdTrue+= hdtrue;
        }
        System.out.println(totalhdTrue + " response objects have true hd flags");
        System.out.println(totalhdFalse + " response objects have false hd flags");
    }
    public static void main(String[] args) {
        System.out.println("Sending Request...");
        try{
            Caller caller = new Caller();
            caller.getHDflag();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            Unirest.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End of Request.");
    }
}
