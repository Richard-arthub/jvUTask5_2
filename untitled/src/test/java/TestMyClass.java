import org.example.MyClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class TestMyClass {

    @Test
    void testPlus(){
        MyClass myClass = new MyClass();
        assertEquals(myClass.plus(2, 3), 5);
    }

    void rrrr(){};
}
