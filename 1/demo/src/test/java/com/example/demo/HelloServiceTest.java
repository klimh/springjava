package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloServiceTest {

    @Test
    void sayHelloReturnsExpectedMessage(){
        //arrange
        HelloService service = new HelloService();

        //act
        String msg = service.sayHello();

        //assert
        assertThat(msg).isEqualTo("Hello");
    }
}
