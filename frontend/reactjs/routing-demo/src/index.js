import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';
import { App } from './App';
const e=document.getElementById('root');
const root = ReactDOM.createRoot(e);

const user={username:"kushal", age:21};
root.render(
  <React.StrictMode>
   <App/>

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
