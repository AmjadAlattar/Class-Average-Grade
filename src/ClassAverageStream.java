import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassAverageStream {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grades (enter -1 to finish):");

        int grade;
        while ((grade = scanner.nextInt()) != -1) {
            grades.add(grade);
        }

        double average = grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average grade: " + average);
    }
}
