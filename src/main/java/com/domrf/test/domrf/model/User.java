package com.domrf.test.domrf.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.validation.constraints.*;

@RedisHash("user")
public class User {
    @Id
    @NotNull
    @ApiModelProperty(notes = "passport number of the User")
    private int passportId;
    @NotNull
    @ApiModelProperty(notes = "full name of the User")
    private String fullName;
    @NotNull
    @ApiModelProperty(notes = "current address of the User")
    private String address;

    public User(Integer passportId, String fullName, String address) {
        this.passportId = passportId;
        this.fullName = fullName;
        this.address = address;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
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

    @Override
    public String toString() {
        return "User{" +
                "passportId=" + passportId +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}