import React, { useState } from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
import ShowAuthors from '../components/ShowAuthors';

const Home = (props) => {

  return (
    <div>
        <h1>Favorite Authors</h1>
        <Link to={'/new'}>Add an author</Link>
        <h3>We have quotes by:</h3>
        <ShowAuthors/>
    </div>
  )
}

export default Home
