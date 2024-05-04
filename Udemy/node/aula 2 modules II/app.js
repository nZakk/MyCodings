const path = require('path');

//console.log(__filename); //curr file

//console.log(__dirname); // curr directory (absolute path)

console.log(path.resolve(__dirname, '..', '..', '..', 'destinationDir'));
//this method its useful when you don't know which sistem your's application
//is running(windows, Linux, MacOs) that can change how to wright a dir path.
// What it does, it resolves the path for you and return it, simple put the dirr you 
// want as reference and your steps to your destination.