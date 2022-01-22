package net.pixlies.nations.handlers;

import net.pixlies.nations.Nations;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class HandlerManager {

    private static final Nations instance = Nations.getInstance();

    private final Map<Class<? extends Handler>, Handler> handlers = new HashMap<>();

    @SuppressWarnings("unchecked")
    public <T extends Handler> T getHandler(Class<T> clazz) {
        if (!handlers.containsKey(clazz)) {
            try {
                T handler = clazz.getDeclaredConstructor().newInstance();
                handlers.put(clazz, handler);
                return handler;
            } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
                e.printStackTrace();
                instance.getLogger().severe("Failed to register handler.");
            }
        }
        return (T) handlers.get(clazz);
    }

    public void register(Class<? extends Handler> clazz) {
        if (handlers.containsKey(clazz)) return;
        try {
            clazz.getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
            instance.getLogger().severe("Failed to register handler.");
        }
    }

}
