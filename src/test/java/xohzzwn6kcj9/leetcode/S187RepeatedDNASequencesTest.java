package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("187. Repeated DNA Sequences")
class S187RepeatedDNASequencesTest {

    private S187RepeatedDNASequences subject;

    @BeforeEach
    void setUp() {
        subject = new S187RepeatedDNASequences();
    }

    @Test
    void example1() {
        assertThat(subject.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"))
                .containsExactlyInAnyOrderElementsOf(
                        Arrays.asList(
                                "AAAAACCCCC",
                                "CCCCCAAAAA"
                        )
                );
    }

    @Test
    void emptyList() {
        assertThat(subject.findRepeatedDnaSequences("")).isEmpty();
    }

    @Test
    void name() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i + ", i << 1 = " + (i << 1) + ", i << 2 = " + (i << 2));
        }

    }
}