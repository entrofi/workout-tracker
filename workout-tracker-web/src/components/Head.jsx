
import React from 'react';
import {Link, Route, Switch} from 'react-router-dom';



const Head = () => (
    <div>
        <div className="top-bar">
            <div className="top-bar-left">
                <Link to="/">Workout Tracker</Link>
            </div>

            <div className="top-bar-right">
                <Link to="/login">Log in</Link>
                <Link to="/signup">Sign up</Link>
                <Link to="/exercises">Exercises</Link>
            </div>

        </div>
    </div>

);

export default Head;