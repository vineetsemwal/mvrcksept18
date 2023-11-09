package com.maveric.designpatterns.simplefactory;

public interface IUserFactory {

    User newUser(UserType userType);
}
