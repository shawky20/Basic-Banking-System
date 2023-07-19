import './App.css';
import React, { Fragment } from 'react'; // JSX
import SearchAppBar from './Components/navbar/navbar';
import Dashboard from './Components/dashboard/dashboard';
function App() {
  // elreturn JSX (HTML + JS) which is converted to JS by Babel and then to HTML by React and can use variables in JSX
  // JSX is a syntactic sugar for React.createElement(component, props, ...children) 
  const myStyles = { color: "red", backgroundColor: "blue" };
  const features = ["responsive", "lightweight", "fast"];
  return (
    // React.Fragment is a wrapper for multiple elements insted of using a div so that we don't have to use a div as it willl be considered as html element 
    <Fragment> 
      <div className="App">
        <h1 style={myStyles}>Banking System</h1> {/* Inline CSS the first brackets are from JSX */}
        <h1 style={{ color: "red", backgroundColor: "blue" }}>Banking System</h1> {/* Inline CSS */}
        <div >
          {
            //* to loop through an array in JSX
            features.map((feature, index) => (
               <h1 key={index}>{feature}</h1>
            ))
          }
        </div>
        <SearchAppBar/>
        <br/>
        <Dashboard/>
      </div>
    </Fragment>
  );
}

export default App;
