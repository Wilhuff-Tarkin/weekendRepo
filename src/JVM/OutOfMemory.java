package JVM;

public class OutOfMemory {
    public static void memoryKiller (String s){

        StringBuilder stb = new StringBuilder();
        System.out.println(stb.append(s));
        memoryKiller(s);
    }

    public static void main(String[] args) {

           memoryKiller("Wulgarny wyraz");

        }

    }

