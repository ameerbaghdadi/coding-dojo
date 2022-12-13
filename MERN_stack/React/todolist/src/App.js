import logo from './logo.svg';
import './App.css';
import Form from './components/Form';
import List from './components/List';
import { useState } from 'react';

function App() {

  const[task, setTask] = useState([]);

  const all = (t) => {
    setTask(task.concat(t));
  }

  return (
    <div className="App">
      <>
      <Form tasks = {all}/>
      <List allTasks = {task}/>
      </>
    </div>
  );
}

export default App;
