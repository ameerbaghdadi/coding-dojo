import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';

function App() {
  return (
    <div className="App">
      <>
        <Counter fname = "Ameer" lname = "Baghdadi" age = {20} hair = "red"/>
        <Counter fname = "Reina" lname = "Handal" age = {34} hair = "blue"/>
      </>
    </div>
  );
}

export default App;