package lesson6_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main61 {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Петров", "А201", 1, 3, 3, 2, 3));
        students.add(new Student("Мария Сидорова", "ФМ202", 2, 5, 4, 5, 4));
        students.add(new Student("Петр Иванов", "333", 3, 2, 2, 3, 2));
        students.add(new Student("Анна Смирнова", "208", 6, 3, 4, 5, 5));

        System.out.println("\nСписок студентов:");
        printAllStudents(students);

        deleteStudents(students);

        System.out.println("\nСписок студентов после удаления:");
        printAllStudents(students);

        studentsCourseUp(students);

        System.out.println("\nСписок студентов после перевода на следующий курс:");
        printAllStudents(students);

        printStudents(students, 5);
    }

    public static void printAllStudents(Set<Student> students) {
        if (students.isEmpty()) {
            System.out.println("\nСписок студентов пуст");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Всего студентов: " + students.size() + "\n");
    }

    public static void deleteStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getScore() < 3) {
                System.out.println("Удален: " + student.getName() + " (балл: " + student.getScore() + ")");
                iterator.remove();
            }
        }
    }

    public static void studentsCourseUp(Set<Student> students) {
        Set<Student> toUpdate = new HashSet<>();

        for (Student student : students) {
            if (student.getScore() >= 3) {
                toUpdate.add(student);
            }
        }

        for (Student student : toUpdate) {
            try {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Переведен на " + student.getCourse() + " курс: " + student.getName() + " (балл: " + student.getScore() + ")");
            } catch (IllegalArgumentException e) {
                System.out.println("У " + student.getName() + " выпускной!");
            }
            ;
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        int counter = 0;
        System.out.println("\nСтуденты на " + course + " курсе: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                counter++;
                System.out.println(student.getName());
            }
        }
        System.out.println("Всего студентов: " + counter + "\n");
    }
}