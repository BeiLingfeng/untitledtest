import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.Test;

@Ignore
public class NewTest {
    Calculate calcuate;
    @Test
    public void testAdd() {
        calcuate = new Calculate();
        int result = calcuate.add(2, 3);
        Assert.assertEquals(result,5);
        /*
         * "加法有问题"：期望值和实际值不一致时，显示的信息
         * 5 ：期望值
         * result ：实际值
         */

    }
    @Test
    public void testSubtract() {
        calcuate = new Calculate();
        int result = calcuate.subtract(12, 2);
        Assert.assertEquals(result,10000,"减法测试有问题"); //故意设置减法期望值为10000
    }
    @Test
    public void testMultiply() {
        calcuate = new Calculate();
        int result = calcuate.multiply(2, 3);
        Assert.assertEquals(result, 6);
    }
    @Test
    public void testDivide() {
        calcuate = new Calculate();
        int result = calcuate.divide(6, 3);
        Assert.assertEquals(result, 2);
    }
}
