import org.example.Program;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age=age;
        this.result=result;// Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                { 1,  false},
                { 18, true},
                { 10,  false},
                { 19, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("message",result,isAdult);
    }
}