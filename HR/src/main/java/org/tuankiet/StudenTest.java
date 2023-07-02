package org.tuankiet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudenTest {
    /**
     * Create the list of students with 10 students
     *
     * @return the list of students
     */
    private List<Student> createListOfStudent() {
	List<Student> studentList = new ArrayList<>();
	studentList.add(new Student("Ho", "Kiet", "17A"));
	studentList.add(new Student("Minh", "Ha", "25A"));
	studentList.add(new Student("Ly", "Hai", "33A"));
	studentList.add(new Student("Hai", "Yen", "45A"));
	studentList.add(new Student("Minh", "Tuan", "11A"));
	studentList.add(new Student("Thanh", "Duong", "16A"));
	studentList.add(new Student("Nhut", "Tien", "27A"));
	studentList.add(new Student("Tan", "Vu", "38A"));
	studentList.add(new Student("My", "Phuong", "29A"));
	studentList.add(new Student("Kieu", "Ngan", "10A"));
	return studentList;
    }
    /**
     * Get the list of student
     *
     * @return the list student
     */
    public List<Student> getListStudents() {
	return this.createListOfStudent();
    }

    /**
     * Sort student list by ascending
     */
    private void sortByGradeAscending(List<Student> listName) {
	listName.sort(Comparator.comparing(Student::getGrade));
	listName.forEach(System.out::println);
    }

    /**
     * Sort student list by descending
     */
    private void sortByGradeDescending(List<Student> listName) {
	listName.sort(Comparator.comparing(Student::getGrade).reversed());
	listName.forEach(System.out::println);
    }

    /**
     * Sort list of student by ascending
     */
    public void showListStudentsByAscending() {
	sortByGradeAscending(this.createListOfStudent());
    }

    /**
     * Sort list of student by descending
     */
    public void showListStudentsByDescending() {
	sortByGradeDescending(this.createListOfStudent());
    }
}
