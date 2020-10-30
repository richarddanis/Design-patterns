package singletone;

public class Superman {

    private static volatile Superman instance;

    private Superman() {
    }

    public static Superman getInstance() {
        Superman supermanInstance = instance;
        if (supermanInstance == null) {
            synchronized (Superman.class) {
                supermanInstance = instance;
                if (supermanInstance == null)
                    instance = supermanInstance = new Superman();
            }
        }
        return supermanInstance;
    }
}
