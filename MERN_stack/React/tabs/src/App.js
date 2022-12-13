import logo from './logo.svg';
import './App.css';
import Tabs from './components/Tabs';
import Info from './components/Info';
import { useState } from 'react';

function App() {

  const [tab, setTab] = useState("");

  const appArr = [
    { label: "ameer", value: "okokokok" },
    { label: "saeed", value: "plplplpl" },
    { label: "riyad", value: "dcdcdcdcd" },
  ];

  return (
    <div className="App">
      <>
        <Tabs tabs = {appArr} selectTab = {setTab}/>
        <Info data = {tab}/>
      </>
    </div>
  );
}

export default App;
