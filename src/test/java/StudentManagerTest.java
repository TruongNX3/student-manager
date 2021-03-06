import org.junit.Test;

public class StudentManagerTest {

    @Test
    public void testgetInfo() {
        Student andy = new Student(23, "andy");
        System.out.println(andy.getinfomation());
        System.out.println("Name: " + andy.getName());
        System.out.println("Age: " + andy.getAge());
    }

    @Test
    public void testAdd() {
        Student andy = new Student(23, "andy");
        StudentManager studentManager = new StudentManager();
        studentManager.add(andy);
        System.out.println("Added: " + andy.getinfomation());
    }

    @Test
    public void testDisplayAll() {
        Student andy = new Student(23, "andy");
        Student bood = new Student(25, "bood");
        Student jame = new Student(24, "jame");
        StudentManager studentManager = new StudentManager();
        studentManager.add(andy);
        studentManager.add(bood);
        studentManager.add(jame);
        studentManager.displayall();
    }

    @Test
    public void testFind() {
        Student andy = new Student(23, "andy");
        Student bood = new Student(25, "bood");
        Student jame = new Student(24, "jame");
        StudentManager studentManager = new StudentManager();
        studentManager.add(andy);
        studentManager.add(bood);
        studentManager.add(jame);
        studentManager.find("hello");
    }
}
