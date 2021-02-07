import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public  void test() {
        JSONObject obj = new JSONObject("{data: 'stuff'}");
        assertEquals("Msg", obj.get("data"), "stuff");
    }
}
