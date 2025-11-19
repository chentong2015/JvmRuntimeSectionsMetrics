package runtime_object.object_layout;

// import org.openjdk.jol.info.ClassLayout;
// import org.openjdk.jol.vm.VM;

public class JvmObjectLayout {

    public static void main(String[] args) {
        // System.out.println(VM.current().details());
        // System.out.println(ClassLayout.parseClass(StorageClass.class).toPrintable());
    }

    class StorageClass {
        private int id;
        private String name;

        public StorageClass(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void test() {
            System.out.println("test method");
        }
    }
}
