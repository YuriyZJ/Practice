package Level1.Task2;

public class ClassLoaderExample {
    public static void main(String[] args) {
        // Bootstrap ClassLoader (null)
        System.out.println(String.class.getClassLoader());

        // Platform ClassLoader
        System.out.println(javax.crypto.Cipher.class.getClassLoader());

        // Application ClassLoader
        System.out.println(ClassLoaderExample.class.getClassLoader());
    }
}
