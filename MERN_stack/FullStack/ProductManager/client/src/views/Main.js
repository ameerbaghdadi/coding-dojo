import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Form from '../components/Form';
import ProductsList from '../components/ProductsList';
import Detail from './Detail';

export default (props) => {
    
    const [products, setProducts] = useState([]);
    const [loaded, setLoaded] = useState(false);

    useEffect(() => {
        axios.get('http://localhost:8000/api/products')
            .then(res => {
                setProducts(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    }, []);

    const addToDom = (product) => {
        setProducts([...products, product]);
    }

    const removeFromDom = productId => {
        setProducts(products.filter(product => product._id != productId));
    }

    const createProduct = product => {
        axios.post('http://localhost:8000/api/products/new', product)
            .then(res => {
                setProducts([...products, res.data]);
            })
    }

    return (
        <div>
            <Form submitSuccess={addToDom} onSubmitProp={createProduct} initialTitle="" initialPrice="" initialDescription=""/>
            <hr/>
            {loaded && <ProductsList products={products} removeFromDom={removeFromDom}/>}
        </div>
    )
}
