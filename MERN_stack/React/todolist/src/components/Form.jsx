import React, { useState } from 'react'

const Form = (props) => {

    const[task, setTask] = useState([]);

    const addTask = (e) => {
        e.preventDefault();
        props.tasks(task);
        
    }
  return (
    <div>
      <form onSubmit={addTask}>
        <input type="text" onChange = {(e) => {setTask((e.target.value))}}/>
        <input type="submit" value="ADD"/>
      </form>
    </div>
  )
}

export default Form
