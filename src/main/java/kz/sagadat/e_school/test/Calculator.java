package kz.sagadat.e_school.test;

import kz.sagadat.e_school.model.Pupils;

public class Calculator {
    public static int birthdayIn10Years(Pupils pupils){
        int age =  pupils.getAge()+10;
        return age;
    }

}
