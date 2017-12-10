import React from "react";
import ReactDOM from "react-dom";
import ReactCreateClass from "create-react-class";


var HelloWorld = ReactCreateClass({
    render: function() {
	return (
		<p>Hello, {this.props.greetTarget}!</p>
	);
    }
});


ReactDOM.render(
	<div>
	<HelloWorld greetTarget="Workout Tracker"/>
	</div>,
    document.querySelector("#container")
);
