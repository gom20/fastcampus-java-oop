package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){
        Main.main(null);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> sorted = bubbleSort.sort(List.of(1, 2, 4, 6, 4,3));
        assertEquals(List.of(1, 2, 3, 4, 4, 6), sorted);

    }

    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList_Java(){
        Main.main(null);
        JavaSort<Integer> javaSort = new JavaSort<>();
        List<Integer> sorted = javaSort.sort(List.of(1, 2, 4, 6, 4,3));
        assertEquals(List.of(1, 2, 3, 4, 4, 6), sorted);

    }

}