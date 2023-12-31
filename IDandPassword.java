import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> logininfo = new HashMap<>();

    IDandPassword(){
        logininfo.put("manas","manasraj");
        logininfo.put("manas2104","Sanam");
        logininfo.put("manas123","Sanamjar@2104");
    }

    protected HashMap getLogininfo(){
        return logininfo;
    }
}
