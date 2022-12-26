import axios from 'axios';
import React, { useState } from 'react'
import { Link } from 'react-router-dom';

const AuthorForm = (props) => {

  const { onSubmitProp, initialName, errors} = props;
  const [ name, setName ] = useState(initialName);

  const onSubmitHandler = (e) => {
    e.preventDefault();
    onSubmitProp({name});
  }

  return (
    <div>
      <form onSubmit={onSubmitHandler}>
        {errors.map((err, i) => <p key={i}>{err}</p>)}
        <p>
        <label>Name:</label><br/>
        <input type="text" onChange={(e) => setName(e.target.value)} value={name}/>
        </p>
        <input type="submit" value="Submit"/>
        <button><Link to={'/'}>Cancel</Link></button>    
        </form>
    </div>
  )
}

export default AuthorForm
