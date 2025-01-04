package numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {
    private PerfectNumbers perfectNumbers;
    @BeforeEach
    void init(){
        perfectNumbers = new PerfectNumbers();

    }
    @ParameterizedTest
    @CsvSource({"6, true","8128, true","7246, false","9, false"})
    void perfectNumberCsvSourceTest(int number, boolean result){
        assertEquals(result,perfectNumbers.isPerfectNumber(number));
    }
    @ParameterizedTest
    @MethodSource
    void perfectNumberMethodSourceTest(int number, boolean result){
        assertEquals(result,perfectNumbers.isPerfectNumber(number));
    }
    static Stream<Arguments> perfectNumberMethodSourceTest(){
        return Stream.of(Arguments.of(6,true),
                Arguments.of(9,false),
                Arguments.of(8128,true),
                Arguments.of(7246,false)
        );
    }
    @ParameterizedTest
    @MethodSource("perfectNumberMethodSourceTest")
    void perfectNumberMethodSourceWithSpecialNameTest(int number, boolean result){
        assertEquals(result,perfectNumbers.isPerfectNumber(number));
    }

}