package com.javalesson.oop.io;

import com.javalesson.oop.collections.map.treemap.AverageStudentGrade;
import com.javalesson.oop.collections.map.treemap.SubjectGrade;
import com.javalesson.oop.collections.map.treemap.TreeMapRunner;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.*;

public class IOMain {

    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE_NAME = "Students.bin";
    private static final String BUFFERED_FILE = "Buffered.bin";
    private static final String TEST_FILE_NAME = "S:\\IdeaProjects\\OOP\\GradeBook.txt";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
//        processGrades(grades, writer, BINARY_FILE_NAME);
//        readGradesFromFile(reader, BINARY_FILE_NAME);
//        processGrades(grades, writer, BINARY_FILE_NAME);
//        outputObjects(reader, BINARY_FILE_NAME);

        FileUtils utils = new FileUtils();
//        utils.printNioFileDetails(FILE_NAME);
//        Reader.readFileInFull(FILE_NAME);
//        Reader.nioReadFileWithBuffer(FILE_NAME);
//        Writer.nioWriteWithBuffer(BUFFERED_FILE);
//        Reader.nioReadWithStream(FILE_NAME);
//        Writer.nioWriteWithStream(BUFFERED_FILE);
//        Reader.nioReadWithChannel(FILE_NAME);
//        Writer.nioWriteWithChannel(BUFFERED_FILE);
//        Writer.writeWithRandomAccess(FILE_NAME);
        utils.processDir();

    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }

    private static void readGradesFromFile(Reader reader, String binaryFileName) {
        List<Student> students = reader.readObject(binaryFileName);
        for (Student student : students) {
            System.out.printf("Student: %s, Average grade: %.2f%n", student.getStudentName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }

    private static void outputObjects(Reader reader, String fileName) {
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f %n", student.getStudentName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }


}
