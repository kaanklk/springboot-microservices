package com.dailycodebuffer.userservice.vo;

import com.dailycodebuffer.userservice.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private Users user;
    private Department department;
}
