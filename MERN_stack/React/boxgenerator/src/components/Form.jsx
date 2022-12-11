import React, { useState } from 'react'

const Form = (props) => {

    

    const [color, setColor] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        props.newColor(color);
    }

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input type = "color" onChange={e=>setColor(color.concat(e.target.value))}/>
        <br></br>
        <input type= "submit" value="ADD"/>
      </form>
    </div>
  )
}

export default Form
