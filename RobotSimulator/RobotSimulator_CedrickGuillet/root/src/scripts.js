function goUp() {
    var robot = document.getElementById("robot");
    var position = robot.offsetTop;
    robot.style.top = (parseInt(position) - 10) + "px";
}

function goLeft() {
    var robot = document.getElementById("robot");
    var position = robot.offsetLeft;
    robot.style.left = (parseInt(position) - 10) + "px";
}

function goRight() {
    var robot = document.getElementById("robot");
    var position = robot.offsetLeft;
    robot.style.left = (parseInt(position) + 10) + "px";
}

function goDown() {
    var robot = document.getElementById("robot");
    var position = robot.offsetTop;
    if ((parseInt(position) + 10) <= getDivSize("vertical")){
        robot.style.top = (parseInt(position) + 10) + "px";
    }
}

function getDivSize(border){
    var arena = document.getElementById("arenaRobot");
    switch(border) {
        case "horizontal" :
            return arena.offsetWidth;
        case "vertical" :
            return arena.offsetHeight;
    }
    
}