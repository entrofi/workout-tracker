import React from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';

import { BrowserRouter } from 'react-router-dom';

import Head from './Head.jsx';
import Main from './Main.jsx';

const Base = () => (
    <BrowserRouter>
        <MuiThemeProvider>
            <div>
                <Head/>
                <Main/>
            </div>
        </MuiThemeProvider>
    </BrowserRouter>
);


export default Base;