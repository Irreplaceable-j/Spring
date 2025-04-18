package com.grepp.spring.test;

import com.grepp.spring.app.model.book.code.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookTest {

    @Autowired
    private BookTestRepository bookTestRepository;

    @Test
    @Transactional
    public void findAll() {
        bookTestRepository.findAll()
                          .forEach(System.out::println);
    }

    @Test
    public void count(){
        System.out.println(bookTestRepository.count());
    }

    @Test
    public void existsById(){
        System.out.println(bookTestRepository.existsById(1000L));
    }

    @Test
    @Transactional
    public void findByTitleOrAuthor(){
        bookTestRepository.findByTitleOrAuthor("디디", "김애란")
            .forEach(System.out::println);
    }

    @Test
    public void countByCategory(){
        System.out.println(bookTestRepository.countByCategory(Category.NOVEL));
    }

    @Test
    @Transactional
    public void findByCategoryAndAmountGreaterThanEqualAndTitleStartingWith(){
        System.out.println(bookTestRepository.findByCategoryAndAmountGreaterThanEqualAndTitleStartingWith(
           Category.NOVEL, 5, "디디"
        ));
    }




}