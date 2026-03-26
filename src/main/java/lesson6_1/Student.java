package lesson6_1;

public class Student {
    private String name;
    private String group;
    private int course;
    private int mathGrade;
    private int mechanicsGrade;
    private int chemistryGrade;
    private int bigBangTheoryGrade;
    private double score;

    public Student (String name, String group, int course, int mathGrade, int mechanicsGrade, int chemistryGrade, int bigBangTheoryGrade) {

    if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Имя студента не может быть пустым.");
    }

    if (group == null || group.trim().isEmpty()) {
        throw new IllegalArgumentException("Группа не может быть пустой: " + name);
    }

    if (course < 1 || course > 6) {
        throw new IllegalArgumentException("Курс должен быть от 1 до 6. Получено: " + course + " " + name);
    }

    if (mathGrade < 1 || mathGrade > 5) {
        throw new IllegalArgumentException("Оценка по математике должна быть от 1 до 5. Получено: " + mathGrade+ " " + name);
    }

    if (mechanicsGrade < 1 || mechanicsGrade > 5) {
        throw new IllegalArgumentException("Оценка по механике должна быть от 1 до 5. Получено: " + mechanicsGrade + " " + name);
    }

    if (chemistryGrade < 1 || chemistryGrade > 5) {
        throw new IllegalArgumentException("Оценка по химии должна быть от 1 до 5. Получено: " + chemistryGrade + " " + name);
    }

    if (bigBangTheoryGrade < 1 || bigBangTheoryGrade > 5) {
        throw new IllegalArgumentException("Оценка по теории большого взрыва должна быть от 1 до 5. Получено: " + bigBangTheoryGrade + " " + name);
    }

        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.mechanicsGrade = mechanicsGrade;
        this.chemistryGrade = chemistryGrade;
        this.bigBangTheoryGrade = bigBangTheoryGrade;
        this.score = calculateScore();
    }

    private double calculateScore() {
        return (double) (mathGrade + mechanicsGrade + chemistryGrade + bigBangTheoryGrade) / 4;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String  getGroup() {
        return  group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1 || course > 6) {
            throw new IllegalArgumentException("Курс должен быть от 1 до 6. Получено: " + course);
        }
        this.course = course;
    }

    public String toString() {
        return "Студент: " + name + ", группа: " + group + ", курс: " + course + ", средний балл: " + score;
    }
}