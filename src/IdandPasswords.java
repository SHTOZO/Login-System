import java.util.HashMap;

public class IdandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();
    IdandPasswords(){
        logininfo.put("SHTOZO", "osso011220011");
        logininfo.put("Niso25", "osso");
        logininfo.put("Colossus", "yohidude03");
        logininfo.put("Pulse", "pulse22");
    }

    protected HashMap<String,String> getLoginInfo(){
        return logininfo;
    }
}
