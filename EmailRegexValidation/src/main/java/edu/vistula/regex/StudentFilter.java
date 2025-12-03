package edu.vistula.regex;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class StudentFilter {

    // Regex для поиска именно оценки "5"
    private static final Pattern gradeFivePattern = Pattern.compile("^5$");

    public static List<Student> filterGradeFive(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGrade() != null && gradeFivePattern.matcher(s.getGrade()).matches()) {
                result.add(s);
            }
        }
        return result;
    }
}
