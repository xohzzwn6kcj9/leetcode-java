package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("201. Bitwise AND of Numbers Range")
class S201BitwiseAndOfNumbersRangeTest {
    private S201BitwiseAndOfNumbersRange subject;

    @BeforeEach
    void setUp() {
        subject = new S201BitwiseAndOfNumbersRange();
    }

    @Test
    void example1() {
        final int m = 5;
        final int n = 7;
        assertThat(subject.rangeBitwiseAnd(m, n)).isEqualTo(4);
    }

    @Test
    void example2() {
        final int m = 0;
        final int n = 1;
        assertThat(subject.rangeBitwiseAnd(m, n)).isEqualTo(0);
    }

    @Test
    void aBigSizeOrRange() {
        final int m = 5;
        final int n = 100;
        for(int i=0; i<100; i++){
            for(int j=i+1; j<100; j++){
                int answer = subject.rangeBitwiseAnd(i, j);
                if(answer != 0){
                    System.out.println("["+i+", "+ j+ "] => " + answer);
                }
            }
        }
        assertThat(subject.rangeBitwiseAnd(m, n)).isEqualTo(0);
    }
}