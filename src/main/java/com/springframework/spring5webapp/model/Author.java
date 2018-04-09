package com.springframework.spring5webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id @GeneratedValue(strategy = AUTO) private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")  // must equal to field name in other side of bidirectional relation
    private Set<Book> books = new HashSet<>();
}
