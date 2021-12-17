package ru.vsu.csf.pryadchenko.server.dockerLogic;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    public static final String BASE_RESOURCE_PATH = "handmade-spring/src/main/resources";

    private static final Map<Class<?>, String> resourcePathMap = new HashMap<>();

    static String put(Class<?> clas, String path) {
        return resourcePathMap.put(clas, path);
    }

    public static File get(Class<?> clas, String file) {
        return new File(resourcePathMap.get(clas) + "/" + file);
    }
}
