public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello from Java in Docker! ☕🐳");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));

        if (args.length > 0) {
            System.out.println("Аргументы:");

            for (int i = 0; i < args.length; i++) {
                System.out.println("  " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
