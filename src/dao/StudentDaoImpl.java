package dao;

import entity.StudentEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentDao")
@Transactional
public class StudentDaoImpl implements StudentDao{
    @Resource(name="hibernateTemplate")
    private HibernateTemplate hibernateTemplate;
    @Override
    public void addStudent(StudentEntity studentEntity) {
        hibernateTemplate.save(studentEntity);
    }

    @Override
    public void deleteStudent(StudentEntity studentEntity) {
        hibernateTemplate.delete(studentEntity);
    }

    @Override
    public void updateStudent(StudentEntity studentEntity) {
        hibernateTemplate.update(studentEntity);
    }

    @Override
    public StudentEntity find(long stuNumber) {
        String hql = "from StudentEntity where stuNumber = ?";
        List<StudentEntity> list = (List<StudentEntity>) hibernateTemplate.find(hql, stuNumber);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public StudentEntity find(long stuNumber, String stuName) {
        String hql = "from StudentEntity where stuName = ?";
        List<StudentEntity> list = (List<StudentEntity>) hibernateTemplate.find(hql, stuName);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public StudentEntity find(String stuName, String stuPassword) {
        String hql = "from StudentEntity where stuName = ? and stuPassword = ?";
        List<StudentEntity> list = (List<StudentEntity>) hibernateTemplate.find(hql, stuName,stuPassword);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }


}
