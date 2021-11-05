package az.et.lesson03.bean;

import lombok.*;

@Data
@AllArgsConstructor
public class User {
    // POJO - Plain Old Java Object
    private Long id;
    private String name;
    private String surname;
}