import axios from 'axios';
import React from 'react'
import { Link } from 'react-router-dom';

const ProductsList = (props) => {
    const { products } = props;
    const { removeFromDom } = props;

    const deleteProduct = (productId) => {
        axios.delete('http://localhost:8000/api/products/delete/' + productId)
            .then(res => {
                removeFromDom(productId)
            })
            .catch(err => console.error(err));
    }
    return (
        <div>
            <h2>All Products:</h2>
            {products.map((item, i) =>
                <p key={i}>
                    <Link to={"/"+item._id}>{item.title}</Link>
                    <button style={{marginLeft: '20px'}} onClick={(e) => {deleteProduct(item._id)}}>
                        Delete
                    </button>
                </p>
            )}
        </div>
    )
}

export default ProductsList;