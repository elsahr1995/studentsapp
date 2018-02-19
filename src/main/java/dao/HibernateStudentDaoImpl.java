package dao;

import models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateStudentDaoImpl implements StudentDao {

    private final SessionFactory factory;

    public HibernateStudentDaoImpl() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public List<Student> values() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from Student").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public Student find(Long id) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return (Student) session.get(Student.class, id);
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public Long add (Student student) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(student);
            return student.getId();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public void update(Student student) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.update(student);
        } finally {
            tx.commit();
            session.close();
        }

    }

    @Override
    public Integer delete(Long id) {

        Integer count = 0;

        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.delete(find(id));
            count++;
        } finally {
            tx.commit();
            session.close();
        }

        return count;
    }
}
