import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import Form from '../components/Form';

const Update = (props) => {

    const { id } = useParams();
    const [title, setTitle] = useState('');
    const [price, setPrice] = useState('');
    const [description, setDescription] = useState('');
    

    useEffect(() => {
        axios.get('http://localhost:8000/api/products/' + id)
            .then(res => {
                setTitle(res.data.title);
                setPrice(res.data.price);
                setDescription(res.data.description);
            })
    }, []);

    const updateProduct = e =>{
        e.preventDefault();
        axios.put('http://localhost:8000/api/products/update/' + id, {
            title,
            price,
            description
        })
            .then(res => console.log(res))
            .catch(err => console.error(err));
    }

  return (
    <div>
      {/* <h1>Update a Product</h1>
      <p><Link to={'/'}>Home</Link></p>
      <form onSubmit={updateProduct}>
        <p>
            <label>Title</label>
            <input type="text"
                name="title"
                value={title}
                onChange={(e) => {setTitle(e.target.value)}}/>
        </p>

        <p>
            <label>Price</label>
            <input type="number"
                name="price"
                value={price}
                onChange={(e) => {setPrice(e.target.value)}}/>
        </p>

        <p>
            <label>Description</label>
            <input type="text"
                name="description"
                value={description}
                onChange={(e) => {setDescription(e.target.value)}}/>
        </p>

        <p>
            <input type="submit" value="Update"/>
        </p>
      </form> */}

      {/* <Form
        submitSuccess={updateProduct}
        initialTitle={title}
        initialPrice={price}
        initialDescription={description}
      /> */}
      <Form 
      onSubmitProp={updateProduct}
      initialTitle={title}
      initialPrice={price}
      initialDescription={description}
      />
      <p>{title}</p>
      <p>{price}</p>
      <p>{description}</p>
    </div>
  )
}

export default Update
