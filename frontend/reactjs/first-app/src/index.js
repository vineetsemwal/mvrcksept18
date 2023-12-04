import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { UserDetails } from './UserDetails';

const e=document.getElementById('root');
const root = ReactDOM.createRoot(e);
const user={name:"sampath anna", age:25};
root.render(
  <React.StrictMode>

  <div>
    5 multiplied by 7= {5*7}
  </div>
  <br/>
  User Details Component below
  <UserDetails />

  User Details Component above

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
