import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger Log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Main demo=new Main();
        demo.runApp();

    }

    void runApp() {
        Log.debug("i am debug");
        Log.info("i  am info");
        Log.error("i am error");
    }
}