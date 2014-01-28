package com.dao;

import com.entities.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class QuestionDaoImpl implements QuestionDao {
    
    @Autowired 
    private SessionFactory sessionFactory;
    
    @Transactional
    @Override
    public Question getQuestionObj(Integer id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu;
    }
    
    @Transactional
    @Override
    public String getQuestion(Integer id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getQuestion();
    }
    
    @Transactional
    @Override
    public String getAnswer1(int id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns1();
    }
    
    @Transactional
    @Override
    public String getAnswer2(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns2();
    }
    
    @Transactional
    @Override
    public String getAnswer3(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns3();
    }
    
    @Transactional
    @Override
    public String getAnswer4(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns4();
    }
    
    @Transactional
    @Override
    public String getAnswer5(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns5();
    }
    
    @Transactional
    @Override
    public void setQuestion(int id,String qu)
    {
        Question question = getQuestionObj(id);
        question.setQuestion(qu);
        sessionFactory.getCurrentSession().update(question);
    }
    
    @Transactional
    @Override
    public void setAnswer1(int id, String an)
    {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    @Transactional
    @Override
    public void setAnswer2(int id,String an)
        {
        Question question = getQuestionObj(id);
        question.setAns2(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    @Transactional
    @Override
    public void setAnswer3(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    @Transactional
    @Override
    public void setAnswer4(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    @Transactional
    @Override
    public void setAnswer5(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
}
