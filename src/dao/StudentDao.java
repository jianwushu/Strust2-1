package dao;

import entity.StudentEntity;

public interface StudentDao {
    public void addStudent(StudentEntity studentEntity);
    public void deleteStudent(StudentEntity studentEntity);
    public void updateStudent(StudentEntity studentEntity);
    public StudentEntity find(long stuNumber);
    public StudentEntity find(long stuNumber, String stuName);
    public StudentEntity find(String stuName,String stuPassword);
}
