package com.fastcampus.springpractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @DisplayName("리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void main() {
       String[] args = {"3", "1", "2"};

       Main.main(args);
    }
}