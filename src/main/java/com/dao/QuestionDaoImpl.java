package com.dao;

import com.entities.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;


public class QuestionDaoImpl {
    
    @Autowired 
    private SessionFactory sessionFactory;
    
    public Question getQuestionObj(int id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu;
    }
    
    public String getQuestion(int id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getQuestion();
    }
    
    public String getAnswer1(int id)
    {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns1();
    }
    
    public String getAnswer2(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns2();
    }
    public String getAnswer3(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns3();
    }
    
    public String getAnswer4(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns4();
    }
    
    public String getAnswer5(int id)
            {
        Session session = sessionFactory.getCurrentSession();
        Question qu = (Question) session.createCriteria(Question.class).add(Restrictions.eq("questionId",id)).uniqueResult();
        return qu.getAns5();
    }
    
    public void setQuestion(int id,String qu)
    {
        Question question = getQuestionObj(id);
        question.setQuestion(qu);
        sessionFactory.getCurrentSession().update(question);
    }
    
    public void setAnswer1(int id, String an)
    {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    public void setAnswer2(int id,String an)
        {
        Question question = getQuestionObj(id);
        question.setAns2(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    public void setAnswer3(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    public void setAnswer4(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
    
    public void setAnswer5(int id,String an)
            {
        Question question = getQuestionObj(id);
        question.setAns1(an);
        sessionFactory.getCurrentSession().update(question);
    }
}
