import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { UserDetails } from './UserDetails';
import { App } from './App';

const e=document.getElementById('root');
const root = ReactDOM.createRoot(e);

root.render(
  <React.StrictMode>
<App/>

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
