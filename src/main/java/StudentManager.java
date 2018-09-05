public class StudentManager {
    private Student[] students = new Student[20];
    private int size;

    public StudentManager() {

    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }

    public void displayall() {
        if (size == 0) {
            System.out.println("There is not any student in list ");
        } else if (size == 1) {
            System.out.println(" There is one student in list ");
            System.out.println(students[0].getinfomation() + ",");
            System.out.println();
        } else {
            System.out.println("There is " + size + " student in list: ");
            for (int i = 0; i < size; i++) {
                System.out.println(students[i].getinfomation() + "\t");
            }
        }
    }

    public void find(String name) {
        int j = 1;
        if (j < size) {
            for (int i = 0; i < size; i++) {
                if (name.equals(students[i].getName())) {
                    System.out.println(students[i].getinfomation());
                }
                j++;
            }
        } else {
            System.out.println("There is not student in list");
        }
    }
}
