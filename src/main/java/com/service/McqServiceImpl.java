package com.service;

import java.util.List;
import java.util.Random;

import com.dao.KeysDao;
import com.dao.QuestionDao;
import com.entities.Keys;
import com.entities.Mcq;
import com.entities.Question;


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
        int i = 1;
        int j;
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
        
        return mcq;
    }
    
    
}
