import axios from 'axios';
import React, { useEffect, useState } from 'react'

const AxiosAPI = () => {
    const [pokemon, setPokemon] = useState([]);
    const [status, setStatus] = useState(false);

    useEffect(() => {
        axios.get('https://pokeapi.co/api/v2/pokemon/?limit=870&offset=20')
            .then(response => setPokemon(response.data.results))
    }, []);

    const showPokemon = () => {
       setStatus(true);
    }

  return (
    <div>
      <button onClick={showPokemon}>Fetch Pokemon</button>
      {status && pokemon.map((person, index)=>{
                return (<div key={index}>{person.name}</div>)
            })}
    </div>
  )
}

export default AxiosAPI
