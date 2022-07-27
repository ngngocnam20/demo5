package com.example.validate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import validate.Validated.ValidatedPhone;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class User {
    @Id
    private int id;
    @NotBlank(message = "Khong de trong.")
    private String ten;
    @NotBlank(message = "Khong de trong.")
    private String diaChi;
    @NotBlank(message = "Khong de trong.")
    @ValidatedPhone
    private String soDT;
}
