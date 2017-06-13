package com.example.asiantech.demokotlin.model

/**
 * User
 *
 * @author at-ToanNguyen
 */
class User {
    var imgUser: String;
    var user:String;
    var ageUser:String;

    constructor(imgUser: String, user: String, ageUser: String) {
        this.imgUser = imgUser
        this.user = user
        this.ageUser = ageUser
    }
}