/*
 *  UserBean
 *
 * Copyright 2013 Centina Systems Inc.
 *
 * All rights reserved
 *
 */

package com.example;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Lokesh Kumar P <lokeshpkumar at centinasystems dot com>
 */
@Named("user")
@SessionScoped
public class UserBean implements Serializable
{
    private String name;
    private String pass;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getPass()
    {
        return pass;
    }

    public void setPass( String pass )
    {
        this.pass = pass;
    }

    public String getGreeting()
    {
        if ( name == null || name.length() == 0 )
            return "";
        else
            return "Welcome to Ajax " + name + " !";
    }
}
