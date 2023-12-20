import React from "react";
import User from "./User";
const UserContext=React.createContext<User>({name:'',age:-1});
const UserProvider=UserContext.Provider;
const UserConsumer=UserContext.Consumer;
export {UserProvider, UserConsumer}

