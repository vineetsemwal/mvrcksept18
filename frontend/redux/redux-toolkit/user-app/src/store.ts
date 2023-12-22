import { configureStore } from "@reduxjs/toolkit";
import { userSlice } from "./userSlice";
//import  userSlice  from "./userSlice";

const store=configureStore(userSlice);

 export default store;
   //  reducer: userSlice.reducer,
