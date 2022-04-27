package kz.sagadat.e_school;

import kz.sagadat.e_school.model.Pupils;
import kz.sagadat.e_school.test.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SuperTest {

    @Test(groups = "mult test")
    public void superTest(){
        Pupils pupils = new Pupils();
        pupils.setName("Sagadat");
        pupils.setSurname("Abdiashim");
        pupils.setAge(25);
        pupils.setSex("m");
        pupils.setAddress("Almaty");
        int age =  Calculator.birthdayIn10Years(pupils);
        Assert.assertEquals(34,age,"The result is not corrected");
    }

    @Test()
    public void checkSecond(){
        System.out.println("hello world");
    }

}
