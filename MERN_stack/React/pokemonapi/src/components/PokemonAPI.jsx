import React, { useEffect, useState } from 'react'

const PokemonAPI = () => {
    const [pokemon, setPokemon] = useState([]);
    const [status, setStatus] = useState(false);

    useEffect(() => {
        fetch('https://pokeapi.co/api/v2/pokemon/?limit=870&offset=20')
        .then(response => response.json())
        .then(response => setPokemon(response.results))
    }, []);

    const showPokemon = (e) => {
       console.log(e);
       setStatus(true);
    }

  return (
    <div>
      <h1>Hi</h1>
      <button onClick={showPokemon}>Fetch Pokemon</button>
      {status && pokemon.map((person, index)=>{
                return (<div key={index}>{person.name}</div>)
            })}
    </div>
  )
}

export default PokemonAPI
