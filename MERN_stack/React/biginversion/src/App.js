import logo from './logo.svg';
import './App.css';
import PersonCard from './components/PersonCard';

function App() {
  return (
    <div className="App">
      <>
        <PersonCard fname = "Ameer" lname = "Baghdadi" age = {20} hair = "red"/>
        <PersonCard fname = "Reina" lname = "Handal" age = {23} hair = "blue"/>
        <PersonCard fname = "Saeed" lname = "Qatanani" age = {22} hair = "black"/>
        <PersonCard fname = "Riyad" lname = "Bustami" age = {45} hair = "pink"/>
      </>
    </div>
  );
}

export default App;
