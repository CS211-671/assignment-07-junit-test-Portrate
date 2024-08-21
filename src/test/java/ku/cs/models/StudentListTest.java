package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียน")
    void testAddNewStudentNoScore() {
        StudentList s = new StudentList();
        s.addNewStudent("6xxxxxxxxx", "StudentTest");
        assertEquals(1, s.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียน")
    void testAddNewStudent() {
        StudentList s = new StudentList();
        s.addNewStudent("6xxxxxxxxx", "StudentTest", 85);
        assertEquals(1, s.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบการค้นหานักเรียน")
    void testFindStudentById() {
        StudentList s = new StudentList();
        s.addNewStudent("6xxxxxxxxx", "StudentTest", 85);
        assertEquals("6xxxxxxxxx", s.findStudentById("6xxxxxxxxx").getId());
    }

    @Test
    @DisplayName("ทดสอบใส่คะแนนให้นักเรียน")
    void testGiveScoreToId() {
        StudentList s = new StudentList();
        s.addNewStudent("6xxxxxxxxx", "StudentTest");
        s.giveScoreToId("6xxxxxxxxx", 100);
        assertEquals(100, s.findStudentById("6xxxxxxxxx").getScore());
    }

    @Test
    void testViewGradeOfId() {
        StudentList s = new StudentList();
        s.addNewStudent("6xxxxxxxxx", "StudentTest", 85);
        assertEquals("A", s.viewGradeOfId("6xxxxxxxxx"));
    }
}