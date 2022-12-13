import logo from './logo.svg';
import './App.css';
import React from 'react';
import Routing from './components/Routing';
import { Router } from '@reach/router';
import Home from './components/Home';
import One from './components/One';

function App() {
  return (
    <div className="App">
      <Router>
        <Home path="/home"/>
        <Routing path="/:number/:color/:bgcolor"/>
        <One path="/:word"/>
      </Router>
    </div>
  );
}

export default App;
