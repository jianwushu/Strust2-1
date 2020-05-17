package test;

import dao.DormitoryDao;
import dao.StudentDao;
import entity.DormitoryEntity;
import entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestTest extends TestBase{
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    private DormitoryDao dormitoryDao;
    private StudentDao studentDao;
@Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry =
                new ServiceRegistryBuilder().applySettings(configuration.getProperties())
                        .buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }
@After
    public void destroy() {
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void creat(){
        Configuration cfg = new Configuration().configure();
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
    }
    @Test
    public void connect()  throws SQLException {
        initCtx();
        DataSource ds = ctx.getBean("dataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);
        conn.close();
    }

    public void initDao(){
        initCtx();
        dormitoryDao = ctx.getBean("dormitoryDao",DormitoryDao.class);
        studentDao = ctx.getBean("studentDao",StudentDao.class);
    }

    @Test

    public void testAdd(){
        DormitoryEntity dormitoryEntity = new DormitoryEntity("南一",112);
        StudentEntity studentEntity = new StudentEntity("王3",201720180002l);
        studentDao.addStudent(studentEntity);
        dormitoryDao.addDormitoryDao(dormitoryEntity);
    }
    /*增*/
    @Test
    public void save() {

    }
    /*删*/
    @Test
    public void delete(){

    }
    /*改*/
    @Test
    public void update(){

    }
    /*查*/
    @Test
    public void query(){
        String roomNumber = "admin";
        String dormitoryName = "1";
        StudentEntity dormitoryEntity = studentDao.find(roomNumber,dormitoryName);
        System.out.println(dormitoryEntity.getStuName());
    }
    @Test
    public void service1(){
    }
}