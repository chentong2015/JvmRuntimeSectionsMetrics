package runtime_object.object_memory;

// TODO. 对象分配分析:
// 由于分配对象引用出现逃逸，导致无法在栈上直接分配和销毁
// 当对象不大时，默认分配到TLAB堆内存空间
// 使用(-XX:useTLAB)关闭TLAB分配原则后，导致必须在Eden或老年代堆空间分配
public class JvmObjectAllocation {

    public static void main(String[] args) {
        User user = null;
        for (int i=0; i < 1000_000_000; i++) {
            user = new User(i);
        }

        // TODO. 对象逃逸(在外使用对象的引用)
        // 将造成无法直接在Stack栈上进行分配，从而导致性能急剧下降
        System.out.println(user);
    }

    static class User {
        private int age;
        private String username;

        public User(int age) {
            this(age, "Default");
        }

        public User(int age, String username) {
            this.age = age;
            this.username = username;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
