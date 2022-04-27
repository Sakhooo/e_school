package kz.sagadat.e_school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pupils {
    private long id;
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String address;

}
