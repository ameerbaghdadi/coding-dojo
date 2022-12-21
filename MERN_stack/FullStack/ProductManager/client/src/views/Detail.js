import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link, useParams } from 'react-router-dom';

const Detail = (props) => {

    const [oneProduct, setOneProduct] = useState({});
    const { id } = useParams();

    useEffect(() => {
        axios.get('http://localhost:8000/api/products/' +id)
            .then(res => setOneProduct(res.data))
            .catch(err => console.error(err))
    }, []);

  return (
    <div>
      <h1>Product Details:</h1>
      <p><Link to={'/'}>Home</Link></p>
      <p>Title: {oneProduct.title}</p>
      <p>Price: {oneProduct.price}</p>
      <p>Description: {oneProduct.description}</p>
      <p><Link to={"/products/" + oneProduct._id + "/edit"}>Edit</Link></p>
    </div>
  )
}

export default Detail
