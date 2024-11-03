import java.util.HashMap;

public class IDandPassword {


        HashMap<String, String> logininfo = new HashMap<String,String>();

        IDandPassword(){
            logininfo.put("username", "admin");
            logininfo.put("Bro", "pizza");
            logininfo.put("BroCode", "abc123");
            logininfo.put("zohidjon", "M@xsmith2020");
        }

        protected HashMap getLoginInfo(){
            return logininfo;
        }
}
