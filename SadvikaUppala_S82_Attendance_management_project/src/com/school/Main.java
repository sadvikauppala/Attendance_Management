package com.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 10));
        students.add(new Student(2, "Bob", 9));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "Math"));
        courses.add(new Course(102, "Science"));

        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(1, 101, "Present"));
        records.add(new AttendanceRecord(2, 102, "Absent"));

        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}
