console.log("page loaded...");

var video = document.getElementById("myVideo");

function mouseOver() {
    video.play();
    video.muted = false;
}

function mouseOut() {
    video.pause();
    video.muted = true;
}