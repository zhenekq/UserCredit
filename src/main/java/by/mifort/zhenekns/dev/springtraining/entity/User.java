package by.mifort.zhenekns.dev.springtraining.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;



@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long id;

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
