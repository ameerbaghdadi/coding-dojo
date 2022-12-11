import logo from './logo.svg';
import './App.css';
import Form from './components/Form';
import Boxes from './components/Boxes';
import { useState } from 'react';

function App() {

  const [newColor, setNewColor] = useState([]);

  const boxColor = (x) => {
    setNewColor(x);
  }

  return (
    <div className="App">
      <>
        <Form newColor = {boxColor}/>
        <Boxes colorDisplay = {newColor}/>
      </>
    </div>
  );
}

export default App;
