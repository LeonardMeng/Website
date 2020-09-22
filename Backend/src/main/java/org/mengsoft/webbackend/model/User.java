package org.mengsoft.webbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.mengsoft.webbackend.common.annotation.Phone;
import org.springframework.data.relational.core.mapping.Embedded;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@ApiModel(value = "User Info")
@Data
public class User {

    @ApiModelProperty("value = User ID")
    private Long userId;

    @NotEmpty
    @Length(min = 6, max = 14, message = "The length of username must be 6 - 12.")
    private String userName;

    private String nickname;

    @Email
    private String email;

    @Phone
    private String mobile;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String role;

    public User(Long userId, String userName, String nickname, String email, String mobile, String password, String role) {
        this.userId = userId;
        this.userName = userName;
        this.nickname = nickname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.role = role;
    }
}