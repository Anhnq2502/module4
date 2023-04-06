package com.example.form_register.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name", columnDefinition = "varchar(50)")
    @NotBlank(message = "Họ không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài chỉ từ 5 đến 45 ký tự")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar(50)")
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài chỉ từ 5 đến 45 ký tự")
    private String lastName;
    @Column(name = "age")
    @Min(value = 18, message = "Tuổi không được nhỏ hơn 18")
    private Integer age;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "email", columnDefinition = "varchar(50)")
    @Email(message = "Không đúng định dạng email")
    private String email;
    @Column(name = "phone", columnDefinition = "varchar(50)")
    @Size(min = 10, max = 11, message = "Không đúng định dạng số điện thoại")
    private String phone;
    @Column(name = "account", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống tên tài khoản")
    private String account;
    @Column(name = "password", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống mật khẩu")
    private String password;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, Integer age, Integer gender, String email, String phone, String account, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.account = account;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
