package com.lib8.leetcodecn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddToArrayFormTest {

    private AddToArrayForm solution;

    @BeforeEach
    void setUp() {
        solution = new AddToArrayForm();
    }

    @Test
    void addToArrayForm() {
        assertThat(addToArrayForm(181, 2, 7, 4)).containsSequence(4, 5, 5);
    }

    @Test
    void normal() {
        assertThat(addToArrayForm(34, 1, 2, 0, 0)).containsSequence(1, 2, 3, 4);
    }

    @Test
    void OnetoNineLoop() {
        assertThat(addToArrayForm(3, 9, 9, 9, 9)).containsSequence(1, 0, 0, 0, 2);
    }

    @Test
    void littleArrayToBigK() {
        assertThat(addToArrayForm(993, 7)).containsSequence(1, 0, 0, 0);
    }

    private List<Integer> addToArrayForm(int num, int... array) {
        return solution.addToArrayForm(array, num);
    }
}