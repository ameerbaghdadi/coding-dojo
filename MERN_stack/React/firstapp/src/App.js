import logo from './logo.svg';
import './App.css';
import Header from './components/Header';

function App() {
  return (
    <div className="App">
      <>
        <Header fname = "Ameer" lname = "Baghdadi" age = {20} hair = "red"/>
        <Header fname = "Reina" lname = "Handal" age = {34} hair = "blue"/>
        <Header fname = "Saeed" lname = "Qatanani" age = {22} hair = "black"/>
        <Header fname = "Riyad" lname = "Bustami" age = {45} hair = "pink"/>
      </>
    </div>
  );
}

export default App;
