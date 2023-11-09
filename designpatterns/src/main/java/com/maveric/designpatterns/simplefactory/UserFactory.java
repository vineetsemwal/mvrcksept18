package com.maveric.designpatterns.simplefactory;

public class UserFactory implements IUserFactory{
    @Override
    public User newUser(UserType userType) {
        if (userType==UserType.BUSINESS_USER){
            return new BusinessUser();
        }
        if (userType==UserType.REGULAR_USER){
            return new User();
        }
        if(userType==UserType.EMPLOYEE){
            return new Employee();
        }
        throw new UnsupportedOperationException("usertype not supported");
    }
}
