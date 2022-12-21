import logo from './logo.svg';
import './App.css';
import Form from './components/Form';
import Main from './views/Main';
import { Route, Routes } from 'react-router-dom';
import Detail from './views/Detail';
import Update from './views/Update';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<Main/>}/>
        <Route path='/:id' element={<Detail/>}/>
        <Route path='/products/:id/edit' element={<Update/>}/>
      </Routes>
    </div>
  );
}

export default App;