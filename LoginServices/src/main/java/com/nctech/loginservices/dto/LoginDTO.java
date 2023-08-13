package com.nctech.loginservices.dto;

import lombok.Data;

/**
 * A data transfer object (DTO) representing user login credentials.
 * This class encapsulates the username and password required for user authentication.
 */
@Data
public class LoginDTO {

    /**
     * The username provided by the user.
     */
    private String userName;

    /**
     * The password provided by the user.
     */
    private String password;

    /*
    we can later add a feature like "Remember Me" and "Two-Step Authentication"
     */
}
