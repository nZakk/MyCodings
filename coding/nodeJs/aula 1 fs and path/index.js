const fs = require('fs').promises;
const path = require('path');

/*
The Fs module allows you to work with the file system on your computer.

fs.readfile()  read the file and return the content

fs.appendFile()  method appends specified content to a file.
If the file does not exist, the file will be created.

fs.open()  method takes a "flag" as the second argument, if the flag is "w" for "writing", the specified file is opened for writing.
 If the file does not exist, an empty file is created.

fs.writeFile()  method replaces the specified file and content if it exists.
If the file does not exist, a new file, containing the specified content,
 will be created.

fs.unlink()  method deletes the specified file.


fs.rename()  method renames the specified file.

Those are the main methods is Fs,but it has a lot more.

The Path module provides a way of working with directories and file paths
*/

async function readdir(rootDir) {
    rootDir = rootDir || path.resolve(__dirname);
    const files = await fs.readdir(rootDir);

    walk(files, rootDir);
}

async function walk(files, rootDir){
    for ( let file of files) {
        const fileFullPath = path.resolve(rootDir, file)
        const stats = await fs.stat(fileFullPath);

        if (stats.isDirectory()) {
            readdir(fileFullPath);
            continue;
        }

        console.log(fileFullPath);
    }
}

readdir('/home/isaac/coding');