import myproject.one.MyFirstClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstClassTest {

    @Test
    public void shouldReturnTrue() {
        MyFirstClass myFirstClass = new MyFirstClass();
        assertThat(myFirstClass.returnTrue()).isTrue();
    }

    @Test
    public void shouldTestAddMethod() {
        MyFirstClass myFirstClass =  new MyFirstClass();
        assertThat(myFirstClass.returnSum(10,20)).isEqualTo(30);


    }

    @Test
    public void shouldTestAddMethodReturnError() {
        MyFirstClass myFirstClass =  new MyFirstClass();
        assertThat(myFirstClass.returnSum(0,0)).isEqualTo(0);


    }


}
