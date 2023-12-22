import { PayloadAction, createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import User from "./user";
import { stat } from "fs";
import fetchApi from "./userApi";



const initialState = { id: -1, name: "not-init", age: -1 };
const userSlice = createSlice({
    name: "user",
    initialState,
    reducers: {
        fetchUser: (state: User, action: PayloadAction<User>) => {
            const payloadUser = action.payload;
            state.id = payloadUser.id;
            state.name = payloadUser.name;
            state.age = payloadUser.age;
        }
    }

}

);


const fetchUserById = createAsyncThunk(
    'users/fetchUserById',
    async (id:number, thunkApi)=>{
      const promise= fetchApi.fetchUserById(id);
      const user=await promise;
      thunkApi.dispatch(fetchUser(user));
      console.log("user fetched",user);
      return user;
    }
)

export const {fetchUser}=userSlice.actions
export {userSlice,fetchUserById};


