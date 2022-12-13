import React from 'react'

const Routing = (props) => {
  return (
    <div>
        <h3 style={{backgroundColor: props.bgcolor}}>{isNaN(props.number)? 'The Word is:' : 'The Number is:'} <span style={{color: props.color}}>{props.number}</span></h3>
    </div>
  )
}

export default Routing
