import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmatique {
  public void songs() {
    HashMap<String, String> songs = new HashMap<String, String>();

    songs.put("ThrashMaster", "Metal Metal Metal Metal");
    songs.put("CrashMaster", "Kettle Kettle Kettle Kettle");
    songs.put("RashMaster", "Itchy Itchy Itchy Itchy");
    songs.put("TrashMaster", "Sh*tty Sh*tty Sh*tty Sh*tty");

    String song = songs.get("RashMaster");

    System.out.println(song);

    Set<String> keys = songs.keySet();

    for (String key : keys) {
      System.out.println(key);
      System.out.println(songs.get(key));
    }

    for (Map.Entry<String, String> entry : songs.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
