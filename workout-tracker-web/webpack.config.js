
var webpack = require("webpack");
var path = require("path");

var SRC = path.resolve(__dirname, "src");
var OUTPUT = path.resolve(__dirname, "dist/js");


module.exports = {
    //entry file for the bundle
    entry: [
        SRC + '/workouttracker.jsx',
        SRC + '/css/style.less'
    ],
    //bundle file we will get in the result
    output: {
        path: OUTPUT,
        filename: 'workouttracker.js'
    },

    module: {
        //apply loaders to files that meet given conditions (i.e. tell babel is our transpiler for jsx

        rules: [
            {
                test: /\.less$/,
                include: SRC,
                use: [{
                    loader: "style-loader" // creates style nodes from JS strings
                }, {
                    loader: "css-loader" // translates CSS into CommonJS
                }, {
                    loader: "less-loader" // compiles Less to CSS
                }]
            },
            {
                test: /\.jsx?$/,
                include: SRC,
                use: [{
                    loader: 'babel-loader',
                    query: {
                        presets: ['react', 'env']
                    }
                }]
            }
        ]
    },

    watch: true
}