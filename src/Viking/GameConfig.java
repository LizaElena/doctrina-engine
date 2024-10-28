package Viking;

public class GameConfig {

    private static boolean debugEnable;

    public static boolean isDebugEnable() {
        return debugEnable;
    }

    public static void setDebugEnable(boolean debugEnable) {
        GameConfig.debugEnable = debugEnable;
    }
}
