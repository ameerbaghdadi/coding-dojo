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
    const [fNameError, setFNameError] = useState("");
    const [lNameError, setLNameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPasswordError, setConfirmPasswordError] = useState("");

    const firstName = (e) => {
        setFName(e.target.value);
        if(e.target.value.length < 2 && e.target.value.length > 0) {
            setFNameError("First Name must be 2 characters or longer!");
        }
        else {
            setFNameError("");
        }
    }

    const lastName = (e) => {
        setLName(e.target.value);
        if(e.target.value.length < 2 && e.target.value.length > 0) {
            setLNameError("Last Name must be 2 characters or longer!");
        }
        else {
            setLNameError("");
        }
    }

    const handleEmail = (e) => {
        setEmail(e.target.value);
        if(e.target.value.length < 5 && e.target.value.length > 0) {
            setEmailError("Email must be at least 5 characters!");
        }
        else {
            setEmailError("");
        }
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
        if(e.target.value.length < 8 && e.target.value.length > 0) {
            setPasswordError("Passwords must be at least 8 characters!");
        }
        else {
            setPasswordError("");
        }
    }

    const handleConfirmPassword = (e) => {
        setConfirmPassword(e.target.value);
        if(e.target.value.length < 8 && e.target.value.length > 0) {
            setConfirmPasswordError("Passwords must be at least 8 characters!");
        }
        else {
            setConfirmPasswordError("");
        }
    }

  return (
    <div>
      <form style={formStyle}>
        <label>First Name:</label>
        <input type="text" onChange={firstName}/>
        <p>{fNameError}</p>

        <label>Last Name:</label>
        <input type="text" onChange={lastName}/>
        <p>{lNameError}</p>
        
        <label>Email:</label>
        <input type="email" onChange={handleEmail}/>
        <p>{emailError}</p>

        <label>Password:</label>
        <input type="password" onChange={handlePassword}/>
        <p>{passwordError}</p>

        <label>Confirm Password:</label>
        <input type="password" onChange={handleConfirmPassword}/>
        <p>{confirmPasswordError}</p>

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
