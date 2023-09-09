package com.example.Book.my.show.Converters;

import com.example.Book.my.show.ReqDTOs.userDTO;
import com.example.Book.my.show.models.userEntity;

public class UserDto_to_Entity {

   public static userEntity converterUserDtoToEntity(userDTO userDTO){
       userEntity user= userEntity.builder()
               .name(userDTO.getName())
               .email(userDTO.getEmail())
               .password(userDTO.getPassword())
               .build();
       return user;
   }
}
