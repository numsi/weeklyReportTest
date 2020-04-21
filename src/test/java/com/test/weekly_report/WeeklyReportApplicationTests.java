package com.test.weekly_report;

import com.test.weekly_report.entity.Student;
import com.test.weekly_report.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeeklyReportApplicationTests {

    @Autowired
    StudentService studentService;
    @Test
    void contextLoads() {
        List<Student> students = studentService.queryAll();
        for (Student s:students
             ) {
            System.out.println(s.toString());
        }

    }

}
