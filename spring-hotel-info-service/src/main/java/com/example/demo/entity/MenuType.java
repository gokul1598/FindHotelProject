package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Hotel")
public class MenuType {
   private String menu1;
   private String menu2;
   private String menu3;
   private String menu4;
}
