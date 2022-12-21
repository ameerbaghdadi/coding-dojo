import React from 'react'

const Form = () => {
  return (
    <div>
      <form>
        <label>Title</label>
        <input type="text"/>

        <label>Price</label>
        <input type="number"/>

        <label>Description</label>
        <input type="text"/>

        <input type="submit" value="Create"/>
      </form>
    </div>
  )
}

export default Form
