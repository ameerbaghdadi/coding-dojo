import React, { useState } from 'react'

const List = (props) => {
    const [isChecked, SetIsChecked] = useState(false);

    const [line, setLine] = useState([]);

    const handleChange = e => {
        console.log(e);
        if(e.target.checked) {
            console.log("ok checked");
            
        } else {
            console.log("hhhhhhhh");
        }
    }

    const deleteTask = (e) => {
        
        console.log(e.target);
    }

  return (
    <div>
        <h2>To Do List:</h2>
        <ul>
        {props.allTasks.map((item, i) => <div  key = {i} >  
        <li style={(isChecked) ? {textDecoration: 'lineThtough'} : {textDecoration: 'none'}}>{item}</li>
        <input type="checkbox" id="scales" name="scales" onChange={handleChange}/>
        <button onClick={deleteTask}>Delete</button>
        </div>)}
        <p></p>
        </ul>
    </div>
  )
}

export default List
