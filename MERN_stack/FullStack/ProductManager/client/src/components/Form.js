import React, { useState } from 'react'
import axios from 'axios';

const Form = (props) => {
  
  const { onSubmitProp, submitSuccess, initialPrice, initialDescription, initialTitle } = props;
  const [title, setTitle] = useState(initialTitle);
  const [price, setPrice] = useState(initialPrice);
  const [description, setDescription] = useState(initialDescription);

  const onSubmitHandler = e => {
    e.preventDefault();
    // axios.post('http://localhost:8000/api/products/new', {
    //   title,
    //   price,
    //   description
    // })
    //   .then(res => submitSuccess(res.data))
    //   .catch(err => console.log(err))
    onSubmitProp({title, price, description});
  }

  return (
    <div>
      <form onSubmit={onSubmitHandler}>
        <p>
        <label>Title</label><br/>
        <input type="text" onChange={(e) => {setTitle(e.target.value)}} value={title}/>
        </p>

        <p>
        <label>Price</label><br/>
        <input type="number" onChange={(e) => {setPrice(e.target.value)}} value={price}/>
        </p>

        <p>
        <label>Description</label><br/>
        <input type="text" onChange={(e) => {setDescription(e.target.value)}} value={description}/>
        </p>
        <input type="submit" value="Submit"/>
      </form>
    </div>
  )
}

export default Form
