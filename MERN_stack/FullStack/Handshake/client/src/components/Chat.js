import React, { useEffect, useState } from 'react'
import { io } from 'socket.io-client';

const Chat = () => {

    const [socket] = useState(() => io(':8000'));

    useEffect(()=> {
        socket.on("connection", data => console.log(data));
    })

  return (
    <div>
      <h1>Chat</h1>
    </div>
  )
}

export default Chat
