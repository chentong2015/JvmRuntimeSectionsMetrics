package runtime_object.object_layout;

// import org.openjdk.jol.info.ClassLayout;
// import org.openjdk.jol.vm.VM;

// TODO. 对象在内存中的存储格式和布局
// https://github.com/openjdk/jol
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
