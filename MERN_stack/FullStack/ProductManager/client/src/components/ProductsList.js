import React from 'react'
import { Link } from 'react-router-dom';

const ProductsList = (props) => {
    const { products } = props;
    return (
        <div>
            <h2>All Products:</h2>
            {products.map((item, i) =>
                <p key={i}><Link to={"/"+item._id}>{item.title}</Link></p>
            )}
        </div>
    )
}

export default ProductsList;