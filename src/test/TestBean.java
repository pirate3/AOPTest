package test;

/**
 * Created by ningzhao6 on 2016/12/9 0009.
 */
public class TestBean {
    private String testStr = "testStr";

    public String getTestStr(){
        return testStr;
    }

    public void setTestStr(String testStr){
        this.testStr = testStr;
    }

    public void printTest(){
        System.out.println("test Bean");
    }
}
