import logo from './logo.svg';
import './App.css';
import Chat from './components/Chat';
import { useEffect, useState } from 'react';
import io from 'socket.io-client';

function App() {

  return (
    <div className="App">
      <Chat/>
    </div>
  );
}

export default App;
