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

    return (
        <div>
            <Form submitSuccess={addToDom}/>
            <hr/>
            {loaded && <ProductsList products={products}/>}
        </div>
    )
}
