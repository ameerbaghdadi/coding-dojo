import React from 'react'

const One = (props) => {
  return (
    <div>
      <h3>{isNaN(props.word)? 'The Word is:' : 'The Number is:'} <span>{props.word}</span></h3>
    </div>
  )
}

export default One
