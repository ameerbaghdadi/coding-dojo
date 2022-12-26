import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import DeleteButton from './DeleteButton';

const ShowAuthors = (props) => {

    const [authors, setAuthors] = useState([]);
    const [loaded, setLoaded] = useState(false);

    useEffect(() => {
        axios.get('http://localhost:8000/api/authors')
        .then(res => {
            setAuthors(res.data);
            setLoaded(true);
        })
        .catch(err => console.error(err));
    }, [])

    const removeFromDom = authorId => {
        setAuthors(authors.filter(author => author._id != authorId));
    }

  return (
    <div>
        <table border={1} style={{margin : "auto"}}>
            <tr>
                <th>Author</th>
                <th>Actions Available</th>
            </tr>
            {loaded && authors.map((author, i) => {
                return <tr key={i}>
                    <td>{author.name}</td>
                    <td>
                    <button><Link to={"/edit/" + author._id}>Edit</Link></button> <DeleteButton authorId={author._id} successCallback={() => removeFromDom(author._id)}/>
                    </td>
                </tr>
            })}
        </table>
    </div>
  )
}

export default ShowAuthors
