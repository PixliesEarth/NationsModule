package net.pixlies.nations.utils;

import java.io.InputStream;

public final class ResourceReader {

    public static InputStream getResource(String string) {
        return ResourceReader.class.getClassLoader().getResourceAsStream(string);
    }

}
