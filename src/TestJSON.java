import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

/**
 * ClassName: Test
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author CYC
 * @Create 2023/12/25 14:27
 * @Version 1.0
 */
public class TestJSON {
    @Test
    public void test() throws JsonProcessingException {
        Dog dog=new Dog("小黄");
        ObjectMapper objectMapper = new ObjectMapper();
        //String dogStr=objectMapper.writeValueAsString(dog);
        System.out.println(objectMapper.writeValueAsString(dog));
    }
    @Test
    public void testReadJson() throws JsonProcessingException {
        String Dogstr="{\"name\":\"小黄\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Dog dog=objectMapper.readValue(Dogstr,Dog.class);
        System.out.println(dog);
    }
}
