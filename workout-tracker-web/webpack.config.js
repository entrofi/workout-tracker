

var webpack = require("webpack");
var path = require("path");

var SRC = path.resolve(__dirname, "src");
var OUTPUT = path.resolve(__dirname, "output");

var config = {
    entry: SRC + "/index.jsx",
    output: {
        path: OUTPUT,
        filename: "workouttracker.js"
    },
    module: {
        loaders: [
            {
                include: SRC,
                loader: "babel-loader",
            }
        ]
    }
};


module.exports = config;