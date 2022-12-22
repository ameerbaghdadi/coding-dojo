const express = require('express');
const cors = require('cors');
const { Socket } = require('socket.io');
const app = express();
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
const port = 8000;

const server = app.listen(8000, () => 
    console.log('the server is all fired up on port 8000')
);

const io = require('socket.io')(server, {cors: true});

io.on("connection", socket => {
    console.log("Nice To meet you.(shake hand)");
    socket.emit("connection", "Welcom to my server!");
});