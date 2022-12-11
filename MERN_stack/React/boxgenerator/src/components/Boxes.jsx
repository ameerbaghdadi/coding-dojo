import React from 'react'

const Boxes = (props) => {

  return (
    <div style={{display: 'flex', flexWrap: 'wrap', marginTop: '20px'}}>
        {props.colorDisplay.map((color, i) => <div key = {i} style={{
            backgroundColor: color, 
            width: '100px', 
            height: '100px', 
            marginLeft: '20px',
            marginTop: '10px',
            }}></div>)}
    </div>
  )
}

export default Boxes
