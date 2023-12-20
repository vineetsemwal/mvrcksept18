import React from 'react';
import logo from './logo.svg';
import './App.css';
import { ClickCounter} from './ClickCounter';
import { UserDetails } from './UserDetails';
import User from './User';

function App() {
  const user:User={name:"mahesh", age:24};
  return (
    <div className="App">
      
      <UserDetails user={user}/>
     <ClickCounter/>
    </div>
  );
}

export default App;
