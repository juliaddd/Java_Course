public class Main {
    public static void main(String[] args) {
        String[] s1 = {"Mama", "papa", "brat"};
        String[] s2 = {"Dog", "cat", "Alien"};
        System.out.println("\nString array:");
        ArrayUtils.display(s1);

        System.out.println("\nConcatenated String array:");
        String[] s3 = ArrayUtils.concat(s1, s2);

        ArrayUtils.display(s3);

        Integer[] i1 = {1, 2, 3, 4,5};
        Integer[] i2 = { 6, 7, 8, 9, 10};
        System.out.println("\nInteger array:");
        ArrayUtils.display(i2);
        System.out.println("\nConcatenated Integer array:");
        Integer[] i3 = ArrayUtils.concat(i1, i2);
        ArrayUtils.display(i3);

        Person p1 = new Person("Yuliya", 2004);
        Person p2 = new Person("Katsiaryna", 2006);
        Person p3 = new Person("Dzmitry", 2003);
        Person p4 = new Person("Nastia", 2005);

        Person[] people1 = {p1,p2};
        Person[] people2 = {p3,p4};
        System.out.println("\nPerson array:");
        ArrayUtils.display(people1);
        System.out.println("\nConcatenated Person array:");
        Person[] people3 = ArrayUtils.concat(people1, people2);
        ArrayUtils.display(people3);

    }
}