
import java.io.FileWriter;
import java.io.IOException;

public class BugTracker {
    public static boolean save(String title, String description, String priority) {
        try (FileWriter writer = new FileWriter("C:/xampp/tomcat/webapps/bugtracker/bugs.csv", true)) {
            writer.write(title + "," + description + "," + priority + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
