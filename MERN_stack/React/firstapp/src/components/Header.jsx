import React from 'react'

const Header = (props) => {
  return (
    <div>
      <h1>{props.fname}, {props.lname}</h1>
      <p>Age: {props.age}</p>
      <p>Hair Color: {props.hair}</p>
    </div>
  )
}

export default Header
