package Level1.Task3;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/*
Попробуй получить Class для разных объектов (Integer, List, HashMap).
Используй getMethods(), getConstructors(), getFields(), чтобы вывести информацию о классе.
Создай объект через рефлексию (newInstance()).
*/

public class ObjectClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("Метод: " + method.getName());
        }

        System.out.println();

        try {
            // Получаем Class для разных объектов
            Class<Integer> intClass = Integer.class;
            Class<ArrayList> listClass = ArrayList.class;
            Class<HashMap> mapClass = HashMap.class;

            // Выводим их полные имена
            System.out.println("Класс Integer: " + intClass.getName());
            System.out.println("Класс ArrayList: " + listClass.getName());
            System.out.println("Класс HashMap: " + mapClass.getName());

            System.out.println("\n--- Поля класса Integer ---");
            printFields(intClass);

            System.out.println("\n--- Методы класса ArrayList ---");
            printMethods(listClass);

            System.out.println("\n--- Конструкторы класса HashMap ---");
            printConstructors(mapClass);

            // Создаём объект через рефлексию
            Object listInstance = listClass.getDeclaredConstructor().newInstance();
            System.out.println("\nСоздан объект через рефлексию: " + listInstance.getClass().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Вывод всех методов класса
    private static void printMethods(Class<?> clazz) {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    // Вывод всех конструкторов класса
    private static void printConstructors(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    // Вывод всех полей класса
    private static void printFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
