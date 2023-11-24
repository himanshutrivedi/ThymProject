package com.thym.entities;

import jakarta.validation.constraints.*;

public class LoginData {
    @NotBlank
    @Size(min = 4, max = 20)
    private String username;
//    @Pattern(regexp = "\"^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$\"\n" ,message = "please enter valid email address")
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    @AssertTrue(message = "please check terms and conditions")
    private boolean agreed;


    public LoginData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public LoginData() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
