package com.maveric.designpatterns.simplefactory;

public class SimpleFactoryUse {
    public static void main(String[] args) {
        IUserFactory factory=new UserFactory();
        BaseUser  user1=factory.newUser(UserType.BUSINESS_USER);
        BaseUser user2=factory.newUser(UserType.EMPLOYEE);
        BaseUser user3=factory.newUser(UserType.REGULAR_USER);
     //   User user1 =factory.newUser(UserType.REGULAR_USER);
   //   User user2=factory.newUser(UserType.BUSINESS_USER);
    //  User user3=factory.newUser(UserType.EMPLOYEE);
    }
}
