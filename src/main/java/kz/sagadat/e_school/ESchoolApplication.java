package kz.sagadat.e_school;

import kz.sagadat.e_school.model.Pupils;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MappedTypes(Pupils.class)
@MapperScan("kz.sagadat.e_school.mapper")
@SpringBootApplication
public class ESchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESchoolApplication.class, args);
    }

}
