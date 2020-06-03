package com.domrf.test.domrf.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.validation.constraints.NotNull;

@RedisHash("user")
public class User {
    @Id
    @NotNull
    @ApiModelProperty(notes = "passport number of the User")
    private int id;
    @NotNull
    @ApiModelProperty(notes = "full name of the User")
    private String fullName;
    @NotNull
    @ApiModelProperty(notes = "current address of the User")
    private String address;

    public User(Integer id, String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}