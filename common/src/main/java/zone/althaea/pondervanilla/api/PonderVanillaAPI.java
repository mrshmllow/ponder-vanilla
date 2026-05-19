package zone.althaea.pondervanilla.api;

import java.lang.reflect.InvocationTargetException;

public class PonderVanillaAPI {

    public static final String MOD_ID = "pondervanilla";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("zone.althaea.pondervanilla.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
