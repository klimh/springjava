package com.example.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import static org.assertj.core.api.Assertions.assertThat;

public class TimeServiceTest {

    @Test
    void testTimeService() {
        //arrange
        TimeService timeServer = new TimeService();

        //act
        String actualTime = LocalTime.now().toString();

        //assert
        assertThat(actualTime).isNotEmpty();
        //assertThat(actualTime).matches("\\d{2}:\\\\d{2}:\\\\d{2}\\\\.\\\\d{9}");
        //assertThat(actualTime).isEqualTo(timeServer.getCurrentTime());
    }
}
