package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.lang.reflect.Field;

public class Injector {

    private final Properties properties = new Properties();

    public Injector() throws IOException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("Injection.properties")) {
            if (input == null) {
                throw new IOException("Configuration file not found.");
            }
            properties.load(input);
        }
    }

    public <T> T inject(T obj) throws ReflectiveOperationException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(AutoInjectable.class)) {
                String implementationClass = properties.getProperty(field.getType().getName());
                if (implementationClass != null) {
                    Class<?> implClass = Class.forName(implementationClass);
                    Object instance = implClass.getDeclaredConstructor().newInstance();
                    field.setAccessible(true);
                    field.set(obj, instance);
                }
            }
        }

        return obj;
    }
}
