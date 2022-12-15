import React, { useEffect, useState } from 'react'
import Select from 'react-select'

const Form = () => {
    const [people, setPeople] = useState([]);
    const [options, setOptions] = useState("");

    useEffect(() => {
        fetch('https://swapi.dev/api/people/1')
        .then(response => response.json())
        .then(response => setPeople(response.name))
    }, []);

    const selectType = (e) => {
        setOptions(e.target.value);
        console.log(options);
    }

    
const optionsyy = [
    { value: 'people', label: 'People' },
    { value: 'planets', label: 'Planets' },
  ]

    return (
    <div>
        <form>
            <label>Search for:</label>
            <select onClick={selectType}>
                <option>People</option>
                <option>Planets</option>
            </select>
        
            <label>ID:</label>
            <input type="number"/>
            <button>Search</button>
        </form>
        <Select options={optionsyy} />
        
    </div>
    )
}

export default Form
