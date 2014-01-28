package com.service;


import java.util.Random;


import com.dao.QuestionDao;

import com.entities.Mcq;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("mcqService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class McqServiceImpl implements McqService
{
    @Autowired
    QuestionDao questionDao;

    @Override
    public Mcq generateMcq(int nb) {
        Integer i = 1;
        Integer j;
        int taille;
        boolean ok;
        Mcq mcq = new Mcq();
        
        while(questionDao.getQuestion(i) != null)
        {
            i++;
        }
        taille = i;
        int tab[ ] = new int[i];
        
        while(i>0)
        {
            Random rand = new Random();
            int nombre = rand.nextInt(i);
            tab[i]=nombre;
            j=0;
            ok = true;
            while(j<taille)
            {
                if(nombre==tab[j])
                        ok = false;
                j++;
            }
            if(ok==true)
            {
                mcq.getMcq().add(questionDao.getQuestionObj(nombre));
                i--;
            }
        }
        
        /*Mcq mcq = new Mcq();
        mcq.addQuestion(questionDao.getQuestionObj(1));*/
        return mcq;
    }
    
    
}
