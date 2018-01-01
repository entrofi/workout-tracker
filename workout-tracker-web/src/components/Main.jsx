
import React from 'react';
import {Route, Switch} from 'react-router-dom';



import HomePage from "./HomePage.jsx";
import LoginPage from "../containers/LoginPage.jsx";
import SignUpPage from "../containers/SignUpPage.jsx";


const Main = () => (
    <main>
        <Switch>
            <Route exact path='/' component={HomePage}/>
            <Route path='/login' component={LoginPage}/>
            <Route path='/signup' component={SignUpPage}/>
        </Switch>
    </main>
);

export default Main;
