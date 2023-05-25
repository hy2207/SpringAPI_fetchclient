package com.example.springAPI.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private List<Result> results;


    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Result{
        private String gender;
        private String email;
        private NameObj name;

    }


//    List<NameInfo> name;

//
//    @Builder
//    public User(String gender, String email){
//        this.gender = gender;
//        this.email = email;
//    }
//
    @Getter
    @AllArgsConstructor
    public static class NameObj{
        private String title;
        private String first;
        private String last;

    }
}
