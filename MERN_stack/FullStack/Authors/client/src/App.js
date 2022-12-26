import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Home from './views/Home';
import AddAuthor from './views/AddAuthor';
import EditAuthor from './views/EditAuthor';


function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/new' element={<AddAuthor/>}/>
        <Route path='/' element={<Home/>}/>
        <Route path='/edit/:id' element={<EditAuthor/>}/>
      </Routes>
    </div>
  );
}

export default App;
