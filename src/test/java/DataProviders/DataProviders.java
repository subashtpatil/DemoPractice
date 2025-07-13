package DataProviders;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviders {

    @DataProvider(name="dp1")
    public static Object[][] getData(Method m) {
        Object[][] data = null;
        if (m.getName().equals("testLogin")){

             data = new Object[2][2];
        data[0][0] = "raman";
        data[0][1] = "ramanPwd";

        data[1][0] = "Rahul";
        data[1][1] = "RahulPwd";
    }else if (m.getName().equals("testUserReg")){

             data = new Object[2][3];
            data[0][0]= "Stp";
            data[0][1]= "Pats";
            data[0][2]= "stp@gmail.com";

            data[1][0]= "SSP";
            data[1][1]= "Pats";
            data[1][2]=  "papu@gmail.com";
}
return  data;
    }

/// ==================================================================


   /* @DataProvider(name="dp2")
    public static Object[][] getData2(){

        Object[][] data = new Object[2][3];
        data[0][0]= "raman";
        data[0][1]= "ahuja";
        data[0][2]= "stp@gmail.com";

        data[1][0]= "Rahul";
        data[1][1]= "Arora";
        data[1][2]=  "papu@gmail.com";
        return  data;
    }*/

}
