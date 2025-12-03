package edu.vistula.regex;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StudentFilterTest {

    @Test
    void testFilterGradeFive() {
        List<Student> students = Arrays.asList(
                new Student("Anna", "5"),
                new Student("Max", "4"),
                new Student("Olga", "5"),
                new Student("Ivan", "3")
        );

        List<Student> gradeFiveStudents = StudentFilter.filterGradeFive(students);

        assertEquals(2, gradeFiveStudents.size());
        assertEquals("Anna", gradeFiveStudents.get(0).getName());
        assertEquals("Olga", gradeFiveStudents.get(1).getName());
    }

    @Test
    void testNoGradeFive() {
        List<Student> students = Arrays.asList(
                new Student("Peter", "2"),
                new Student("Maria", "4")
        );

        List<Student> gradeFiveStudents = StudentFilter.filterGradeFive(students);

        assertTrue(gradeFiveStudents.isEmpty());
    }
}
