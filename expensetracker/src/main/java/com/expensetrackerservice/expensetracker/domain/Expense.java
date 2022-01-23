package com.expensetrackerservice.expensetracker.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Document
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator ="native")
    @GenericGenerator(name = "native",
            strategy = "native")
    private Long id;

    private String purpose;
    private Long amount;
    private String place;



}
