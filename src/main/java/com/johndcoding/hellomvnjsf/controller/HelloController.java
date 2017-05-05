package com.johndcoding.hellomvnjsf.controller;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by JohnDCoding on 05/05/2017.
 */
@ManagedBean
public class HelloController implements Serializable {


    public Date getCurrentDate(){
        return new Date();
    }

}
