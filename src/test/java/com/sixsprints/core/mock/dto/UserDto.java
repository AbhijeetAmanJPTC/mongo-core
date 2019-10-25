package com.sixsprints.core.mock.dto;

import com.sixsprints.core.mock.domain.embedded.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  private String email;

  private String name;

  private Boolean flag;

  private Address address;

}