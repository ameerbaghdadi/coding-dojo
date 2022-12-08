import React, {useState} from 'react'

const formStyle = {
    padding: '12px 15px',
    fontFamily: 'Arial, sans-serif',
    fontWeight: 'bold',
    background: 'linear-gradient(30deg, rebeccapurple, magenta)', 
    color: '#fff',
    border: 'none',
    width: '50%',
    display: 'flex',
    flexDirection: "column",
    marginLeft: '30%',
    marginTop: '10%',
};

const Hook = () => {

    const [fName, setFName] = useState("");
    const [lName, setLName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const firstName = (e) => {
        setFName(e.target.value);
    }

    const lastName = (e) => {
        setLName(e.target.value);
    }

    const handleEmail = (e) => {
        setEmail(e.target.value);
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
    }

    const handleConfirmPassword = (e) => {
        setConfirmPassword(e.target.value);
    }

  return (
    <div>
      <form style={formStyle}>
        <label>First Name:</label>
        <input type="text" onChange={firstName}/>

        <label>Last Name:</label>
        <input type="text" onChange={lastName}/>
        
        <label>Email:</label>
        <input type="email" onChange={handleEmail}/>

        <label>Password:</label>
        <input type="password" onChange={handlePassword}/>

        <label>Confirm Password:</label>
        <input type="password" onChange={handleConfirmPassword}/>
      </form>
        <h3>Your Form Data</h3>
        <p>First Name: {fName}</p>
        <p>Last Name: {lName}</p>
        <p>Email: {email}</p>
        <p>Password: {password}</p>
        <p>confirm Password: {confirmPassword}</p>
    </div>
  )
}

export default Hook
