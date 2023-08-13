package com.nctech.loginservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity class representing user login credentials.
 * This class is used to map user login information to a database table.
 */
@Entity
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;

    /**
     * Default constructor for LoginEntity.
     * Required by JPA for entity mapping.
     */
    public LoginEntity() {
    }

    /**
     * Parameterized constructor for LoginEntity.
     *
     * @param userName The username associated with the login credentials.
     * @param password The password associated with the login credentials.
     */
    public LoginEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Get the ID of the login entity.
     *
     * @return The ID of the login entity.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the login entity.
     *
     * @param id The ID to set for the login entity.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the username associated with the login credentials.
     *
     * @return The username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the username associated with the login credentials.
     *
     * @param userName The username to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get the password associated with the login credentials.
     *
     * @return The password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password associated with the login credentials.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
