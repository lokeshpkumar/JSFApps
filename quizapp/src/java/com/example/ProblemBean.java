/*
 *  ProblemBean
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

/**
 *
 * @author Lokesh Kumar P <lokeshpkumar at centinasystems dot com>
 */
public class ProblemBean implements Serializable
{
    private List<Integer> sequence;
    private int solution;

    public ProblemBean(int[] values, int sol)
    {
        this.sequence = new ArrayList<Integer>();
        for( int i = 0; i < values.length; i++ )
        {
            this.sequence.add(values[i]);
        }
        this.solution = sol;
    }

    public List<Integer> getSequence()
    {
        return sequence;
    }

    public void setSequence(
            List<Integer> sequence )
    {
        this.sequence = sequence;
    }

    public int getSolution()
    {
        return solution;
    }

    public void setSolution( int solution )
    {
        this.solution = solution;
    }
    
}
