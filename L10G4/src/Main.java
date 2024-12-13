import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(5, "Kuba", 4.3 );
        Student s2 = new Student(2, "Banna", 3.5 );
        Student s3 = new Student(3, "Kasia", 4.4 );
        Student s4 = new Student(4, "Alice", 2.8);
        Student s5 = new Student(6, "Eve", 3.7);

        // List - dynamiczna, dodawanie/usuwanie el-ow w kazdym miejscu, wyszukiwanie - iteracje przez liste
        // indeksy, unordert
        ArrayList<Student> studentsAL = new ArrayList<Student>();
        studentsAL.add(s1);
        studentsAL.add(s2);
        studentsAL.add(s3);
        studentsAL.add(s4);
        studentsAL.add(s5);

        System.out.println("\nArrayList: ");
        for (Student student : studentsAL) {
            System.out.println(student);
        }

        //PriorityQueue - queue: fifo
        //ordered
        PriorityQueue<Student> studentsPQ = new PriorityQueue<Student>();
        studentsPQ.addAll(studentsAL);

        System.out.println("\nPriorityQueue: "+studentsPQ.poll());

        // HashSet: klucze - hashCode, unordered, bardzo szybkie wyszukiwanie el
        HashSet<Student> studentsHS = new HashSet<Student>();
        studentsHS.add(s1);
        studentsHS.add(new Student(2, "Yuliya", 5.0));
        studentsHS.add(s2);
        studentsHS.add(s3);

        System.out.println("\nHashSet: ");
        for (Student student : studentsHS) {
            System.out.println(student);
        }

        // TreeSet: HashSet + ordered
        TreeSet<Student> studentsTS = new TreeSet<Student>(new Student.StudentNameComparator());
        studentsTS.addAll(studentsAL);
        System.out.println("\nTreeSet: "+studentsTS);


        //HashMap: HashSet, tylko key+value
        HashMap<Integer, Student> studentsHM = new HashMap<Integer, Student>();
        studentsHM.put(s1.getId(), s1);
        studentsHM.put(s2.getId(), s2);
        studentsHM.put(s3.getId(), s3);
        studentsHM.put(s4.getId(), s4);

        System.out.println("\nHashMap: " + studentsHM);

        // TreeMap: hashmap ale ordered
        Map<Integer, Student> studentsTM = new TreeMap<>();
        studentsTM.put(s1.getId(), s1);
        studentsTM.put(s2.getId(), s2);
        studentsTM.put(s3.getId(), s3);
        studentsTM.put(s4.getId(), s4);
        System.out.println("\nTreeMap: " + studentsTM);

    }
}