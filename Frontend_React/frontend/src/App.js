import './App.css';
import React from 'react';
import SearchAppBar from './Components/navbar/navbar';
import Dashboard from './Components/dashboard/dashboard';
function App() {
  return (
    <div className="App">
      <SearchAppBar/>
      <br/>
      <Dashboard/>
    </div>
  );
}

export default App;
