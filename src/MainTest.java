import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        System.out.println("main函数测试");
        File a=new File("D:\\桌面\\jisuanji-java\\subject.txt");
        Boolean b=a.exists();
        Assert.assertTrue(b);
    }

    @Test
    public void makeFormula() {
        System.out.println("makeFormula函数测试");
        Assert.assertNotNull(Main.MakeFormula());
    }

    @Test
    public void solve() {
        System.out.println("solve函数测试");
        Assert.assertNotNull(Main.Solve(Main.MakeFormula()));
    }
}