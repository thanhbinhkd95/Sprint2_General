package Dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDto {
    private Long id;
    @NotBlank
    @Size(max = 30, min = 2)
    private String userName;
    @NotBlank
    @Size(max = 30, min = 2)
    private String password;
    @NotBlank
    private String image;
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotBlank
    private String birthday;
    @NotNull
    private Integer gender;
    private Integer point;
    @NotBlank
    private String idCard;
    @NotBlank
    private String email;
    @NotBlank
    private String phone;
    @NotBlank
    private String address;
}
