import React from 'react';
import logo from './logo.svg';
import './App.css';
import { ClickCounter} from './ClickCounter';
import { UserDetails } from './UserDetails';
import User from './User';
import { UserProvider } from './UserContext';
import { ContextParent } from './contextdemo/ContextParent';

function App() {
  const user:User={id:1,name:"mahesh", age:24};
  return (
    <div className="App">
      
      <UserDetails user={user}/>
     <ClickCounter/>

<h3>Context Provider demo</h3>
<UserProvider value={user}>
  <ContextParent></ContextParent>
</UserProvider>

    </div>
  );
}

export default App;
