package com.grepp.spring.app.model.rent.dto;

import com.grepp.spring.app.model.rent.code.RentState;
import com.grepp.spring.infra.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class RentBook extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private Long BookId;
    private String bookTitle;
    @Enumerated(EnumType.STRING)
    private RentState state;
    private LocalDate returnDate;

}
