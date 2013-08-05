/*
 *  QuizBean
 *
 * Copyright 2013 Centina Systems Inc.
 *
 * All rights reserved
 *
 */

package com.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Lokesh Kumar P <lokeshpkumar at centinasystems dot com>
 */
@Named
@SessionScoped
public class QuizBean implements Serializable 
{
    private List<ProblemBean> problems = new ArrayList<ProblemBean>();
    private int currentIndex;
    private int score;
    
    public QuizBean()
    {
        problems.add( new ProblemBean( new int[]{3, 1, 4, 1, 5}, 9) );
        problems.add( new ProblemBean( new int[]{1, 1, 2, 3, 5}, 8) );
        problems.add( new ProblemBean( new int[]{1, 4, 9, 16, 25}, 36) );
        problems.add( new ProblemBean( new int[]{2, 3, 5, 7, 11}, 13) );
        problems.add( new ProblemBean( new int[]{1, 2, 4, 8, 16}, 32) );
    }
    
    public void setProblems(List<ProblemBean> vals)
    {
        this.problems = vals;
        this.currentIndex = this.score = 0;
    }
    
    public int getScore()
    {
        return this.score;
    }
    public ProblemBean getCurrent()
    {
        return this.problems.get( this.currentIndex );
    }
    
    public String getAnswer()
    {
        return "";
    }
    
    public void setAnswer(String val)
    {
        try
        {
            int ans = Integer.parseInt( val );
            if ( ans == this.problems.get( this.currentIndex ).getSolution() )
            {
                this.score++;
            }
            this.currentIndex = (this.currentIndex + 1) % this.problems.size();
        }
        catch( NumberFormatException nfe )
        {
            
        }
    }
}
